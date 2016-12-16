package com.example.kvivek.vanu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.kvivek.vanu.help.ContactUs;
import com.example.kvivek.vanu.help.Help;
import com.example.kvivek.vanu.registeration.Register;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void help(View view) {
        Intent intent = new Intent(this, Help.class);
        intent.putExtra("BACK_CLASS", MainActivity.class);
        startActivity(intent);
    }

    public void register(View view) {
        System.out.println("sdfsfsffsdfsdfsdfsdfsdfsdfs");
        HashMap<String, String> fields = getAllRegistrationFields();
        Register register = new Register(fields);
        if (register.addUser()) {
            Intent intent = new Intent(this, Help.class);
            intent.putExtra("BACK_CLASS", MainActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, ContactUs.class);
            intent.putExtra("BACK_CLASS", MainActivity.class);
            startActivity(intent);
        }
    }

    private HashMap<String, String> getAllRegistrationFields() {
        EditText nameText = (EditText) findViewById(R.id.name);
        EditText phoneNumberText = (EditText) findViewById(R.id.phoneNumber);
        EditText passwordText = (EditText) findViewById(R.id.password);
        EditText confirmPasswordText = (EditText) findViewById(R.id.confirmPassword);
        EditText emailText = (EditText) findViewById(R.id.email);
        HashMap<String, String> registration = new HashMap<String, String>();

        registration.put("name", nameText.getText().toString());
        registration.put("phoneNumber", phoneNumberText.getText().toString());
        registration.put("password", passwordText.getText().toString());
        registration.put("confirmPassword", confirmPasswordText.getText().toString());
        registration.put("email", emailText.getText().toString());

        return registration;
    }
}
