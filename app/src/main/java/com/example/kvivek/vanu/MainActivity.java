package com.example.kvivek.vanu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.kvivek.vanu.help.ContactUs;
import com.example.kvivek.vanu.help.Help;
import com.example.kvivek.vanu.home.Home;
import com.example.kvivek.vanu.login.Login;
import com.example.kvivek.vanu.registeration.Register;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
