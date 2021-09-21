package com.hadimusthafa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UI11_R extends AppCompatActivity {

    TextView suHaveAcc, suSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i11__r);

        suHaveAcc = findViewById(R.id.suHaveAcc);
        suSignIn = findViewById(R.id.suSignIn);

        suSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UI11_R.this, UI11.class);
                startActivity(intent);
            }
        });

        suHaveAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UI11_R.this, UI11.class);
                startActivity(intent);
            }
        });
    }
}