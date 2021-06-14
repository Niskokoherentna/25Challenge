package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.slice.SliceItem;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.SharedPreferences;
import java.util.TimerTask;
import android.media.MediaPlayer;
import android.widget.TextView;
import java.util.Random;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;
import android.media.MediaPlayer;
import android.widget.Toast;



public class Activity13 extends AppCompatActivity {

    private EditText passwordET;
    private Button SignIn;
    int counter = 3;

    private Canvas canvas;
    private View decorView;
    SharedPreferences sp;
    String textinput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);


        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passwordET.getText().toString().equals("flukt") &&
                        passwordET.getText().toString().equals("flukt")) {
                    Toast.makeText(getApplicationContext(),
                            "Generowanie naklejki...", Toast.LENGTH_SHORT).show();
                    Zadanie2();
                } else {
                    Toast.makeText(getApplicationContext(), "Niepoprawne hasło", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public void Zadanie2() {
        Intent intent = new Intent(this, Activity38.class);
        startActivity(intent);
    }
}