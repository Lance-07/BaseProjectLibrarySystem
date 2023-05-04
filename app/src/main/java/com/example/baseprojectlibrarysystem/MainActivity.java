package com.example.baseprojectlibrarysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView loginHere;
    EditText edtCreateUsername, edtCreatePassword;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCreateUsername = findViewById(R.id.etxtUsername);
        edtCreatePassword = findViewById(R.id.etxtPassword);

        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String createUsername = edtCreateUsername.getText().toString().trim();
                String createPassword = edtCreatePassword.getText().toString().trim();

                if (createUsername.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Username.", Toast.LENGTH_SHORT).show();
                } else if (createPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                } else {
                    proceedToLoginForm();
                }
            }
        });

        loginHere = findViewById(R.id.txtSignUp);
        loginHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginForm.class);
                startActivity(intent);

            }
        });
    }

    private void proceedToLoginForm() {
        Intent intent = new Intent(MainActivity.this, LoginForm.class);
        startActivity(intent);
    }
}