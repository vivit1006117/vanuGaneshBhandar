package com.example.kvivek.vanu.help;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.kvivek.vanu.R;

public class TermsAndCondition extends AppCompatActivity {

    Class<Activity> previousActivityClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);

        Bundle extras = getIntent().getExtras();
        previousActivityClass = (Class<Activity>) extras.getSerializable("BACK_CLASS");
    }

    public void back(View view) {
        Intent intent = new Intent(this, previousActivityClass);
        startActivity(intent);
    }
}
