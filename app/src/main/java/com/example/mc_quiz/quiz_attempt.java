package com.example.mc_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class quiz_attempt extends AppCompatActivity {

    String[] quest={"أ ہ","ع ح","غ خ","ق","ک" ,"ض" ,"ل" ,"ن" ,"ر" ,"ت د ط","ن"};
    String[] ans={"End of Throat","Middle of Throat","Start of the Throat","Base of Tongue which is near Uvula touching the mouth roof","Portion of Tongue near its base touching the roof of mouth", "One side of the tongue touching the molar teeth","Rounded tip of the tongue touching the base of the frontal 8 teeth","Rounded tip of the tongue touching the base of the frontal 6 teeth","Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth" ,"Tip of the tongue touching the base of the front 2 teeth"};


    TextView t1,score_quiz;
    Button r1,r2,r3,r4;
    int score=0 , i=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_attempt);
        generate_question();
        r1 = findViewById(R.id.opt1);
        r1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && r1.getText().toString().equals(ans[i])) {
                    score++;


                }else if (i==9)
                {
                    score_quiz=findViewById(R.id.question);
                    score_quiz.setText("your Score is :"+score);

                    Intent intent = new Intent(quiz_attempt.this, MainActivity.class);
                    intent.putExtra("score", "your Score is :"+score);
                    startActivity(intent);


                }
                i++;
                generate_question();

            }
        });
        r2 = findViewById(R.id.opt2);
        r2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && r2.getText().toString().equals(ans[i])) {
                    score++;

                }else if (i==9)
                {

                    Intent intent = new Intent(quiz_attempt.this, MainActivity.class);
                    intent.putExtra("score", "your Score is :"+score);
                    startActivity(intent);

                }
                i++;
                generate_question();

            }
        });
        r3 = findViewById(R.id.opt3);
        r3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && r3.getText().toString().equals(ans[i])) {
                    score++;


                }else if (i==9)
                {
                    Intent intent = new Intent(quiz_attempt.this, MainActivity.class);
                    intent.putExtra("score", "your Score is :"+score);
                    startActivity(intent);

                }
                i++;
                generate_question();

            }
        });


        r4 = findViewById(R.id.opt4);
        r4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && r1.getText().toString()!=ans[i] && r2.getText().toString()!=ans[i] && r3.getText().toString()!=ans[i]) {
                    score++;

                }else if (i==9)
                {
                    Intent intent = new Intent(quiz_attempt.this, MainActivity.class);
                    intent.putExtra("score", "your Score is :"+score);
                    startActivity(intent);


                }
                i++;
                generate_question();
            }
        });



    }

    public void generate_question()
    {
        if(i<10) {
            t1 = findViewById(R.id.question);
            r1 = findViewById(R.id.opt1);
            r2 = findViewById(R.id.opt2);
            r3 = findViewById(R.id.opt3);
            r4 = findViewById(R.id.opt4);
            r4.setText("None of above");
            int ansL = ans.length;
            Random r = new Random();
            int i1 = r.nextInt(ansL - 0) + 0;
            t1.setText(quest[i]);
            r1.setText(ans[i1]);
            i1 = r.nextInt(ansL - 0) + 0;
            r2.setText(ans[i1]);
            i1 = r.nextInt(ansL - 0) + 0;
            r3.setText(ans[i1]);
        }
    }
    @Override

    protected void onStart() {

        super.onStart();

        Log.d("TAG", "onStart Activity Main");

    }

    @Override

    protected void onResume() {

        super. onResume();

        Log.d("TAG", " onResume Activity Main");

    }

    @Override

    protected void onPause() {

        super. onPause();

        Log.d("TAG", " onPause Activity Main");

    }

    @Override

    protected void onStop() {

        super. onStop();

        Log.d("TAG", " onStop Activity Main");

    }

    @Override

    protected void onDestroy() {

        super. onDestroy();

        Log.d("TAG", " onDestroy Activity Main");

    }





}