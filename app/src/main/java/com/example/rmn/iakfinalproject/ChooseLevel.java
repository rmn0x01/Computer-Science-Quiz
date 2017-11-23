package com.example.rmn.iakfinalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLevel extends AppCompatActivity {
    Button btnlevel1, btnlevel2, btnlevel3, btnlevel4, btnlevel5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        btnlevel1 = (Button) findViewById(R.id.btnlevel1);
        btnlevel2 = (Button) findViewById(R.id.btnlevel2);
        btnlevel3 = (Button) findViewById(R.id.btnlevel3);
        btnlevel4 = (Button) findViewById(R.id.btnlevel4);
        btnlevel5 = (Button) findViewById(R.id.btnlevel5);

        btnlevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lvl = 1;
                Intent i= new Intent(ChooseLevel.this, MultipleChoice.class);
                i.putExtra("getLevel",lvl);
                startActivity(i);
            }
        });
        btnlevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lvl = 2;
                Intent i= new Intent(ChooseLevel.this, MultipleChoice.class);
                i.putExtra("getLevel",lvl);
                startActivity(i);
            }
        });
        btnlevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lvl = 3;
                Intent i= new Intent(ChooseLevel.this, MultipleChoice.class);
                i.putExtra("getLevel",lvl);
                startActivity(i);
            }
        });
        btnlevel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lvl = 4;
                Intent i= new Intent(ChooseLevel.this, MultipleChoice.class);
                i.putExtra("getLevel",lvl);
                startActivity(i);
            }
        });
        btnlevel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lvl = 5;
                Intent i= new Intent(ChooseLevel.this, MultipleChoice.class);
                i.putExtra("getLevel",lvl);
                startActivity(i);
            }
        });

    }
}
