package com.example.mateuszwisnik.webserviceclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final String apiEndpoint = "https://jsonplaceholder.typicode.com/posts";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGetActivity = findViewById(R.id.buttonGetActivity);
        Button buttonPostActivity = findViewById(R.id.buttonPostActivity);
        Button buttonPutActivity = findViewById(R.id.buttonPutActivity);
        Button buttonDeleteActivity = findViewById(R.id.buttonDeleteActivity);

        buttonGetActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GetActivity.class);
                startActivity(intent);
            }
        });

        buttonPostActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PostActivity.class);
                startActivity(intent);
            }
        });

        buttonPutActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PutActivity.class);
                startActivity(intent);
            }
        });

        buttonDeleteActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DeleteActivity.class);
                startActivity(intent);
            }
        });
    }
}
