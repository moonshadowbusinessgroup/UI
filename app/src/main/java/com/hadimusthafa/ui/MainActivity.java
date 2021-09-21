package com.hadimusthafa.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9, cv10, cv11, cv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv4 = findViewById(R.id.cv4);
        cv5 = findViewById(R.id.cv5);
        cv6 = findViewById(R.id.cv6);
        cv7 = findViewById(R.id.cv7);
        cv8 = findViewById(R.id.cv8);
        cv9 = findViewById(R.id.cv9);
        cv10 = findViewById(R.id.cv10);
        cv11 = findViewById(R.id.cv11);
        cv12 = findViewById(R.id.cv12);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI1.class);
                startActivity(intent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI2.class);
                startActivity(intent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI3.class);
                startActivity(intent);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI4.class);
                startActivity(intent);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI5.class);
                startActivity(intent);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI6.class);
                startActivity(intent);
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Login_Activity.class);
                startActivity(intent);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI8.class);
                startActivity(intent);
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI9.class);
                startActivity(intent);
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI10a.class);
                startActivity(intent);
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI11.class);
                startActivity(intent);
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UI12.class);
                startActivity(intent);
            }
        });
    }
}