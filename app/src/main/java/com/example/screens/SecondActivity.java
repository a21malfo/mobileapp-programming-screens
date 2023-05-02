package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button goback = findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("SCREEN2", "goback");
                finish();
            }
        });
    }
}