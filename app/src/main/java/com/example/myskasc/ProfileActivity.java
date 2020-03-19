package com.example.myskasc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.usage.UsageEvents;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class ProfileActivity extends AppCompatActivity {
    TextView fullname,rollno,phoneno;
    //Toolbar toolbar;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

       // toolbar = findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        fullname = findViewById(R.id.fullname);
        rollno = findViewById(R.id.rollno);
        phoneno = findViewById(R.id.phoneno);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        userId = fAuth.getCurrentUser().getUid();
        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this,new EventListener<DocumentSnapshot>(){
        @Override
        public void onEvent(@Nullable DocumentSnapshot documentSnapshot,@Nullable FirebaseFirestoreException e){
            phoneno.setText(documentSnapshot.getString("Phone Number"));
            rollno.setText(documentSnapshot.getString("Roll Number"));
            fullname.setText(documentSnapshot.getString("Name"));
        }
    });
}
}

