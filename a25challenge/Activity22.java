package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity22 extends AppCompatActivity {


    private EditText passwordET;
    private Button SignIn;
    private TextView tx1;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);


        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);
        tx1 = (TextView)findViewById(R.id.textView3);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passwordET.getText().toString().equals("watolina") &&
                        passwordET.getText().toString().equals("watolina")) {
                    Toast.makeText(getApplicationContext(),
                            "Generowanie naklejki...",Toast.LENGTH_SHORT).show();
                    Zadanie2();
                }else{
                    Toast.makeText(getApplicationContext(), "Niepoprawne hasło",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


    public void Zadanie2() {
        Intent intent = new Intent(this, Activity47.class);
        startActivity(intent);
    }
}