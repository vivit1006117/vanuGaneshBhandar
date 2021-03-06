package com.example.kvivek.vanu.registration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.kvivek.vanu.R;
import com.example.kvivek.vanu.help.ContactUs;
import com.example.kvivek.vanu.help.Help;
import com.example.kvivek.vanu.help.TermsAndCondition;
import com.example.kvivek.vanu.home.Home;

import java.util.HashMap;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void help(View view) {
        Intent intent = new Intent(this, Help.class);
        intent.putExtra("BACK_CLASS", Register.class);
        startActivity(intent);
    }

    public void register(View view) {
        HashMap<String, String> fields = getAllRegistrationFields();
        Registration register = new Registration(fields);
        if (register.addUser(fields)) {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, ContactUs.class);
            intent.putExtra("BACK_CLASS", Register.class);
            startActivity(intent);
        }
    }

    private HashMap<String, String> getAllRegistrationFields() {
        EditText nameText = (EditText) findViewById(R.id.name);
        EditText phoneNumberText = (EditText) findViewById(R.id.phoneNumber);
        EditText passwordText = (EditText) findViewById(R.id.password);
        EditText confirmPasswordText = (EditText) findViewById(R.id.confirmPassword);
        EditText emailText = (EditText) findViewById(R.id.email);

        HashMap<String, String> registration = new HashMap<>();

        createMap("name", nameText, registration);
        createMap("phoneNumber", phoneNumberText, registration);
        createMap("password", passwordText, registration);
        createMap("confirmPassword", confirmPasswordText, registration);
        createMap("email", emailText, registration);

        return registration;
    }

    private void createMap(String key, EditText value, HashMap<String, String> registration) {
        if(value != null) registration.put(key, value.getText().toString());
    }

    public void termsAndCondition(View view) {
        Intent intent = new Intent(this, TermsAndCondition.class);
        intent.putExtra("BACK_CLASS", Register.class);
        startActivity(intent);
    }
}
