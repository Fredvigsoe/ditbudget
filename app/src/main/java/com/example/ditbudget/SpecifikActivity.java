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
        int inputAsInt = Integer.parseInt(inputAsString);
        int inputAsInt2 = Integer.parseInt(inputAsString2);
        int inputAsInt3 = Integer.parseInt(inputAsString3);
        int inputAsInt4 = Integer.parseInt(inputAsString4);
        int inputAsInt5 = Integer.parseInt(inputAsString5);
        int inputAsInt6 = Integer.parseInt(inputAsString6);
        int inputAsInt7 = Integer.parseInt(inputAsString7);
        int inputAsInt8 = Integer.parseInt(inputAsString8);
        int inputAsInt9 = Integer.parseInt(inputAsString9);

        intentToOverviewActivity.putExtra("Husleje",inputAsInt);
        intentToOverviewActivity.putExtra("Mad",inputAsInt2);
        intentToOverviewActivity.putExtra("Forsikringer",inputAsInt3);
        intentToOverviewActivity.putExtra("Streamingtjenester",inputAsInt4);
        intentToOverviewActivity.putExtra("Mobilabonnement",inputAsInt5);
        intentToOverviewActivity.putExtra("Internet",inputAsInt6);
        intentToOverviewActivity.putExtra("Transport",inputAsInt7);
        intentToOverviewActivity.putExtra("Opsparing",inputAsInt8);
        intentToOverviewActivity.putExtra("Fagforening",inputAsInt9);
        startActivity(intentToOverviewActivity);
    }
}