package com.rick.huaweicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number_a;
    EditText number_b;
    EditText result;

    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        bindListener();

    }
    public void initViews(){
        number_a = findViewById(R.id.number_a);
        number_b = findViewById(R.id.number_b);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);
    }

    public void bindListener(){
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult();
            }
        });
    }

    public void calculateResult(){
        float number_a = 0f;
        float number_b = 0f;
        float result = 0f;

        number_a = Float.parseFloat(this.number_a.getText().toString());
        number_b = Float.parseFloat(this.number_b.getText().toString());

        result = number_a + number_b;

        this.result.setText(result+"");
    }
}