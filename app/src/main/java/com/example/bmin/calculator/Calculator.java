package com.example.bmin.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class Calculator extends AppCompatActivity {

    private TextView tvResult;
    private TextView tvInput;

    private Button btZero;
    private Button btOne;
    private Button btTwo;
    private Button btThree;
    private Button btFour;
    private Button btFive;
    private Button btSix;
    private Button btSeven;
    private Button btEight;
    private Button btNine;

    private Button btDecimal;
    private Button btClear;
    private Button btDelete;
    private Button btPlusMinus;
    private Button btDivide;
    private Button btMultiply;
    private Button btMinus;
    private Button btPlus;
    private Button btEqual;

    private String[] inputArray = {"","",""};
    private String input = "";
    private char[] operatorArray = {'+','-','x','/'};
    private int inputIndex = 0;
    private boolean equalPressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        final TextView tvInput = (TextView) findViewById(R.id.tvInput);

        final Button btZero = (Button) findViewById(R.id.btZero);
        final Button btOne = (Button) findViewById(R.id.btOne);
        final Button btTwo = (Button) findViewById(R.id.btTwo);
        final  Button btThree = (Button) findViewById(R.id.btThree);
        final Button btFour = (Button) findViewById(R.id.btFour);
        final Button btFive = (Button) findViewById(R.id.btFive);
        final Button btSix = (Button) findViewById(R.id.btSix);
        final Button btSeven = (Button) findViewById(R.id.btSeven);
        final Button btEight = (Button) findViewById(R.id.btEight);
        final Button btNine = (Button) findViewById(R.id.btNine);
        final Button btDecimal = (Button) findViewById(R.id.btDecimal);
        final Button btClear = (Button) findViewById(R.id.btClear);
        final Button btDelete = (Button) findViewById(R.id.btDelete);
        final Button btPlusMinus = (Button) findViewById(R.id.btPlusMinus);
        final Button btDivide = (Button) findViewById(R.id.btDivide);
        final Button btMultiply = (Button) findViewById(R.id.btMultiply);
        final Button btMinus = (Button) findViewById(R.id.btMinus);
        final Button btPlus = (Button) findViewById(R.id.btPlus);
        final Button btEqual = (Button) findViewById(R.id.btEqual);

        tvInput.setText("");
        tvResult.setText("");
        btDelete.setClickable(false);
        btPlusMinus.setClickable(false);
        btDivide.setClickable(false);
        btMultiply.setClickable(false);
        btMinus.setClickable(false);
        btPlus.setClickable(false);
        btEqual.setClickable(false);

        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tvInput.setText("CLICKED");
                if (equalPressed) {
                    inputArray[inputIndex] = "0";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                } else {
                    inputArray[inputIndex] += "0";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "1";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "1";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "2";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "2";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "3";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "3";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "4";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "4";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "5";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "5";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "6";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "6";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "7";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "7";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btEight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "8";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "8";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btNine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "9";
                    inputArray[1] = "";
                    inputArray[2] = "";
                    equalPressed = false;
                    tvResult.setText("");
                    tvInput.setText(inputArray[inputIndex]);
                }
                else {
                    inputArray[inputIndex] += "9";
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (inputArray[1] == "") {
                    inputArray[1] = "+";
                    inputIndex = 2;
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                    tvInput.setText(inputArray[inputIndex]);
                    btDelete.setClickable(false);
                    btPlusMinus.setClickable(false);
                    btDivide.setClickable(false);
                    btMultiply.setClickable(false);
                    btMinus.setClickable(false);
                    btPlus.setClickable(false);
                    btEqual.setClickable(false);
                }
                else {
                    double result = -5754643254.2345425234;
                    for (int i = 0; i < operatorArray.length; i++) {
                        if (inputArray[1] == "+")
                            result = Math2.add(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "-")
                            result = Math2.subtract(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "x")
                            result = Math2.multiply(inputArray[0], inputArray[2]);
                        else if (Double.parseDouble(inputArray[2]) != 0 && inputArray[1] == "/")
                            result = Math2.divide(inputArray[0], inputArray[2]);
                    }
                    if (result != -5754643254.2345425234) {
                        inputArray[0] = String.valueOf(result);
                        inputArray[1] = "+";
                        inputArray[2] = "";
                        String line;
                        line = inputArray[0];
                        line += " " + inputArray[1];
                        line += " " + inputArray[2];
                        tvResult.setText(line);
                        tvInput.setText("");
                        btDelete.setClickable(false);
                        btPlusMinus.setClickable(false);
                        btDivide.setClickable(false);
                        btMultiply.setClickable(false);
                        btMinus.setClickable(false);
                        btPlus.setClickable(false);
                        btEqual.setClickable(false);
                    }
                }
            }
        });

        btMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (inputArray[1] == "") {
                    inputArray[1] = "-";
                    inputIndex = 2;
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                    tvInput.setText(inputArray[inputIndex]);
                    btDelete.setClickable(false);
                    btPlusMinus.setClickable(false);
                    btDivide.setClickable(false);
                    btMultiply.setClickable(false);
                    btMinus.setClickable(false);
                    btPlus.setClickable(false);
                    btEqual.setClickable(false);
                }
                else {
                    double result = -5754643254.2345425234;
                    for (int i = 0; i < operatorArray.length; i++) {
                        if (inputArray[1] == "+")
                            result = Math2.add(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "-")
                            result = Math2.subtract(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "x")
                            result = Math2.multiply(inputArray[0], inputArray[2]);
                        else if (Double.parseDouble(inputArray[2]) != 0 && inputArray[1] == "/")
                            result = Math2.divide(inputArray[0], inputArray[2]);
                    }
                    if (result != -5754643254.2345425234) {
                        inputArray[0] = String.valueOf(result);
                        inputArray[1] = "-";
                        inputArray[2] = "";
                        String line;
                        line = inputArray[0];
                        line += " " + inputArray[1];
                        line += " " + inputArray[2];
                        tvResult.setText(line);
                        tvInput.setText("");
                        btDelete.setClickable(false);
                        btPlusMinus.setClickable(false);
                        btDivide.setClickable(false);
                        btMultiply.setClickable(false);
                        btMinus.setClickable(false);
                        btPlus.setClickable(false);
                        btEqual.setClickable(false);
                    }
                }
            }
        });

        btMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (inputArray[1] == "") {
                    inputArray[1] = "x";
                    inputIndex = 2;
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                    tvInput.setText(inputArray[inputIndex]);
                    btDelete.setClickable(false);
                    btPlusMinus.setClickable(false);
                    btDivide.setClickable(false);
                    btMultiply.setClickable(false);
                    btMinus.setClickable(false);
                    btPlus.setClickable(false);
                    btEqual.setClickable(false);
                }
                else {
                    double result = -5754643254.2345425234;
                    for (int i=0;i<operatorArray.length;i++) {
                        if (inputArray[1] == "+")
                            result = Math2.add(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "-")
                            result = Math2.subtract(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "x")
                            result = Math2.multiply(inputArray[0], inputArray[2]);
                        else if (Double.parseDouble(inputArray[2]) != 0 && inputArray[1] == "/")
                            result = Math2.divide(inputArray[0], inputArray[2]);
                    }
                    if (result != -5754643254.2345425234) {
                        inputArray[0] = String.valueOf(result);
                        inputArray[1] = "x";
                        inputArray[2] = "";
                        String line;
                        line = inputArray[0];
                        line += " " + inputArray[1];
                        line += " " + inputArray[2];
                        tvResult.setText(line);
                        tvInput.setText("");
                        btDelete.setClickable(false);
                        btPlusMinus.setClickable(false);
                        btDivide.setClickable(false);
                        btMultiply.setClickable(false);
                        btMinus.setClickable(false);
                        btPlus.setClickable(false);
                        btEqual.setClickable(false);
                    }
                }
            }
        });

        btDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (inputArray[1] == "") {
                    inputArray[1] = "/";
                    inputIndex = 2;
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                    tvInput.setText(inputArray[inputIndex]);
                    btDelete.setClickable(false);
                    btPlusMinus.setClickable(false);
                    btDivide.setClickable(false);
                    btMultiply.setClickable(false);
                    btMinus.setClickable(false);
                    btPlus.setClickable(false);
                    btEqual.setClickable(false);
                }
                else {
                    double result = -5754643254.2345425234;
                    for (int i=0;i<operatorArray.length;i++) {
                        if (inputArray[1] == "+")
                            result = Math2.add(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "-")
                            result = Math2.subtract(inputArray[0], inputArray[2]);
                        else if (inputArray[1] == "x")
                            result = Math2.multiply(inputArray[0], inputArray[2]);
                        else if (Double.parseDouble(inputArray[2]) != 0 && inputArray[1] == "/")
                            result = Math2.divide(inputArray[0], inputArray[2]);
                    }
                    if (result != -5754643254.2345425234) {
                        inputArray[0] = String.valueOf(result);
                        inputArray[1] = "/";
                        inputArray[2] = "";
                        String line;
                        line = inputArray[0];
                        line += " " + inputArray[1];
                        line += " " + inputArray[2];
                        tvResult.setText(line);
                        tvInput.setText("");
                        btDelete.setClickable(false);
                        btPlusMinus.setClickable(false);
                        btDivide.setClickable(false);
                        btMultiply.setClickable(false);
                        btMinus.setClickable(false);
                        btPlus.setClickable(false);
                        btEqual.setClickable(false);
                    }
                }
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double result = -5754643254.2345425234;
                for (int i=0;i<operatorArray.length;i++) {
                    if (inputArray[1] == "+")
                        result = Math2.add(inputArray[0], inputArray[2]);
                    else if (inputArray[1] == "-")
                        result = Math2.subtract(inputArray[0], inputArray[2]);
                    else if (inputArray[1] == "x")
                        result = Math2.multiply(inputArray[0], inputArray[2]);
                    else if (Double.parseDouble(inputArray[2]) != 0 && inputArray[1] == "/")
                        result = Math2.divide(inputArray[0], inputArray[2]);
                }
                if (result != -5754643254.2345425234) {
                    inputArray[0] = String.valueOf(result);
                    inputArray[1] = "";
                    inputArray[2] = "";
                    tvResult.setText(inputArray[0]);
                    tvInput.setText(inputArray[0]);
                    btDelete.setClickable(false);
                    btPlusMinus.setClickable(false);
                    btDivide.setClickable(false);
                    btMultiply.setClickable(false);
                    btMinus.setClickable(false);
                    btPlus.setClickable(false);
                    btEqual.setClickable(false);
                    equalPressed = true;
                }
            }
        });

        btPlusMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (inputArray[inputIndex] == "")
                    inputArray[inputIndex] = "-";
                else if (inputArray[inputIndex] == "-")
                    inputArray[inputIndex] = "";
                else {
                    inputArray[inputIndex] = Math2.changeSign(inputArray[inputIndex]);
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btDecimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (equalPressed) {
                    inputIndex = 0;
                    inputArray[inputIndex] = "0.";
                    equalPressed = false;
                    btDecimal.setClickable(false);
                    btDelete.setClickable(true);
                    btPlusMinus.setClickable(true);
                    btDivide.setClickable(true);
                    btMultiply.setClickable(true);
                    btMinus.setClickable(true);
                    btPlus.setClickable(true);
                    btEqual.setClickable(true);
                    tvInput.setText(inputArray[inputIndex]);
                }
                else if (inputArray[inputIndex] == "") {
                    inputArray[inputIndex] = "0.";
                    btDecimal.setClickable(false);
                    tvInput.setText(inputArray[inputIndex]);
                }
                else if (inputArray[inputIndex] == "-") {
                    inputArray[inputIndex] = "-0.";
                    btDecimal.setClickable(false);
                    tvInput.setText(inputArray[inputIndex]);
                }
                else if (Double.parseDouble(inputArray[inputIndex])%1 == 0) {
                    inputArray[inputIndex] += ".";
                    btDecimal.setClickable(false);
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                }
            }
        });

        btDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (inputIndex == 2 && inputArray[2] == "") {
                    inputIndex = 0;
                    inputArray[1] = "";
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                    tvInput.setText(inputArray[inputIndex]);
                }
                else if (inputArray[inputIndex] != "") {
                    inputArray[inputIndex] = "";
                    String line;
                    line = inputArray[0];
                    line += " " + inputArray[1];
                    line += " " + inputArray[2];
                    tvResult.setText(line);
                    tvInput.setText(inputArray[inputIndex]);
                }
            }
        });

        btClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                for (int i = 0; i < inputArray.length;i++) {
                    inputArray[i] = "";
                }
                inputIndex = 0;
                String line;
                line = inputArray[0];
                line += " " + inputArray[1];
                line += " " + inputArray[2];
                tvResult.setText(line);
                tvInput.setText(inputArray[inputIndex]);
                btDelete.setClickable(false);
                btPlusMinus.setClickable(false);
                btDivide.setClickable(false);
                btMultiply.setClickable(false);
                btMinus.setClickable(false);
                btPlus.setClickable(false);
                btEqual.setClickable(false);
            }
        });
    }
/*
    public void clickNumber(View v) {
        Button btNumber = (Button) v;
        inputArray[inputIndex] = btNumber.getText().toString();
        if (inputIndex == 2)
            ableOperatorButton();
        updateTVInput();
    }
*/

    private void updateTVInput() {
        tvInput.setText(inputArray[inputIndex]);
    }

    private void clearTVInput() {
        tvInput.setText("");
    }

    private void updateTVResult() {
        String line;
        line = inputArray[0];
        line += " " + inputArray[1];
        line += " " + inputArray[2];
        tvInput.setText(line);
    }

    private void disableOperatorButton() {
        btDelete.setClickable(false);
        btPlusMinus.setClickable(false);
        btDivide.setClickable(false);
        btMultiply.setClickable(false);
        btMinus.setClickable(false);
        btPlus.setClickable(false);
        btEqual.setClickable(false);
    }

    private void ableOperatorButton() {
        btDelete.setClickable(true);
        btPlusMinus.setClickable(true);
        btDivide.setClickable(true);
        btMultiply.setClickable(true);
        btMinus.setClickable(true);
        btPlus.setClickable(true);
        btEqual.setClickable(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
