package com.example.traffic_light;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickRedButton (View view){
        LinearLayout bd = findViewById(R.id.txt_counter);
        bd.setBackgroundColor(Color.RED);
    }
    public void onClickYellowButton (View view){
        LinearLayout bd = findViewById(R.id.txt_counter);
        bd.setBackgroundColor(Color.YELLOW);
    }
    public void onClickGreenButton (View view){
        LinearLayout bd = findViewById(R.id.txt_counter);
        bd.setBackgroundColor(Color.GREEN);
    }
}
