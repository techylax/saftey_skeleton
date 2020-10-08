package com.arthava.womensafety;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {

    private EditText name,email,address,pass,confirmPass;
    private Button signUpB;
    private ImageView backB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.username);
        email =  findViewById(R.id.email);
        address = findViewById(R.id.address);
        pass = findViewById(R.id.password);
        confirmPass = findViewById(R.id.confirm_pass);
        signUpB = findViewById(R.id.signupB);
        backB = findViewById(R.id.backB);

        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

        signUpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

