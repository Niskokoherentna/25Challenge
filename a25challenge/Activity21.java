package com.example.a25challenge;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity21 extends AppCompatActivity implements View.OnClickListener{


    private EditText passwordET;
    private Button SignIn;

    private TextView tx1;
    int counter = 3;

    private ImageView szyszynka;
    private Button bButton;
    private Button aButton;
    private Button cButton;
    private Button dButton;
    private TextView questionTextView;
    private int correct = 0;
    // to keep current question track
    private int currentQuestionIndex = 0;

    private int a=1;
    private int b=2;
    private int c=3;
    private int d=4;

    private Question[] questionBank = new Question[] {
            // array of objects of class Question
            // providing questions from string
            // resource and the correct ans
            new Question(R.string.a, 2),
            new Question(R.string.b, 4),
            new Question(R.string.c, 1),
            new Question(R.string.d, 1),
            new Question(R.string.e, 3),
            new Question(R.string.f, 2),
            new Question(R.string.g, 4),

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);
        szyszynka = findViewById(R.id.szyszynkaa);
        bButton = findViewById(R.id.b_button);
        aButton = findViewById(R.id.a_button);
        cButton = findViewById(R.id.c_button);
        dButton = findViewById(R.id.d_button);
        // register our buttons to listen to
        // click events
        questionTextView = findViewById(R.id.answer_text_view);
        bButton.setOnClickListener(this);
        aButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        dButton.setOnClickListener(this);

        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);
        passwordET.setVisibility(View.INVISIBLE);
        SignIn.setVisibility(View.INVISIBLE);
        szyszynka.setVisibility(View.INVISIBLE);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passwordET.getText().toString().equals("szyszynka") &&
                        passwordET.getText().toString().equals("szyszynka")) {
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
        Intent intent = new Intent(this, Activity46.class);
        startActivity(intent);
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v)
    {
        // checking which button is
        // clicked by user
        // in this case user choose false
        switch (v.getId()) {
            case R.id.c_button:
                checkAnswer(3);
                if (currentQuestionIndex < 8) {
                    currentQuestionIndex = currentQuestionIndex + 1;
                    if (currentQuestionIndex == 7) {
                        questionTextView.setText(getString(R.string.correct, correct));
                        aButton.setVisibility(View.INVISIBLE);
                        bButton.setVisibility(View.INVISIBLE);
                        cButton.setVisibility(View.INVISIBLE);
                        dButton.setVisibility(View.INVISIBLE);

                        if (correct == 7) {
                            questionTextView.setText("Hasło to 'szyszynka'");
                            passwordET.setVisibility(View.VISIBLE);
                            SignIn.setVisibility(View.VISIBLE);
                        }
                        else {
                            questionTextView.setText("Spróbuj jeszcze raz :(");
                        }

                        // if correctness<3 showing sad emoji
                    }
                    else {
                        updateQuestion();
                    }
                }
                break;
            case R.id.d_button:
                checkAnswer(4);
                if (currentQuestionIndex < 8) {
                    currentQuestionIndex = currentQuestionIndex + 1;
                    if (currentQuestionIndex == 7) {
                        questionTextView.setText(getString(R.string.correct, correct));
                        aButton.setVisibility(View.INVISIBLE);
                        bButton.setVisibility(View.INVISIBLE);
                        cButton.setVisibility(View.INVISIBLE);
                        dButton.setVisibility(View.INVISIBLE);

                        if (correct == 7) {
                            questionTextView.setText("Hasło to 'szyszynka'");
                            passwordET.setVisibility(View.VISIBLE);
                            SignIn.setVisibility(View.VISIBLE);
                            szyszynka.setVisibility(View.VISIBLE);

                        }
                        else {
                            questionTextView.setText("Spróbuj jeszcze raz :(");
                        }

                        // if correctness<3 showing sad emoji
                    }
                    else {
                        updateQuestion();
                    }
                }
                break;
            case R.id.a_button:
                checkAnswer(1);
                if (currentQuestionIndex < 8) {
                    currentQuestionIndex = currentQuestionIndex + 1;
                    if (currentQuestionIndex == 7) {
                        questionTextView.setText(getString(R.string.correct, correct));
                        aButton.setVisibility(View.INVISIBLE);
                        bButton.setVisibility(View.INVISIBLE);
                        cButton.setVisibility(View.INVISIBLE);
                        dButton.setVisibility(View.INVISIBLE);

                        if (correct == 7) {
                            questionTextView.setText("Hasło to 'szyszynka'");
                            passwordET.setVisibility(View.VISIBLE);
                            SignIn.setVisibility(View.VISIBLE);
                        }
                        else {
                            questionTextView.setText("Spróbuj jeszcze raz :(");
                        }

                        // if correctness<3 showing sad emoji
                    }
                    else {
                        updateQuestion();
                    }
                }
                break;
            case R.id.b_button:
                checkAnswer(2);
                if (currentQuestionIndex < 8) {
                    currentQuestionIndex = currentQuestionIndex + 1;
                    if (currentQuestionIndex == 7) {
                        questionTextView.setText(getString(R.string.correct, correct));
                        aButton.setVisibility(View.INVISIBLE);
                        bButton.setVisibility(View.INVISIBLE);
                        cButton.setVisibility(View.INVISIBLE);
                        dButton.setVisibility(View.INVISIBLE);

                        if (correct == 7) {
                            questionTextView.setText("Hasło to 'szyszynka'");
                            passwordET.setVisibility(View.VISIBLE);
                            SignIn.setVisibility(View.VISIBLE);
                        }
                        else {
                            questionTextView.setText("Spróbuj jeszcze raz :(");
                        }

                        // if correctness<3 showing sad emoji
                    }
                    else {
                        updateQuestion();
                    }
                }
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void updateQuestion()
    {
        Log.d("Current",
                "onClick: " + currentQuestionIndex);

        questionTextView.setText(questionBank[currentQuestionIndex].getAnswerResId());
        // setting the textview with new question
        switch (currentQuestionIndex) {
            case 1:
                // setting up image for each
                // question

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
        }
    }
    private void checkAnswer(int userChooseCorrect)
    {
        int answerIsTrue = questionBank[currentQuestionIndex].isAnswerTrue();
        // getting correct ans of current question
        int toastMessageId;
        // if ans matches with the
        // button clicked

        if (userChooseCorrect == answerIsTrue) { correct++;
        }
        else {


        }


    }
}