package com.engineeringcalculator.calccraft;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isAwesomeSequence = false;
    private TextView tvsec;
    private TextView tvMain;
    private Button bac;
    private Button bc;
    private Button bbrac1;
    private Button bbrac2;
    private Button bsin;
    private Button bcos;
    private Button btan;
    private Button blog;
    private Button bln;
    private Button bfact;
    private Button bsquare;
    private Button bsqrt;
    private Button binv;
    private Button b0;
    private Button b9;
    private Button b8;
    private Button b7;
    private Button b6;
    private Button b5;
    private Button b4;
    private Button b3;
    private Button b2;
    private Button b1;
    private Button bpi;
    private Button bmul;
    private Button bminus;
    private Button bplus;
    private Button bequal;
    private Button bdot;
    private Button bdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {


            tvsec = findViewById(R.id.idTVSecondary);
            tvMain = findViewById(R.id.idTVPrimary);
            bac = findViewById(R.id.idBtnAC);
            bc = findViewById(R.id.idBtnC);
            bbrac1 = findViewById(R.id.idBtnBrac1);
            bbrac2 = findViewById(R.id.idBtnBrac2);
            bsin = findViewById(R.id.idBtnSin);
            bcos = findViewById(R.id.idBtnCos);
            btan = findViewById(R.id.idBtnTan);
            blog = findViewById(R.id.idBtnLog);
            bln = findViewById(R.id.idBtnLog);
            bfact = findViewById(R.id.idBtnfact);
            bsquare = findViewById(R.id.idBtnSquare);
            bsqrt = findViewById(R.id.idBtnRoot);
            binv = findViewById(R.id.idBtnInv);
            b0 = findViewById(R.id.idBtn0);
            b9 = findViewById(R.id.idBtn9);
            b8 = findViewById(R.id.idBtn8);
            b7 = findViewById(R.id.idBtn7);
            b6 = findViewById(R.id.idBtn6);
            b5 = findViewById(R.id.idBtn5);
            b4 = findViewById(R.id.idBtn4);
            b3 = findViewById(R.id.idBtn3);
            b2 = findViewById(R.id.idBtn2);
            b1 = findViewById(R.id.idBtn1);
            bpi = findViewById(R.id.idBtnPi);
            bmul = findViewById(R.id.idBtnMul);
            bminus = findViewById(R.id.idBtnSub);
            bplus = findViewById(R.id.idBtnAdd);
            bequal = findViewById(R.id.idBtnEqual);
            bdot = findViewById(R.id.idBtnDot);
            bdiv = findViewById(R.id.idBtnDiv);

            // Delay the animation for a few milliseconds to ensure the view is initialized
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Create and set up the animation
                    Animation slideInAnimation = new TranslateAnimation(
                            Animation.RELATIVE_TO_PARENT, 1.0f, // Start from outside the right of the view
                            Animation.RELATIVE_TO_PARENT, 0.0f, // End at the original position (left)
                            Animation.RELATIVE_TO_PARENT, 0.0f,
                            Animation.RELATIVE_TO_PARENT, 0.0f
                    );

                    slideInAnimation.setDuration(1000); // Adjust the duration as needed
                    tvsec.startAnimation(slideInAnimation);
                    tvsec.setVisibility(View.VISIBLE); // Make the TextView visible after the animation
                }
            }, 500); // Delay for 500 milliseconds (adjust as needed)


            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "0");
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "1");
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "2");
                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "3");
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "4");
                }
            });

            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "5");
                }
            });

            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "6");
                }
            });

            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "7");
                }
            });

            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "8");
                }
            });

            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "9");
                }
            });

            // Similarly, set onClickListeners for the other buttons...
            // (omitting them for brevity)

            // Decimal Point
            bdot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + ".");
                }
            });

            bbrac1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvMain.setText(tvMain.getText().toString() + "(");
                }
            });

            bbrac2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvMain.setText(tvMain.getText().toString() + ")");
                }
            });

            bpi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvMain.setText(tvMain.getText().toString() + "3.142");
                    tvsec.setText("π");
                }
            });

            bac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText("");
                    tvsec.setText("");
                }
            });

            bc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = tvMain.getText().toString();
                    if (!str.equals("")) {
                        str = str.substring(0, str.length() - 1);
                        tvMain.setText(str);
                    }
                }
            });

            // Square (e.g., 2^2)
            bsquare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String currentText = tvMain.getText().toString();

                    // Check if the current text is empty or ends with a valid operator
                    if (!currentText.isEmpty() && !isOperator(currentText.substring(currentText.length() - 1))) {
                        tvMain.setText(currentText + "^2");
                    } else {
                        // Display a toast message for invalid operation
                        Toast.makeText(MainActivity.this, "Invalid operation. Operand required.", Toast.LENGTH_SHORT).show();
                    }
                }
            });






            // Addition
            bplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "+");
                }
            });

            // Subtraction
            bminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = tvMain.getText().toString();
                    if (!str.isEmpty() && !str.endsWith("-")) {
                        tvMain.setText(str + "-");
                    }
                }
            });

            // Multiplication
            bmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = tvMain.getText().toString();
                    if (!str.isEmpty() && !str.endsWith("*")) {
                        tvMain.setText(str + "*");
                    }
                }
            });

            // Division
            bdiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = tvMain.getText().toString();
                    if (!str.isEmpty() && !str.endsWith("/")) {
                        tvMain.setText(str + "/");
                    }
                }
            });

            // Equals (Evaluate)
            bequal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = tvMain.getText().toString();
                    if (!str.isEmpty()) {
                        double result = evaluate(str);
                        tvMain.setText(String.valueOf(result));
                        tvsec.setText(str);
                    } else {
                        // Handle the case where the input is empty
                        Toast.makeText(MainActivity.this, "Please enter an expression", Toast.LENGTH_SHORT).show();
                    }
                }
            });


            // Inverse (e.g., 2^-1)
            binv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "^(-1)");
                }
            });

            // Square Root
            bsqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = tvMain.getText().toString();
                    if (!str.isEmpty()) {
                        double number = Double.parseDouble(str);
                        double result = Math.sqrt(number);
                        tvMain.setText(String.valueOf(result));
                        tvsec.setText("√" + str);
                    }
                }
            });

            // Factorial (e.g., 5!)
            bfact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = tvMain.getText().toString();
                    if (!str.isEmpty()) {
                        int value = Integer.parseInt(str);
                        if (value >= 0) { // Check for non-negative input
                            int result = factorial(value);
                            tvMain.setText(String.valueOf(result));
                            tvsec.setText(str + "!");
                        } else {
                            // Handle negative input (optional)
                            Toast.makeText(MainActivity.this, "Factorial is not defined for negative numbers", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        // Handle empty input (optional)
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }
                }
            });


            // Trigonometric Functions (e.g., sin, cos, tan)
            bsin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "sin");
                }
            });

            bcos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "cos");
                }
            });

            btan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "tan");
                }
            });

            // Logarithmic Functions (e.g., log, ln)
            blog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "log");
                }
            });

            bln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvMain.setText(tvMain.getText().toString() + "ln");
                }
            });


            // Similarly, set onClickListeners for the other buttons...
            // (omitting them for brevity)

        }catch (Exception e)
        {
            Toast.makeText(MainActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    private boolean isTrigonometricOperator(String text) {
        return text.equals("sin") || text.equals("cos") || text.equals("tan") || text.equals("log") || text.equals("ln");
    }

    private boolean isOperator(String text) {
        return text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/") || text.equals("^") || text.equals("√");
    }

    //############### Here ###########
    // Implement the factorial and evaluate methods...

    // Factorial function
    public int factorial(int n) {
        // This method is used to find the factorial
        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Evaluate function
    public double evaluate(String str) {
        try {
            return new Object() {
                int pos = -1;
                int ch = 0;

                void nextChar() {
                    ch = ++pos < str.length() ? str.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    while (true) {
                        if (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    while (true) {
                        if (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus
                    double x;
                    int startPos = pos;
                    if (eat('(')) {
                        x = parseExpression();
                        eat(')');
                    } else if (ch >= '0' && ch <= '9' || ch == '.') {
                        while (pos < str.length() && (ch >= '0' && ch <= '9' || ch == '.'))
                            nextChar();
                        x = Double.parseDouble(str.substring(startPos, pos));
                    } else if (ch >= 'a' && ch <= 'z') {
                        while (ch >= 'a' && ch <= 'z') nextChar();
                        String func = str.substring(startPos, pos);
                        x = parseFactor();
                        if (func.equals("sqrt")) x = Math.sqrt(x);
                        else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                        else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                        else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                        else if (func.equals("log")) x = Math.log10(x);
                        else if (func.equals("ln")) x = Math.log(x);
                        else throw new RuntimeException("Unknown function: " + func);
                    } else {
                        throw new RuntimeException("Unexpected: " + (char) ch);
                    }

                    // Check if the square operation "^2" follows
                    if (eat('^')) {
                        if (eat('2')) {
                            x = Math.pow(x, 2);
                        } else {
                            throw new RuntimeException("Expected '2' after '^' for square operation");
                        }
                    }

                    return x;
                }


            }.parse();
        } catch (Exception e){
            Toast.makeText(MainActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return Double.NaN; // Return a special value to indicate an error
        }
    }



}