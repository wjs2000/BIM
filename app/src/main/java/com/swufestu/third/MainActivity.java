package com.swufestu.third;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public  void  ButtonClick(View v){
        EditText editHeight = (EditText)findViewById(R.id.height);
        EditText editWeidth = (EditText)findViewById(R.id.weight);
        TextView txtResault = (TextView)findViewById(R.id.txt);
        Double height = Double.parseDouble(editHeight.getText().toString());
        Double weight = Double.parseDouble(editWeidth.getText().toString());
        Double bmi = weight / (height*height);
        DecimalFormat    df   = new DecimalFormat("######0.00");

        if(bmi<18.5){
                txtResault.setText("BMI"+df.format(bmi)+",您的体重偏轻");
            }
            else  if(bmi<=24.9){
                txtResault.setText("BMI"+df.format(bmi)+",您的体重正常");
            }
            else if(bmi<=29.9){
                txtResault.setText("BMI"+df.format(bmi)+",您的体重偏重");
            }
            else if (bmi<=34.9){
                txtResault.setText("BMI"+df.format(bmi)+",您的体重肥胖!!!");
            }
            else if (bmi<=39.9){
                txtResault.setText("BMI"+df.format(bmi)+",您的体重过于肥胖!");
            }
            else {
                txtResault.setText("BMI"+df.format(bmi)+",您的体重严重肥胖!");
            }
        }

}