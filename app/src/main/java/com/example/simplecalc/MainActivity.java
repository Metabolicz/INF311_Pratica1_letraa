package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickButton(View view) {
        EditText valor1 = findViewById(R.id.editText1);
        EditText valor2 = findViewById(R.id.editText2);
        TextView resp = findViewById(R.id.textView3);
        double n1 = Double.valueOf(valor1.getText().toString());
        int n2 = Integer.valueOf(valor2.getText().toString());
        String tag = view.getTag().toString();
        if (tag.equals("1")) {
            double valor = n1+n2 ;
            resp.setText( getString(R.string.resposta) + valor);
        } else if (tag.equals("2")) {
            double valor = n1-n2;
            resp.setText(getString(R.string.resposta) + valor);
        }
        else if(tag.equals("3")){
            double valor = n1*n2;
            resp.setText(getString(R.string.resposta) + valor);
        }
        else {
                double valor = n1/n2;
            resp.setText(getString(R.string.resposta) + valor);
            }
        }
}