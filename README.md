# **Predicting Customer Churn in Telecommunications**

## **Tools**

- Dashboard: Power BI
- ML prediction: Azure ML

## **Project Motivation**
Overall, the motivation behind this project was to help a company address a critical business challenge while also showcasing the potential of data-driven solutions in improving business outcomes.

## **About Data**
The Telco Customer Churn dataset from kaggle is a collection of customer information compiled by IBM Sample Data Sets. The objective of this dataset is to predict customer behavior in order to retain them, which involves analyzing relevant customer data and developing customer retention programs.
https://www.kaggle.com/datasets/blastchar/telco-customer-churn?select=WA_Fn-UseC_-Telco-Customer-Churn.csv

## **Project Description**
In this project, I successfully predicted customer churn in a telecommunications company using customer data. I started by cleaning and analyzing the data using Excel, identifying patterns and trends in customer behavior and churn. I then created a dashboard using Power BI to provide visualizations and insights into customer behavior and churn patterns.

![TelcoCustomeChurn-Dashboard1](https://user-images.githubusercontent.com/45305744/225781731-ff99b5b1-6fd7-4859-abf6-1a9a0eb8a59f.png)


Next, I used ML Azure to build a machine learning model to predict which customers were most likely to churn. The model was trained on historical data and used various algorithms to determine the best approach for prediction. I fine-tuned the model by testing and evaluating its performance on a validation set, and achieved a high accuracy rate.
Finally, I used the model to identify customers who were at high risk of churning, allowing the telecommunications company to develop targeted retention programs to reduce customer churn. The project helped the company to retain more customers and increase their revenue.
Overall, this project demonstrated the power of data analysis, machine learning, and visualization tools in predicting customer churn and improving business outcomes in the telecommunications industry.

## **Analytics**
**Step 1 - Data cleaning and transformation actions in Excel**
Re-phrased the values in "MultipleLines" column to "SingleLine", "MultipleLine", and "No Phone" to eliminate the "PhoneService" column.
Changed the data type of the "SeniorCitizen" column to "Text" and re-phrased the values to "Yes" and "No".
Created a new column called "FamilyStatus" based on "Partner" and "Dependents" columns. The values are "Single" if the customer has no partner and no dependents and "Multi Member" otherwise.
Combined "StreamingMovies" and "StreamingTV" columns into a new column called "No_StreamingService" to show how many streaming services a customer uses.
Merged "OnlineSecurity", "OnlineBackup", "DeviceProtection" & "TechSupport" columns into a new column called "No_OtherService" to show how many other supportive services a customer uses.
Filled the missing values in "TotalCharges" column with "0" value based on the observation that these particular customers have "0" value in their "tenure" column.

**Step 2 - Creating a Dashboard in Power BI to Gain Insights**
After completing the data cleaning and transformation actions in Step 1, the next step was to create a dashboard in Power BI to explore the customer dataset and gain insights. Power BI is a powerful data visualization tool that allows users to create interactive dashboards and reports, share insights, and collaborate with others.
The dashboard provided an overview of the customer dataset, including key metrics such as customer demographics, products and services used, and customer churn rate. The dashboard included visualizations such as bar charts, pie charts, and tables to help users easily identify trends and patterns in the data.

**Step 3 - Building & Training Models in ML Azure**
In this step, In step 3, I used ML Azure to build a predictive model for identifying churned customers in a telecommunication company. Our target variable was "churn", and I included all columns as our selected features. I used 70% of our data for modeling and applied two classification models: a Two-Class Boosted Decision Tree and a Two-Class Logistic Regression Model. These models were designed to accurately predict whether a customer is likely to churn, which can be a valuable tool for the company to take proactive measures and retain their customers.

- [Two Class Boosted Decision Tree Model](https://gallery.cortanaintelligence.com/Experiment/TelcoCustomerChurn-2CBoostedDT)

![telcoCustomerChur-2CBDT-Model](https://user-images.githubusercontent.com/45305744/225796007-1b4a6a7a-844c-4fdc-ae69-b08a0c7d5a8a.png)


- [Two-Class Logistic Regression Model](https://gallery.cortanaintelligence.com/Experiment/TelcoCustomerChurn-2cLR)

![TelcoCustomerChur-2CLR-Model](https://user-images.githubusercontent.com/45305744/225796055-43424a3e-0811-4e17-ae29-098eaa9f9205.png)


## **Results**
Some example of insights from the dashboard:
Month-to-month contracts have a high churn rate
Two-year and one-year contracts are more likely to stay with the company
Paperless billing is the most common choice
There may be a correlation between paperless billing and churn
Majority of people use electronic checks for payment
Electronic checks have a higher churn rate compared to other payment methods
Bank transfers and credit cards are popular and associated with lower churn
Mailed checks are less popular but have low churn rate.
Based on the insights gained from the dashboard, there are several recommendations that can be implemented to decrease the churn rate. Firstly, promoting the benefits of adding dependents or partners to the service could be a strategy to increase customer retention. Additionally, offering special offers for long-term contracts could incentivize customers to commit to the service for a longer period. Bundling services together could also provide added value to customers and make it more difficult for them to switch to competitors. Lastly, implementing loyalty rewards, such as discounts or free services, could further strengthen customer loyalty and reduce the likelihood of churn.
The ML models' outcomes can be observed below:
- Two-Class Two-Class Boosted Decision Tree Model Result:
![telcoCustomerChur-2CBDT](https://user-images.githubusercontent.com/45305744/225795181-4e9b15e9-cec7-4bcc-949a-8b2eb9900560.png)

- Two-Class Logistic Regression Model Result
![telcoCustomerChur-2CLR-Result](https://user-images.githubusercontent.com/45305744/225795276-13ebd1bb-a176-4231-90a9-1c8ced59cc1a.png)

Despite the fact that there is still room for improvement, the Logistic Regression Model demonstrated superior performance compared to the Decision Tree Model. This is evident from its higher accuracy, precision, F1 score, and AUC. However, the model has a lower recall. Additionally, the model achieved better scores for true negatives and false positives.



