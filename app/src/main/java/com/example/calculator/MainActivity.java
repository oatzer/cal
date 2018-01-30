package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etnumber1;
    private EditText etnumber2;
    private Button btnplus;
    private Button btnminus;
    private Button btnmultiply;
    private Button btndivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnumber1 = findViewById(R.id.etnumber1);
        etnumber2 = findViewById(R.id.etnumber2);
        btnplus = findViewById(R.id.btnplus);
        btnminus = findViewById(R.id.btnminus);
        btnmultiply = findViewById(R.id.btnmultiply);
        btndivision = findViewById(R.id.btndivision);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberone = Integer.parseInt(etnumber1.getText().toString());
                int numbertwo = Integer.parseInt(etnumber2.getText().toString());
                Toast.makeText(MainActivity.this, String.valueOf(plus(numberone,numbertwo)), Toast.LENGTH_SHORT).show();
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberone = Integer.parseInt(etnumber1.getText().toString());
                int numbertwo = Integer.parseInt(etnumber2.getText().toString());
                minus(numberone,numbertwo);
                Toast.makeText(MainActivity.this, String.valueOf(minus(numberone,numbertwo)), Toast.LENGTH_SHORT).show();
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberone = Integer.parseInt(etnumber1.getText().toString());
                int numbertwo = Integer.parseInt(etnumber2.getText().toString());
                multiply(numberone,numbertwo);
                Toast.makeText(MainActivity.this, String.valueOf(multiply(numberone,numbertwo)), Toast.LENGTH_SHORT).show();
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberone = Integer.parseInt(etnumber1.getText().toString());
                int numbertwo = Integer.parseInt(etnumber2.getText().toString());
                division(numberone,numbertwo);
                Toast.makeText(MainActivity.this, String.valueOf(division(numberone,numbertwo)), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int plus(int numberone ,int numbertwo){
        return numberone + numbertwo;
    }

    private int minus(int numberone ,int numbertwo){
        return numberone - numbertwo;
    }

    private int multiply(int numberone ,int numbertwo){
        return numberone * numbertwo;
    }

    private int division(int numberone ,int numbertwo){
        if(numbertwo == 0)
        {
            return 0;
        }
        else
        {
        return numberone / numbertwo;
        }
    }
}
