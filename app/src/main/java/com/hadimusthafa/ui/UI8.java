package com.hadimusthafa.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UI8 extends AppCompatActivity {

    CardView sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i8);

        sound = findViewById(R.id.sound);

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UI8.this, UI8_ST.class);
                startActivity(intent);
            }
        });

    }
}