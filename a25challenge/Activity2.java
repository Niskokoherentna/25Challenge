package com.example.a25challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    public static View button;
    public static View button2;
    public static View button3;
    public static View button4;
    public static View button5;
    public static View button6;
    public static View button7;
    public static View button8;
    public static View button9;
    public static View button10;
    public static View button11;
    public static View button12;
    public static View button13;
    public static View button14;
    public static View button15;
    public static View button16;
    public static View button17;
    public static View button18;
    public static View button19;
    public static View button20;
    public static View button21;
    public static View button22;
    public static View button23;
    public static View button24;
    public static View button25;

    @SuppressLint("ResourceAsColor")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie1();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie2();
            }
        });


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie3();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie4();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie5();
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie6();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie7();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie8();
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie9();
            }
        });

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie10();
            }
        });

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie11();
            }
        });

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie12();
            }
        });

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie13();
            }
        });

        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie14();
            }
        });

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie15();
            }
        });

        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie16();
            }
        });

        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie17();
            }
        });

        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie18();
            }
        });

        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie19();
            }
        });

        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie20();
            }
        });

        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie21();
            }
        });

        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie22();
            }
        });

        button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie23();
            }
        });

        button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie24();
            }
        });

        button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zadanie25();
            }
        });


    }

    public void Zadanie1() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void Zadanie2() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void Zadanie3() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void Zadanie4() {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }

    public void Zadanie5() {
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }

    public void Zadanie6() {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }

    public void Zadanie7() {
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }

    public void Zadanie8() {
        Intent intent = new Intent(this, Activity10.class);
        startActivity(intent);
    }

    public void Zadanie9() {
        Intent intent = new Intent(this, Activity11.class);
        startActivity(intent);
    }

    public void Zadanie10() {
        Intent intent = new Intent(this, Activity12.class);
        startActivity(intent);
    }

    public void Zadanie11() {
        Intent intent = new Intent(this, Activity13.class);
        startActivity(intent);
    }

    public void Zadanie12() {
        Intent intent = new Intent(this, Activity14.class);
        startActivity(intent);
    }

    public void Zadanie13() {
        Intent intent = new Intent(this, Activity15.class);
        startActivity(intent);
    }

    public void Zadanie14() {
        Intent intent = new Intent(this, Activity16.class);
        startActivity(intent);
    }

    public void Zadanie15() {
        Intent intent = new Intent(this, Activity17.class);
        startActivity(intent);
    }

    public void Zadanie16() {
        Intent intent = new Intent(this, Activity18.class);
        startActivity(intent);
    }

    public void Zadanie17() {
        Intent intent = new Intent(this, Activity19.class);
        startActivity(intent);
    }

    public void Zadanie18() {
        Intent intent = new Intent(this, Activity20.class);
        startActivity(intent);
    }

    public void Zadanie19() {
        Intent intent = new Intent(this, Activity21.class);
        startActivity(intent);
    }

    public void Zadanie20() {
        Intent intent = new Intent(this, Activity22.class);
        startActivity(intent);
    }

    public void Zadanie21() {
        Intent intent = new Intent(this, Activity23.class);
        startActivity(intent);
    }

    public void Zadanie22() {
        Intent intent = new Intent(this, Activity24.class);
        startActivity(intent);
    }

    public void Zadanie23() {
        Intent intent = new Intent(this, Activity25.class);
        startActivity(intent);
    }

    public void Zadanie24() {
        Intent intent = new Intent(this, Activity26.class);
        startActivity(intent);
    }

    public void Zadanie25() {
        Intent intent = new Intent(this, Activity27.class);
        startActivity(intent);
    }

}