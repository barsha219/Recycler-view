package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Bhutan, UK, India, pakistan, america ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Countries");

        Bhutan = findViewById(R.id.Bhutan);
        UK = findViewById(R.id.UK);
        India = findViewById(R.id.India);
        pakistan = findViewById(R.id.pakistan);
        america = findViewById(R.id.america);

        Bhutan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, bhutan.class);
                startActivity(i);
            }
        });
        UK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, uk.class);
                startActivity(i);
            }
        });
        India.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, India.class);
                startActivity(i);
            }
        });
        pakistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, pakistan.class);
                startActivity(i);
            }
        });
        america.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, usa.class);
                startActivity(i);
            }
        });
    }
}