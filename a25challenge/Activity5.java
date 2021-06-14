package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {

    private EditText passwordET;
    private Button SignIn;
    private TextView tx1;
    private Button ukryty;
    private TextView nr;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        nr=(TextView) findViewById(R.id.nr);
        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);
        ukryty = (Button) findViewById(R.id.ukryty);
        SignIn.setVisibility(View.GONE);
        nr.setVisibility(View.GONE);
        passwordET.setVisibility(View.GONE);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passwordET.getText().toString().equals("jest trudne") &&
                        passwordET.getText().toString().equals("jest trudne")) {
                    Toast.makeText(getApplicationContext(),
                            "Generowanie naklejki...",Toast.LENGTH_SHORT).show();
                    Zadanie2();
                }else{
                    Toast.makeText(getApplicationContext(), "Niepoprawne hasło",Toast.LENGTH_SHORT).show();

                }
            }
        });
        ukryty.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                nr.setVisibility(View.VISIBLE);
                passwordET.setVisibility(View.VISIBLE);
                SignIn.setVisibility(View.VISIBLE);
            }
        });

    }


    public void Zadanie2() {
        Intent intent = new Intent(this, Activity30.class);
        startActivity(intent);
    }
}