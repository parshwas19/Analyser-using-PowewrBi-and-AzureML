package com.example.camera;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int CameraPermissionCode = 101;
    public static final int CamReqCode = 102;
    ImageView imageSelected;
    Button camBtn,uploadBtn;
    public static Bitmap var1;
    public static final String key = "image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSelected= findViewById(R.id.displayImage);
        camBtn= findViewById(R.id.Camera);
        uploadBtn = findViewById(R.id.UploadImg);
        camBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askPermission();
            }
        });
        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Upload.class);
//                intent.putExtra(key, R.drawable.imageSelected);
                startActivity(intent);
            }
        });



        }

    private void askPermission() {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, CameraPermissionCode);
        }
        else{
            openCam();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == CameraPermissionCode){
            if(grantResults.length> 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

              openCam();
            }
            else{
                Toast.makeText(this, "Camera Permission required", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void openCam() {
        Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cam, CamReqCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == CamReqCode){
            Bitmap img = (Bitmap) data.getExtras().get("data");
            System.out.println((data.getExtras().get("data")).getClass());
            var1 = img;
            imageSelected.setImageBitmap(img);

        }

    }


}

