package com.example.campdp.loginproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_register extends AppCompatActivity {
public Button Register;
public Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Login= findViewById(R.id.Log);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlog();
            }
        });

        Register= findViewById(R.id.Reg);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openreg();
            }
        });
        }
        public void openreg(){
        Intent intent = new Intent(this,SplashActivity.class);
        startActivity(intent);
        }
        public void openlog(){
        Intent intentlog = new Intent(this, login.class);
        startActivity(intentlog);
        }
}
