package com.hadimusthafa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class UI9 extends AppCompatActivity {

    RadioButton rb1, rb2, rb3;
    LinearLayout cvb1, cvb2, cvb3;
    TextView cash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i9);


        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);

        cvb1 = findViewById(R.id.cvb1);
        cvb2 = findViewById(R.id.cvb2);
        cvb3 = findViewById(R.id.cvb3);

        cash = findViewById(R.id.cash);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb2.setChecked(false);
                rb3.setChecked(false);

                cvb1.setBackgroundResource(R.drawable.u9_cv_s);
                cvb2.setBackgroundResource(0);
                cvb3.setBackgroundResource(0);

                cash.setText("Continue with Credit Card");
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb1.setChecked(false);
                rb3.setChecked(false);

                cvb2.setBackgroundResource(R.drawable.u9_cv_s);
                cvb1.setBackgroundResource(0);
                cvb3.setBackgroundResource(0);

                cash.setText("Continue with Bank Account");
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb2.setChecked(false);
                rb1.setChecked(false);

                cvb3.setBackgroundResource(R.drawable.u9_cv_s);
                cvb2.setBackgroundResource(0);
                cvb1.setBackgroundResource(0);

                cash.setText("Continue with PayPal");
            }
        });

    }
}