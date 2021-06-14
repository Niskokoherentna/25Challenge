package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Activity20 extends AppCompatActivity {


    private EditText passwordET;
    private Button SignIn;
    private TextView tx1;
    int counter = 3;

    TextView time;
    TextView click;
    Button btn_click;
    Button btn_start;

    CountDownTimer timer;
    int t=30;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);

        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);
        tx1 = (TextView)findViewById(R.id.textView3);
        time = (TextView)findViewById(R.id.time);
        click = (TextView)findViewById(R.id.click);
        btn_click = (Button) findViewById(R.id.btn_click);
        btn_start = (Button) findViewById(R.id.btn_start);


        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passwordET.getText().toString().equals("herytierka") &&
                        passwordET.getText().toString().equals("herytierka")) {
                    Toast.makeText(getApplicationContext(),
                            "Generowanie naklejki...",Toast.LENGTH_SHORT).show();
                    Zadanie2();
                }else{
                    Toast.makeText(getApplicationContext(), "Niepoprawne hasło",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_start.setEnabled(true);
        btn_click.setEnabled(true);

        timer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                t--;
                time.setText("Czas : " + t);
            }

            @Override
            public void onFinish() {
                btn_start.setEnabled(true);
                btn_click.setEnabled(false);
                time.setText("Czas : 0");
                if (c>=200)
                {
                    Toast.makeText(getApplicationContext(), "Hasło to herytierka.",Toast.LENGTH_LONG).show();
                }
                else if(c<200)
                {
                    int a= 200-c;
                    Toast.makeText(getApplicationContext(),"Zabrakło Ci: " + a + " kliknięć",Toast.LENGTH_SHORT).show();
                }

            }
        };

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                click.setText("Kliknięcia : " + c);
            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
                btn_start.setEnabled(false);
                btn_click.setEnabled(true);
                c=0;
                t=30;
                time.setText("Czas : " + t);
                click.setText("Kliknięcia : " + c);
            }
        });
        }




    public void Zadanie2() {
        Intent intent = new Intent(this, Activity45.class);
        startActivity(intent);
    }
}