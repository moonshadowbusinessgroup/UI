package com.hadimusthafa.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp_Activity extends AppCompatActivity {

    DBHelper dbHelper;
    EditText suName, suEmail, suPhone, suDob, suPass, suConPass;
    TextView suSignUp, suHaveAcc, suSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        suName = findViewById(R.id.suName);
        suEmail = findViewById(R.id.suEmail);
        suPhone = findViewById(R.id.suPhone);
        suDob = findViewById(R.id.suDob);
        suPass = findViewById(R.id.suPass);
        suConPass = findViewById(R.id.suConPass);

        suSignUp = findViewById(R.id.suSignUp);

        suHaveAcc = findViewById(R.id.suHaveAcc);
        suSignIn = findViewById(R.id.suSignIn);


        dbHelper = new DBHelper(this);

        suHaveAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUp_Activity.this, Login_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        suSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUp_Activity.this, Login_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        suSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Username = suName.getText().toString().trim();
                String Email = suEmail.getText().toString().trim();
                String Mobile = suPhone.getText().toString().trim();
                String Dob = suDob.getText().toString().trim();
                String Password = suPass.getText().toString().trim();
                String ConPassword = suConPass.getText().toString().trim();


                if (Username.isEmpty()) {
                    suName.setError("User Name cannot be empty");

                } else if (Email.isEmpty()) {
                    suEmail.setError("Email cannot be empty");
                } else if (Mobile.isEmpty()) {
                    suPhone.setError("Mobile Number cannot be empty");
                } else if (Dob.isEmpty()) {
                    suDob.setError("Date of Birth cannot be empty");
                } else if (Password.isEmpty() || ConPassword.isEmpty()) {
                    suPass.setError("Password cannot be empty");
                    suConPass.setError("Password cannot be empty");
                }

                if (!Username.isEmpty() && !Email.isEmpty() && !Mobile.isEmpty() && !Dob.isEmpty() && !Password.isEmpty()) {

                    if (Password.equals(ConPassword)) {
                        if (Password.length() >= 8) {

                            Log.e("Username-->", Username + "");
                            Log.e("Email-->", Email + "");
                            Log.e("Mobile-->", Mobile + "");
                            Log.e("Dob-->", Dob + "");
                            Log.e("Password-->", Password + "");
                            long val = dbHelper.addUser(Username, Email, Mobile, Dob, Password);

                            if (val > 0) {
                                Toast.makeText(SignUp_Activity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(SignUp_Activity.this, Login_Activity.class);
                                startActivity(intent);
                                finish();
                            } else {
                                Toast.makeText(SignUp_Activity.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(SignUp_Activity.this, "Password must to be 8 characters or more!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SignUp_Activity.this, "Password is not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}