package com.example.familia.ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class main extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.editText);
        et2= (EditText)findViewById(R.id.editText2);
        tv3= (TextView)findViewById(R.id.textView3);
    }

    public void sumar(View view)
    {
        String valor1= et1.getText().toString();
        String valor2=et2.getText().toString();

        int num1= Integer.parseInt(valor1);
        int num2= Integer.parseInt(valor2);

        int num3= num1+num2;
        String suma= String.valueOf(num3);

        tv3.setText(suma);
    }
}
