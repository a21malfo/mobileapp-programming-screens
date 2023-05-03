package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        Button goforward = findViewById(R.id.goforward);
        goforward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SCREEN2" , "Start ThirdActivity");

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("name", "GOOD CHOICE! ALWAYS GO FORWARD!");
                startActivity(intent);
            }
        });
    }
}
