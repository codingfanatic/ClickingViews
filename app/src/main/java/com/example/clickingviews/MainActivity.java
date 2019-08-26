package com.example.clickingviews;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonBlue;
    LinearLayout layout;
    TextView textViewRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRed = findViewById(R.id.redTextView);
        buttonBlue = findViewById(R.id.blueButton);
        layout = findViewById(R.id.myLayout);

        textViewRed.setOnClickListener(new View.OnClickListener(){
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
