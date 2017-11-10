package com.example.damien.calculette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonBy;
    Button buttonDiv;
    Button buttonClear;
    Button buttonPoint;
    Button buttonEqual;

    EditText resultat;

    double memoire;
    char lastOperand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonBy = (Button) findViewById(R.id.buttonBy);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);

        resultat = (EditText) findViewById(R.id.res);

        memoire=0;

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer(v);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer(v);
            }
        });

        buttonBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer(v);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer(v);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer(v);
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer(v);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculer(v);
            }
        });

    }


    public void chiffreClick(String s){

    }
    public void equalClick(){

    }

    public void minusClick(){

    }

    public void plusClick(){

    }

    public void divClick(){

    }

    public  void byClick(){

    }

    public void clearClick(){

    }

    public void pointClick(){

    }

    public void calculer(View view){
        Button button = (Button) view;
        char b_char = button.getText().charAt(0);
        if (isDigit(b_char)){
            resultat.getText().append(b_char);
        }
        else{
            if (isOperator(b_char)){
                if (memoire==0){
                    memoire = Double.valueOf(resultat.getText().toString());
                    lastOperand = b_char;
                }else
                    doMath(memoire, Double.valueOf(resultat.getText().toString()), lastOperand);
            }
        }
    }

    private boolean isOperator(char c){
        return c=='+' || c=='-' || c=='/' || c=='*';
    }

    private boolean isDigit(char c){
        return c>='0' && c<='9';
    }
}