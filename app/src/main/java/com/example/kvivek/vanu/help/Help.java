package com.example.kvivek.vanu.help;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.kvivek.vanu.R;

public class Help extends AppCompatActivity {

    private Class previousActivityClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Bundle extras = getIntent().getExtras();
        previousActivityClass = (Class) extras.getSerializable("BACK_CLASS");
    }

    public void contactUs(View view) {
        Intent intent = new Intent(this, ContactUs.class);
        intent.putExtra("BACK_CLASS", previousActivityClass);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(this, previousActivityClass);
        startActivity(intent);
    }
}
