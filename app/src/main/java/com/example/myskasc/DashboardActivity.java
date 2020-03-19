


package com.example.myskasc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class DashboardActivity extends AppCompatActivity {
    ImageButton profile, gallery, timetable, exam, calender, circular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        profile = findViewById(R.id.imageButton2);
        gallery = findViewById(R.id.imageButton7);
        timetable = findViewById(R.id.imageButton3);
        exam = findViewById(R.id.imageButton4);
        calender = findViewById(R.id.imageButton5);
        circular = findViewById(R.id.imageButton6);


        profile.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, ProfileActivity.class);
            startActivity(i);
        });
        gallery.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, GalleryActivity.class);
            startActivity(i);
        });
        exam.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, ExamActivity.class);
            startActivity(i);
        });
        timetable.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, TimetableActivity.class);
            startActivity(i);
        });
        calender.setOnClickListener(v -> {
            Intent i = new Intent(DashboardActivity.this, CalenderActivity.class);
            startActivity(i);
        });
        circular.setOnClickListener(v -> {

            Intent i = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(i);


        });


    }
}