package com.example.ditbudget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void specifikActivity(View view){
        Intent intentToSpecifikActivity = new Intent(this, SpecifikActivity.class);
        startActivity(intentToSpecifikActivity);
    }

    public void simpleActivity(View view){
        Intent intentToSimpleActivity = new Intent(this, SimpelActivity.class);
        startActivity(intentToSimpleActivity);
    }

}