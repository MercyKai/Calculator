package com.dummies.android.mycalculatorapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button addBtn = findViewById(R.id.addBtn);
        Button subBtn = findViewById(R.id.subBtn);
        Button mulBtn = findViewById(R.id.mulBtn);
        Button divBtn = findViewById(R.id.divBtn);
        Button modBtn = findViewById(R.id.modBtn);
        Button expBtn = findViewById(R.id.expBtn);
        TextView result = findViewById(R.id.result);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()) {
                    result.setText("Fill all fields");
                } else {
                    int sum = Integer.parseInt(n1) + Integer.parseInt(n2);
                    String s = String.valueOf(sum);
                    result.setText(s);
                }
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()) {
                    result.setText("Fill all fields");
                } else {
                    int diff = Integer.parseInt(n1) - Integer.parseInt(n2);
                    String s = String.valueOf(diff);
                    result.setText(s);
                }
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()) {
                    result.setText("Fill all fields");
                } else {
                    int product = Integer.parseInt(n1) * Integer.parseInt(n2);
                    String s = String.valueOf(product);
                    result.setText(s);
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()) {
                    result.setText("Fill all fields");
                } else {
                    float quotient = Float.parseFloat(n1) / Float.parseFloat(n2);
                    String s = String.valueOf(quotient);
                    result.setText(s);
                }
            }
        });

        modBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()) {
                    result.setText("Fill all fields");
                } else {
                    int remainder = Integer.parseInt(n1) % Integer.parseInt(n2);
                    String s = String.valueOf(remainder);
                    result.setText(s);
                }
            }
        });

        expBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()) {
                    result.setText("Fill all fields");
                } else {
                    double power = Math.pow(Double.parseDouble(n1), Double.parseDouble(n2));
                    String s = String.valueOf(power);
                    result.setText(s);
                }
            }
        });
    }

    private void calculate(EditText num1, EditText num2, TextView result, String operation) {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        if (n1.isEmpty() || n2.isEmpty()) {
            result.setText("Fill all fields");
            return;
        }

        double number1 = Double.parseDouble(n1);
        double number2 = Double.parseDouble(n2);
        double output;

        switch (operation) {
            case "+":
                output = number1 + number2;
                break;
            case "-":
                output = number1 - number2;
                break;
            case "*":
                output = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    result.setText("Division by zero");
                    return;
                }
                output = number1 / number2;
                break;
            case "%":
                output = number1 % number2;
                break;
            case "^":
                output = Math.pow(number1, number2);
                break;
            default:
                result.setText("Invalid operation");
                return;
        }

        result.setText(String.valueOf(output));
    }
}

