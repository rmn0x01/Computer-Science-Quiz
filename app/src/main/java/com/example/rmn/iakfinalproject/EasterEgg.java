package com.example.rmn.iakfinalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasterEgg extends AppCompatActivity {

    Button homeButton,sanfoundryButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easter_egg);
        homeButton = (Button) findViewById(R.id.menuButton2);
        sanfoundryButton = (Button) findViewById(R.id.sanfoundryButton);

        sanfoundryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.sanfoundry.com/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EasterEgg.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
