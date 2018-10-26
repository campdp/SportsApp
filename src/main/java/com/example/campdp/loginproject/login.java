package com.example.campdp.loginproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    public Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sub=findViewById(R.id.LogSub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();
            }
        });

        final EditText Userlog = (EditText) findViewById(R.id.Loguser);
        final EditText Userpass = (EditText) findViewById(R.id.Logpass);
        Userlog.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(Userlog.getText().length()>20){
                    Userlog.setError("Username cannot be greater than 20 characters");
                }
            }
        });

        Userpass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(Userpass.getText().length()<5 || Userpass.getText().length()>15){
                    Userpass.setError("Password must be between 5-15 characters");
                }
            }
        });

    }
    public void openactivity(){
        Intent intentlog=new Intent(this, activity_register.class);
        startActivity(intentlog);
    }
}
