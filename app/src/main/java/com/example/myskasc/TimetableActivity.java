package com.example.myskasc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TimetableActivity extends AppCompatActivity {
   TextView T1,T2,T3,T4,T5,T6;
    //Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        //toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        T1 = findViewById(R.id.I);
        T2 = findViewById(R.id.II);
        T3 = findViewById(R.id.III);
        T4 = findViewById(R.id.IV);
        T5 = findViewById(R.id.V);
        T6 = findViewById(R.id.VI);

        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimetableActivity.this, DayIActivity.class);
                startActivity(i);
            }
        });
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimetableActivity.this, DayIIActivity.class);
                startActivity(i);
            }
        });
        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimetableActivity.this, DayIIIActivity.class);
                startActivity(i);
            }
        });
        T4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimetableActivity.this, DayIVActivity.class);
                startActivity(i);
            }
        });
        T5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimetableActivity.this, DayVActivity.class);
                startActivity(i);
            }
        });
        T6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimetableActivity.this, DayVIActivity.class);
                startActivity(i);
            }
        });
    }
}
