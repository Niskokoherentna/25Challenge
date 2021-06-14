package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Activity52 extends AppCompatActivity {

    private ImageView obraz;
    private ImageButton koniec;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_52);

        koniec = (ImageButton) findViewById(R.id.button_koncowy);
        koniec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran_koncowy();
            }
        });

        obraz=findViewById(R.id.jeden);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        obraz.setAnimation(animation);
        Activity2.button25.setBackgroundColor(R.color.black);
    }

    public void ekran_koncowy() {
        Intent intent = new Intent(this, ekran_koncowy.class);
        startActivity(intent);
    }


}