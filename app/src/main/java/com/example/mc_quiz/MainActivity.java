package com.example.mc_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view_s;
        Intent intent = getIntent();
        view_s=findViewById(R.id.score_total);
        view_s.setText(intent.getStringExtra("score"));
        Button button = findViewById(R.id.repository);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String url="https://github.com/abdullahkhalil08/MC_quiz";
                Uri repository = Uri.parse(url);
                Intent intent = new
                        Intent(Intent.ACTION_VIEW, repository);
                startActivity(intent);
            }
        });
        Button Prac =findViewById(R.id.practice);
        Prac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Practice.class);
                startActivity(intent);

            }
        });
        Button attempt =findViewById(R.id.attempt);
        attempt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, quiz_attempt.class);
                startActivity(intent);

            }
        });

    }

}