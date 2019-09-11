package com.example.tugascalculatordiana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isOpPressed = false;
    private boolean isComma = false;
    private double firstNumber = 0;
    private int secondNumberIndex = 0;
    private char currentOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);
        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);
        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button btnAdd = findViewById(R.id.addition);
        final Button btnMulti = findViewById(R.id.multiplication);
        final Button btnSub = findViewById(R.id.subtraction);
        final Button btnDiv = findViewById(R.id.division);
        final Button btnComma = findViewById(R.id.comma);
        final Button btnEquals = findViewById(R.id.equals);

        final View.OnClickListener CalculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id) {
                    case R.id.n0:
                        calculatorScreen.append("0");
                        break;
                    case R.id.n1:
                        calculatorScreen.append("1");
                        break;
                    case R.id.n2:
                        calculatorScreen.append("2");
                        break;
                    case R.id.n3:
                        calculatorScreen.append("3");
                        break;
                    case R.id.n4:
                        calculatorScreen.append("4");
                        break;
                    case R.id.n5:
                        calculatorScreen.append("5");
                        break;
                    case R.id.n6:
                        calculatorScreen.append("6");
                        break;
                    case R.id.n7:
                        calculatorScreen.append("7");
                        break;
                    case R.id.n8:
                        calculatorScreen.append("8");
                        break;
                    case R.id.n9:
                        calculatorScreen.append("9");
                        break;
                    case R.id.addition:
                        String screenContent = calculatorScreen.getText().toString();
                        firstNumber = Double.parseDouble(screenContent);
                        secondNumberIndex = screenContent.length() + 1;
                        isOpPressed = true;
                        calculatorScreen.append("+");
                        currentOp = '+';
                        break;
                    case R.id.subtraction:
                        String screenContentSub = calculatorScreen.getText().toString();
                        firstNumber = Double.parseDouble(screenContentSub);
                        secondNumberIndex = screenContentSub.length() + 1;
                        isOpPressed = true;
                        calculatorScreen.append("-");
                        currentOp = '-';
                        break;
                    case R.id.multiplication:
                        String screenContentMul = calculatorScreen.getText().toString();
                        firstNumber = Double.parseDouble(screenContentMul);
                        secondNumberIndex = screenContentMul.length() + 1;
                        isOpPressed = true;
                        calculatorScreen.append("×");
                        currentOp = '×';
                        break;
                    case R.id.division:
                        String screenContentDiv = calculatorScreen.getText().toString();
                        firstNumber = Double.parseDouble(screenContentDiv);
                        secondNumberIndex = screenContentDiv.length() + 1;
                        isOpPressed = true;
                        calculatorScreen.append("÷");
                        currentOp = '÷';
                        break;
                    case R.id.comma:
                        if(isComma){
                            calculatorScreen.append("");
                            break;
                        }
                        else {
                            calculatorScreen.append(".");
                            isComma = true;
                            break;
                        }
                    case R.id.equals:
                        if(isOpPressed){
                            if(currentOp == '+'){
                                String screenContentString = calculatorScreen.getText().toString();
                                String secondNumberString = screenContentString.substring(secondNumberIndex, screenContentString.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber += firstNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }
                            else if(currentOp == '-'){
                                String screenContentString = calculatorScreen.getText().toString();
                                String secondNumberString = screenContentString.substring(secondNumberIndex, screenContentString.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber = firstNumber - secondNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }

                            else if(currentOp == '×'){
                                String screenContentString = calculatorScreen.getText().toString();
                                String secondNumberString = screenContentString.substring(secondNumberIndex, screenContentString.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber *= firstNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }

                            else if(currentOp == '÷'){
                                String screenContentString = calculatorScreen.getText().toString();
                                String secondNumberString = screenContentString.substring(secondNumberIndex, screenContentString.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber = firstNumber / secondNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }

                        }
                }
            }
        };
        n0.setOnClickListener(CalculatorListener);
        n1.setOnClickListener(CalculatorListener);
        n2.setOnClickListener(CalculatorListener);
        n3.setOnClickListener(CalculatorListener);
        n4.setOnClickListener(CalculatorListener);
        n5.setOnClickListener(CalculatorListener);
        n6.setOnClickListener(CalculatorListener);
        n7.setOnClickListener(CalculatorListener);
        n8.setOnClickListener(CalculatorListener);
        n9.setOnClickListener(CalculatorListener);
        btnComma.setOnClickListener(CalculatorListener);
        btnAdd.setOnClickListener(CalculatorListener);
        btnSub.setOnClickListener(CalculatorListener);
        btnMulti.setOnClickListener(CalculatorListener);
        btnDiv.setOnClickListener(CalculatorListener);
        btnEquals.setOnClickListener(CalculatorListener);

        final Button delete = findViewById(R.id.del);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayedElements = calculatorScreen.getText().toString();
                int length = displayedElements.length();
                if (length > 0) {
                    displayedElements = displayedElements.substring(0, length - 1);
                    calculatorScreen.setText(displayedElements);
                }
            }
        });

        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("");
            }
        });
    }
}
