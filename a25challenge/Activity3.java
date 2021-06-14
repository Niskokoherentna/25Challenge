package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    private EditText passwordET;
    private Button SignIn;
    private TextView tx1;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


    passwordET = (EditText) findViewById(R.id.password);
    SignIn = (Button) findViewById(R.id.signin);


    SignIn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(passwordET.getText().toString().equals("admin") &&
                    passwordET.getText().toString().equals("admin")) {
                Toast.makeText(getApplicationContext(),
                        "Generowanie naklejki...",Toast.LENGTH_SHORT).show();
                Zadanie1();


            }else{
                Toast.makeText(getApplicationContext(), "Niepoprawne hasło",Toast.LENGTH_SHORT).show();

            }
        }
    });
    }


    public void Zadanie1() {
        Intent intent = new Intent(this, Activity28.class);
        startActivity(intent);
    }
}