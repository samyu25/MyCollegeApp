package com.example.myskasc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GalleryActivity extends AppCompatActivity {
   // Toolbar toolbar;
    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.photos);
        s2 = getResources().getStringArray(R.array.description);
        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       // toolbar = findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
    }
}
