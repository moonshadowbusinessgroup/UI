package com.hadimusthafa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UI11 extends AppCompatActivity {

    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i11);

        r = findViewById(R.id.r);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UI11.this, UI11_R.class);
                startActivity(intent);
            }
        });
    }
}