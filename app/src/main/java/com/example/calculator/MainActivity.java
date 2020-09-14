package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, multi,
            divi, deci, equals, negative, back;
    private TextView formula, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignButtons();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formula.setText(formula.getText().toString() + "0");
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
        formula = (TextView)findViewById(R.id.tvFormula);
        result = (TextView)findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View view) {
        String myButtonTag = String.valueOf(view.getId());
        Log.d("MainActivity", "Button Clicked" + myButtonTag + " Clicked");
    }
}