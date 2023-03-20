package com.example.ditbudget;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpelActivity extends AppCompatActivity {

    EditText suInput;
    EditText salaryInput;
    EditText rentInput;
    EditText foodInput;
    EditText otherInput;
    Button calculateButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpel2);
    }
    public void simpleActivity (View view) {
        suInput = findViewById(R.id.editTextTextPersonName2);
        salaryInput = findViewById(R.id.editTextTextPersonName3);
        rentInput = findViewById(R.id.editTextTextPersonName5);
        foodInput = findViewById(R.id.editTextTextPersonName6);
        otherInput = findViewById(R.id.editTextTextPersonName7);
        calculateButton = findViewById(R.id.button3);
        resultText = findViewById(R.id.textView4);

        calculateButton.setOnClickListener(v -> {
            double su = Double.parseDouble(suInput.getText().toString());
            double salary = Double.parseDouble(salaryInput.getText().toString());
            double rent = Double.parseDouble(rentInput.getText().toString());
            double food = Double.parseDouble(foodInput.getText().toString());
            double other = Double.parseDouble(otherInput.getText().toString());

            double totalIncome = su + salary;
            double totalExpenses = rent + food + other;

            double result = totalIncome - totalExpenses;
            resultText.setText(resultText.toString());

            // Create an Intent and add the result as an extra
            Intent resultIntent = new Intent(this, OverblikActivity.class);
            resultIntent.putExtra("RESULT", result);

            startActivity(resultIntent);
        });

    }
}
