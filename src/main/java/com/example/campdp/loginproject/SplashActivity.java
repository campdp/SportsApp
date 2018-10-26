package com.example.campdp.loginproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    public Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        submit =findViewById(R.id.Sub);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensub();
            }
        });


        final EditText Fname = (EditText) findViewById(R.id.Fedit);
        final EditText Lname = (EditText) findViewById(R.id.Ledit);
        EditText DOB = (EditText) findViewById(R.id.DOBedit);
        final EditText Username = (EditText) findViewById(R.id.Useredit);
        final EditText Password = (EditText) findViewById(R.id.Passedit);

        Fname.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (Fname.getText().length() < 3 || Fname.getText().length() > 30) {
                    Fname.setError("Must be between 3-30 characters");
                }
            }
        });

        Lname.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(Lname.getText().length() < 3 || Lname.getText().length() > 30){
                    Lname.setError("Must be between 3-30 characters");
                }
            }
        });

        Username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(Username.getText().length() > 20){
                    Username.setError("Username cannot be greater than 20 characters");
                }
            }
        });

        Password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(Password.getText().length() <5 || Password.getText().length() > 15){
                    Password.setError("Password must be between 5-15 characters");
                }
            }
        });



}
        public void opensub(){
        Intent intent2 = new Intent(this,activity_register.class);
        startActivity(intent2);
}
}