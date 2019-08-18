package com.example.clickingviews;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button buttonRed, buttonBlue;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = findViewById(R.id.redButton);
        buttonBlue = findViewById(R.id.blueButton);
        layout = findViewById(R.id.myLayout);

        buttonRed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                layout.setBackgroundColor(Color.RED);
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                layout.setBackgroundColor(Color.BLUE);
            }
        });


    }
}
