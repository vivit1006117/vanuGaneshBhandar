package com.example.kvivek.vanu.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.kvivek.vanu.R;
import com.example.kvivek.vanu.help.Help;
import com.example.kvivek.vanu.home.Home;
import com.example.kvivek.vanu.registration.Register;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void register(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent = new Intent(this, Help.class);
        intent.putExtra("BACK_CLASS", Login.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
