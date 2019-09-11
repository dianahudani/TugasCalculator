package com.example.tugascalculatordiana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private double firstNumber = 0;
    private double secondNumber = 0;
    private double hasil = 0;
    private boolean secondNumberFlag = false;
    private boolean flagFakeNumber = false;
    private char currentOp;
    private String screenContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView history = findViewById(R.id.history);
        final TextView viewHasil = findViewById(R.id.calculatorScreen);
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
        final Button btnClear = findViewById(R.id.clear);
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
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("0");
                        break;
                    case R.id.n1:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("1");
                        break;
                    case R.id.n2:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("2");
                        break;
                    case R.id.n3:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("3");
                        break;
                    case R.id.n4:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("4");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("4");
                        break;
                    case R.id.n5:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("5");
                        break;
                    case R.id.n6:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("6");
                        break;
                    case R.id.n7:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("7");
                        break;
                    case R.id.n8:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("8");
                        break;
                    case R.id.n9:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("9");
                        break;
                    case R.id.comma:
                        if(!viewHasil.getText().toString().contains(".")){
                            viewHasil.append(".");
                        }
                        break;

                    case R.id.addition:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " +");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '+';
                        break;
                    case R.id.division:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " /");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '/';
                        break;
                    case R.id.subtraction:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " -");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '-';
                        break;
                    case R.id.multiplication:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " x");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '*';
                        break;
                    case R.id.equals:
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            history.setText("");
                            viewHasil.setText(Double.toString(hasil));
                            secondNumberFlag = false;
                            flagFakeNumber = true;
                        }
                        break;
                    case R.id.clear:
                        viewHasil.setText("0");
                        history.setText("");
                        firstNumber = 0;
                        secondNumber = 0;
                        hasil = 0;
                        secondNumberFlag = false;
                        flagFakeNumber = false;
                        break;
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
        btnClear.setOnClickListener(CalculatorListener);
    }

    private double hitung(char operasi, double pertama, double kedua){
        double outputHitung=(double)0;
        if(operasi=='+'){
            outputHitung = pertama + kedua;
        }else if (operasi=='-'){
            outputHitung = pertama - kedua;
        }else if (operasi=='*'){
            outputHitung = pertama * kedua;
        }else if (operasi=='/'){
            outputHitung = pertama / kedua;
        }
        return outputHitung;
    }
}