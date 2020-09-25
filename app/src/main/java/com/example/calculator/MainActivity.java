package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, multi,
            divi, deci, equals, negative, back, clear;
    private TextView formula, result;

    boolean ADD, SUB, MULTI, DIVI;

    private float num1 = Float.NaN;
    private float num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignButtons();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + "0");
            }
        });
        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText() + ".");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formula.getText().length() != 0){
                    num1 = Float.parseFloat(formula.getText() + "");
                    ADD = true;
                    formula.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formula.getText().length() != 0){
                    num1 = Float.parseFloat(formula.getText() + "");
                    SUB = true;
                    formula.setText(null);
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formula.getText().length() != 0){
                    num1 = Float.parseFloat(formula.getText() + "");
                    MULTI = true;
                    formula.setText(null);
                }
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formula.getText().length() != 0){
                    num1 = Float.parseFloat(formula.getText() + "");
                    DIVI = true;
                    formula.setText(null);
                }
            }
        });
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                negate();
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ADD || SUB || MULTI || DIVI){
                    num2 = Float.parseFloat(formula.getText() + "");
                }
                if (ADD) {
                    formula.setText(num1 + num2 + "");
                    ADD = false;
                }
                if (SUB) {
                    formula.setText(num1 - num2 + "");
                    SUB = false;
                }
                if (MULTI) {
                    formula.setText(num1 * num2 + "");
                    SUB = false;
                }
                if (DIVI) {
                    formula.setText(num1 / num2 + "");
                    DIVI = false;
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(formula.getText().length() > 0){
                    CharSequence input = formula.getText().toString();
                    formula.setText(input.subSequence(0, input.length() - 1));
                } else{
                    num1 = Float.NaN;
                    num2 = Float.NaN;
                    formula.setText(null);
                    result.setText(null);
                }
            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.NaN;
                num2 = Float.NaN;
                formula.setText(null);
                result.setText(null);
            }

        });



    }

    /********************************************************************************************
     * Function: assignButton
     * Purpose:  Assigns buttons and TextViews to their respective IDs
     *******************************************************************************************/
    private void assignButtons() {
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        zero = (Button)findViewById(R.id.button0);
        add = (Button)findViewById(R.id.buttonPlus);
        sub = (Button)findViewById(R.id.buttonMinus);
        multi = (Button)findViewById(R.id.buttonMulti);
        divi = (Button)findViewById(R.id.buttonDivi);
        deci = (Button)findViewById(R.id.buttonDec);
        negative = (Button)findViewById(R.id.buttonNeg);
        equals = (Button)findViewById(R.id.buttonEquals);
        back = (Button)findViewById(R.id.buttonBack);
        clear = (Button)findViewById(R.id.buttonClear);
        formula = (TextView)findViewById(R.id.tvFormula);
        result = (TextView)findViewById(R.id.tvResult);
    }
    private void negate(){
        num1 *= (-1);
    }
}