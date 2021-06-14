package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity26 extends AppCompatActivity {

    private EditText passwordET;
    private Button SignIn;
    private TextView tx1;
    private Button guzik;
    MediaPlayer music;

    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_26);
        guzik = (Button) findViewById(R.id.ma);
        music = MediaPlayer.create(this, R.raw.beatka);
        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);





        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passwordET.getText().toString().equals("wichry i burze to wszystko by") &&
                        passwordET.getText().toString().equals("wichry i burze to wszystko by")) {
                    Toast.makeText(getApplicationContext(),
                            "Generowanie naklejki...",Toast.LENGTH_SHORT).show();
                    Zadanie2();
                }else{
                    Toast.makeText(getApplicationContext(), "Niepoprawne hasło",Toast.LENGTH_SHORT).show();

                }
            }
        });

        guzik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               musicplay();

                }

        });

    }


    public void musicplay()
    {
        music.start();
    }

    public void Zadanie2() {
        Intent intent = new Intent(this, Activity51.class);
        startActivity(intent);
    }
}