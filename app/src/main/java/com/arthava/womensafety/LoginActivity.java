package com.arthava.womensafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText email,pass;
    private Button loginB;
    private TextView forgotPassB,signupB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        loginB = findViewById(R.id.loginB);
        forgotPassB = findViewById(R.id.forgt_pass);
        signupB = findViewById(R.id.signupB);

        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);

                if(validateData())
                {
                    login();
                }

            }
        });
        signupB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);

            }
        });
    }
private  boolean validateData()
{
    boolean status = false;

    if(email.getText().toString().isEmpty())
    {
        email.setError("Enter Phone Number");
        return  false;
    }

    if(pass.getText().toString().isEmpty())
    {
        pass.setError("Enter Password");
        return false;
    }
     return  true;
}

private  void login()
{

}

}
