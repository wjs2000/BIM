package com.swufestu.third;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView ShowScore;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ShowScore = (TextView) findViewById(R.id.ShowScore);
    }
    public void click(View btn) {

        if(btn.getId()==R.id.score3){
            score+=3;
        }else if(btn.getId() == R.id.score2){
            score+=2;
        }else{
            score++;
        }
        ShowScore.setText(String.valueOf(score));
        if(btn.getId()==R.id.reset){
            score=0;
            ShowScore.setText(String.valueOf(0));
        }
    }
}