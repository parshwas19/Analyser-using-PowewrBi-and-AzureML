package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Upload extends AppCompatActivity {
    private ImageView imageV;
    Bitmap var2 = MainActivity.var1;
    TextInputLayout textInputLayout;
    AutoCompleteTextView autoCompleteTextView;
    Button confirmBtn;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        imageV = findViewById(R.id.imageView);

        Intent intent = getIntent();

        imageV.setImageBitmap(var2);

        textInputLayout = findViewById(R.id.menu);
        autoCompleteTextView = findViewById(R.id.drop_item);
        textView = findViewById(R.id.itemSelected);
        String [] items= {"Abstract", "Agriculture", "Business", "Environment", "Nature", "Animal", "Sport", "News", "Science", "Wildlife", "Other"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(Upload.this, R.layout.items_list, items);
        autoCompleteTextView.setAdapter(itemAdapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText((String)parent.getItemAtPosition(position));
            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}