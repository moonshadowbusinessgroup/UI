package com.hadimusthafa.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {

    public static String USER_NAME = "";
    DBHelper dbHelper;
    EditText siName, siPass;
    TextView siLogin, siForPass, siNotAcc, siSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        siName = findViewById(R.id.siName);
        siPass = findViewById(R.id.siPass);

        siLogin = findViewById(R.id.siLogin);

        siForPass = findViewById(R.id.siForPass);

        siNotAcc = findViewById(R.id.siNotAcc);
        siSignUp = findViewById(R.id.siSignUp);

        dbHelper = new DBHelper(this);


        siForPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login_Activity.this, Forgot_Activity.class);
                startActivity(intent);

            }
        });

        siNotAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login_Activity.this, SignUp_Activity.class);
                startActivity(intent);

            }
        });

        siSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login_Activity.this, SignUp_Activity.class);
                startActivity(intent);

            }
        });

        siLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String UserName = siName.getText().toString().trim();
                String Pass = siPass.getText().toString().trim();
                Boolean res = dbHelper.checkUser(UserName, Pass);
                Log.e("UserName-->", UserName + "");
                Log.e("Pass-->", Pass + "");
                Log.e("res-->", res + "");

                if (UserName.isEmpty()) {
                    siName.setError("User Name cannot be empty");

                } else if (Pass.isEmpty()) {
                    siPass.setError("Password cannot be empty");
                }

                if (res) {
                    USER_NAME = UserName;
                    Toast.makeText(Login_Activity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login_Activity.this, Profile_Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(Login_Activity.this, "Username or password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
