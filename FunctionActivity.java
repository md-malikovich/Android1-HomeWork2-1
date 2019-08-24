package com.example.calculatorpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunctionActivity extends AppCompatActivity {

    static final String MY_KEY3 = "name_key";

    TextView num1Text;
    TextView num2Text;

    Button btnAdd, btnSub, btnMulti, btnDiv;

    //int Val1, Val2;

    boolean addition, subtract, multiplication, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        num1Text = findViewById(R.id.num1_text);
        num2Text = findViewById(R.id.num2_text);

        final Intent intent = getIntent();

        final String fNum = intent.getStringExtra(MainActivity.MY_KEY1);
        num1Text.setText(fNum);

        final String sNum = intent.getStringExtra(MainActivity.MY_KEY2);
        num2Text.setText(sNum);

        btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fNum != null) {
                    if (sNum != null) {
                        String result;
                        result = fNum + sNum; // здесь происходит просто конкатинация. Не смог пока сложить числа. В процессе.
                        addition = true;
                        Intent intent = new Intent(FunctionActivity.this, EqualActivity.class);
                        intent.putExtra(MY_KEY3, result);
                        startActivity(intent);
                    }

                }
            }
        });

        btnSub = findViewById(R.id.btn_sub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // еще думаю
            }
        });


        btnMulti = findViewById(R.id.btn_multi);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // еще думаю
            }
        });


        btnDiv = findViewById(R.id.btn_div);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // еще думаю
            }
        });



    }
}