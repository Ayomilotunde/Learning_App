package com.ayomi.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Intent intent = getIntent();
        String testmessage = intent.getStringExtra("testmsg");
        TextView textView = findViewById(R.id.txt_display);
        textView.setText(testmessage);
    }
}