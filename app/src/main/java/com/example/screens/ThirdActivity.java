package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        String name = "tomten";

        Intent intent = getIntent();
        if (intent != null) {
            name = intent.getStringExtra("name");
        }

        TextView text3 = findViewById(R.id.text3);
        text3.setText(name);
    }
}