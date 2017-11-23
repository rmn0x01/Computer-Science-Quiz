package com.example.rmn.iakfinalproject;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity{
    Button startButton;
    ImageView easter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        easter = (ImageView) findViewById(R.id.questionmark2);
        startButton = (Button) findViewById(R.id.start_button);

        easter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               Intent i = new Intent(MainActivity.this, EasterEgg.class);
                startActivity(i);
            }

        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i= new Intent(MainActivity.this, ChooseLevel.class);
                    startActivity(i);
            }
        });

    }

}
