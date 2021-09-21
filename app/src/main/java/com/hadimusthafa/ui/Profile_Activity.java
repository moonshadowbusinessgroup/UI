package com.hadimusthafa.ui;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Profile_Activity extends AppCompatActivity {

    TextView prNameD, prEmailD, prPhoneD, prDobD, prLogOut, prHiName;
    public static String USER_NAME = "";
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        prLogOut = findViewById(R.id.prLogOut);

        prHiName = findViewById(R.id.prHiName);

        prNameD = findViewById(R.id.prNameD);
        prEmailD = findViewById(R.id.prEmailD);
        prPhoneD = findViewById(R.id.prPhoneD);
        prDobD = findViewById(R.id.prDobD);

        dbHelper = new DBHelper(this);

        USER_NAME = Login_Activity.USER_NAME;

        ActivityCompat.requestPermissions(Profile_Activity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);


        String[] s = dbHelper.readUser(getApplicationContext(), Login_Activity.USER_NAME);

        prHiName.setText(s[0]);
        prNameD.setText(s[0]);
        prEmailD.setText(s[1]);
        prPhoneD.setText(s[2]);
        prDobD.setText(s[3]);

        prLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Profile_Activity.this, Login_Activity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}