package com.example.dainr.calculatorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_percent, btn_power, btn_root, btn_clear, btn_reset,
            btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0,
            btn_divide, btn_multiply, btn_minus, btn_plus, btn_decimal, btn_equals;

    TextView result_display;

    float valueOne, valueTwo;

    boolean addition, subtraction, multiplication, division, root, percentage, power;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_percent = findViewById(R.id.btn_percent);
        btn_power = findViewById(R.id.btn_power);
        btn_root = findViewById(R.id.btn_root);
        btn_clear = findViewById(R.id.btn_clear);
        btn_divide = findViewById(R.id.btn_divide);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_minus = findViewById(R.id.btn_minus);
        btn_plus = findViewById(R.id.btn_plus);
        btn_decimal = findViewById(R.id.btn_decimal);
        btn_equals = findViewById(R.id.btn_equals);
        result_display = findViewById(R.id.result_display);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "1");
            }
        });


        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + "0");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result_display == null) {
                    result_display.setText("");
                } else {
                    valueOne = Float.parseFloat(result_display.getText() + "");
                    addition = true;
                    result_display.setText(null);
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result_display.getText() + "");
                subtraction = true;
                result_display.setText(null);
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result_display.getText() + "");
                multiplication = true;
                result_display.setText(null);
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result_display.getText() + "");
                division = true;
                result_display.setText(null);
            }
        });

        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result_display.getText() + "");
                percentage = true;
                result_display.setText(null);
            }
        });

        btn_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result_display.getText() + "");
                root = true;
                result_display.setText(null);
            }
        });

        btn_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result_display.getText() + "");
                power = true;
                result_display.setText(null);
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(result_display.getText() + "");

                if (addition == true) {

                    result_display.setText(valueOne + valueTwo + "");
                    addition = false;
                }


                if (subtraction == true) {
                    result_display.setText(valueOne - valueTwo + "");
                    subtraction = false;
                }

                if (multiplication == true) {
                    result_display.setText(valueOne * valueTwo + "");
                    multiplication = false;
                }

                if (division == true) {
                    result_display.setText(valueOne / valueTwo + "");
                    division = false;
                }


            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText("");
            }
        });

        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_display.setText(result_display.getText() + ".");
            }
        });


    }
}
