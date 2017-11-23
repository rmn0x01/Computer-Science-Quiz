package com.example.rmn.iakfinalproject;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MultipleChoice extends AppCompatActivity {

    TextView currentScore, currentQuestion, currentCategory, currentLife;
    RadioGroup optionList;
    RadioButton optionList1, optionList2, optionList3;
    Button submitButton;

    int score = 0;
    int arr;
    int x;
    int lvl;
    int life = 5;
    int random;
    String totalScore;
    String answer;

    QuestionList  questionList = new QuestionList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);
        currentCategory = (TextView) findViewById(R.id.currentCategory);
        currentScore = (TextView) findViewById(R.id.currentScore);
        currentQuestion = (TextView) findViewById(R.id.currentQuestion);
        optionList = (RadioGroup) findViewById(R.id.optionList);
        optionList1 = (RadioButton) findViewById(R.id.optionList1);
        optionList2 = (RadioButton) findViewById(R.id.optionList2);
        optionList3 = (RadioButton) findViewById(R.id.optionList3);
        submitButton = (Button) findViewById(R.id.submitButton);
        currentLife = (TextView) findViewById(R.id.currentLife);


        currentScore.setText(""+score);
        currentLife.setText(""+life);
        setContent();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              answerCheck();
            }
        });
    }

    public void setContent(){
        random = new Random().nextInt(questionList.question.length);
        optionList.clearCheck();
        lvl = getIntent().getIntExtra("getLevel",0);
        lvl *=5;
        totalScore = ("" + lvl*10);
//        arr = questionList.question.length;
        if(life==0){
            String finalScore = "You failed";
            Intent i = new Intent(MultipleChoice.this, ResultScore.class);
            i.putExtra("Final Score", finalScore);
            startActivity(i);
        } else if (x >= lvl){
            String finalScore = ("Score: "+String.valueOf(score));
            finalScore = (finalScore + " Out Of " + totalScore);
            Intent i = new Intent(MultipleChoice.this, ResultScore.class);
            i.putExtra("Final Score", finalScore);
            startActivity(i);
        } else {
            currentCategory.setText(questionList.getCategory(random));
            currentQuestion.setText(questionList.getQuestion(random));
            optionList1.setText(questionList.getOption1(random));
            optionList2.setText(questionList.getOption2(random));
            optionList3.setText(questionList.getOption3(random));
            answer = questionList.getAnswer(random);
        }
        x++;
    }

    public void answerCheck() {
        if (optionList1.isChecked()) {
            if (optionList1.getText().toString().equals(answer)) {
                score += 10;
                currentScore.setText("" + score);
                currentLife.setText(""+life);
                Toast.makeText(this, "Correct, +10", Toast.LENGTH_SHORT).show();
                setContent();
            } else {
                life -=1;
                currentScore.setText("" + score);
                currentLife.setText(""+life);
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
                setContent();
            }
        } else if (optionList2.isChecked()) {
            if (optionList2.getText().toString().equals(answer)) {
                score += 10;
                currentScore.setText("" + score);
                currentLife.setText(""+life);
                Toast.makeText(this, "Correct, +10", Toast.LENGTH_SHORT).show();
                setContent();
            } else {
                life -=1;
                currentScore.setText("" + score);
                currentLife.setText(""+life);
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
                setContent();
            }
        } else if (optionList3.isChecked()) {
            if (optionList3.getText().toString().equals(answer)) {
                score += 10;
                currentScore.setText("" + score);
                currentLife.setText(""+life);
                Toast.makeText(this, "Correct, +10", Toast.LENGTH_SHORT).show();
                setContent();
            } else {
                life -=1;
                currentScore.setText("" + score);
                currentLife.setText(""+life);
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
                setContent();
            }
        } else {
            Toast.makeText(this, "Choose your answer first!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        Toast.makeText(this,"Finish the game first!",Toast.LENGTH_SHORT).show();
    }

    public void homeButton(View view) {
        Intent i = new Intent(MultipleChoice.this,MainActivity.class);
        startActivity(i);
    }
}