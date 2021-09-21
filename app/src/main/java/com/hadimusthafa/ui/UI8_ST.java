package com.hadimusthafa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UI8_ST extends AppCompatActivity {

    LinearLayout e_book_l, video_l;

    TextView e_book, video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i8__s_t);

        e_book_l = findViewById(R.id.e_book_l);
        video_l = findViewById(R.id.video_l);

        video = findViewById(R.id.video);
        e_book = findViewById(R.id.e_book);

        e_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             video_l.setVisibility(View.GONE);
             e_book_l.setVisibility(View.VISIBLE);

            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e_book_l.setVisibility(View.GONE);
                video_l.setVisibility(View.VISIBLE);

            }
        });
    }
}