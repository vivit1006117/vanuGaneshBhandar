package com.example.kvivek.vanu.help;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.kvivek.vanu.MainActivity;
import com.example.kvivek.vanu.R;

public class Help extends AppCompatActivity {

    Class nextActivityClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Bundle extras = getIntent().getExtras();
        nextActivityClass = (Class<Activity>) extras.getSerializable("BACK_CLASS");
    }

    public void contactUs(View view) {
        Intent intent = new Intent(this, ContactUs.class);
        intent.putExtra("BACK_CLASS", MainActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(this, nextActivityClass);
        startActivity(intent);
    }
}
