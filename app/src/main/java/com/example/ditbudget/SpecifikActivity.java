package com.example.ditbudget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SpecifikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specifik);
    }
    public void overviewActivity(View view){
        Intent intentToOverviewActivity = new Intent(this, SimpelActivity.class);
        EditText input = findViewById(R.id.editTextNumber);
        EditText input2 = findViewById(R.id.editTextNumber2);
        EditText input3 = findViewById(R.id.editTextNumber3);
        EditText input4 = findViewById(R.id.editTextNumber4);
        EditText input5 = findViewById(R.id.editTextNumber5);
        EditText input6 = findViewById(R.id.editTextNumber6);
        EditText input7 = findViewById(R.id.editTextNumber7);
        EditText input8 = findViewById(R.id.editTextNumber8);
        EditText input9 = findViewById(R.id.editTextNumber9);
        String inputAsString = input.getText().toString();
        String inputAsString2 = input2.getText().toString();
        String inputAsString3 = input3.getText().toString();
        String inputAsString4 = input4.getText().toString();
        String inputAsString5 = input5.getText().toString();
        String inputAsString6 = input6.getText().toString();
        String inputAsString7 = input7.getText().toString();
        String inputAsString8 = input8.getText().toString();
        String inputAsString9 = input9.getText().toString();
        intentToOverviewActivity.putExtra("Husleje",inputAsString);
        intentToOverviewActivity.putExtra("Mad",inputAsString2);
        intentToOverviewActivity.putExtra("Forsikringer",inputAsString3);
        intentToOverviewActivity.putExtra("Streamingtjenester",inputAsString4);
        intentToOverviewActivity.putExtra("Mobilabonnement",inputAsString5);
        intentToOverviewActivity.putExtra("Internet",inputAsString6);
        intentToOverviewActivity.putExtra("Transport",inputAsString7);
        intentToOverviewActivity.putExtra("Opsparing",inputAsString8);
        intentToOverviewActivity.putExtra("Fagforening",inputAsString9);
        startActivity(intentToOverviewActivity);
    }
}