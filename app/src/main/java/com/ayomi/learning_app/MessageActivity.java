package com.ayomi.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView textView = findViewById(R.id.txt_display_message);
        textView.setText(message);

        Log.d("Message Activity Lifecycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message Activity Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message Activity Lifecycle", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message Activity Lifecycle", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Message Activity Lifecycle", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Message Activity Lifecycle", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message Activity Lifecycle", "onRestart");
    }

}