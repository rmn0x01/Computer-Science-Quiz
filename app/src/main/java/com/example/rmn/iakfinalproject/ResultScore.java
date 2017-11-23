package com.example.rmn.iakfinalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultScore extends AppCompatActivity {

    TextView viewResultScore;
    Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_score);

        viewResultScore = (TextView) findViewById(R.id.resultScore);
        menuButton = (Button) findViewById(R.id.menuButton);

        setScore();

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ResultScore.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void setScore(){
        String resultScore = getIntent().getStringExtra("Final Score");
        viewResultScore.setText(resultScore);
    }

    public void onBackPressed(){
        Toast.makeText(this, "Press Home Button", Toast.LENGTH_SHORT).show();
    }
}
