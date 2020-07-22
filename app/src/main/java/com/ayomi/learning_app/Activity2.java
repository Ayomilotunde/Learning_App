package com.ayomi.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

    public void send(View view) {
        EditText editText = findViewById(R.id.testedt);
        String testmessage = editText.getText().toString();

        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("testmsg", testmessage);
        startActivity(intent);

    }
}