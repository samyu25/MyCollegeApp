package com.example.myskasc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ExamActivity extends AppCompatActivity {
    TextView dia;
   // Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
       // toolbar = findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        dia = findViewById(R.id.DIA);
        dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ExamActivity.this, DiaActivity.class);
                startActivity(i);
            }
        });
    }
}
