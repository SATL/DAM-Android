package com.fpmislata.practicas.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean mostrando = true, inicio = true;
    TextView operationsTV, resultTV;
    Double valorGuardado = 0.0;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTV = (TextView) findViewById(R.id.result);
        operationsTV = (TextView) findViewById(R.id.operations);
    }

    public void numberClick(View v){
        if (mostrando) {
            resultTV.setText("");
            mostrando = false;
        }
        Button number = (Button) v;

        resultTV.setText(resultTV.getText().toString()
                + number.getText().toString());
        if(inicio){
            operationsTV.setText("");
            inicio=false;
        }
        operationsTV.setText(operationsTV.getText().toString()+number.getText().toString());
    }

    public void equalsClick(View v) {
        calcularAnterior();
        operator = "";
        resultTV.setText(""+valorGuardado);
    }

    public void cnCNClick(View v) {
        resultTV.setText("");
        operationsTV.setText("");
        mostrando = false;
        valorGuardado = 0.0;
    }
    public void cnCClick(View v) {
        if(mostrando)
            return;
        String top = operationsTV.getText().toString();
        String[] operations = top.split("(\\+|\\-)");
        System.out.println(operations.length);
        if(operations.length==1)
            operationsTV.setText("");
        else{
            String lastOp = operations[operations.length-1];
            String newOp = top.substring( 0, top.length()- lastOp.length() );
            System.out.println(newOp);
            operationsTV.setText(newOp);
        }
        resultTV.setText("");
    }

    public void operation(View v) {
        calcularAnterior();
        Button operador = (Button) v;
        operator = operador.getText().toString();
        operationsTV.setText(operationsTV.getText().toString()+operator);
    }


    public void calcularAnterior() {
        if (valorGuardado == 0.0) {
            valorGuardado = Double.valueOf(resultTV.getText().toString());
            resultTV.setText("");
        } else {

            if (operator.equals("+")) {
                valorGuardado = valorGuardado
                        + Double.valueOf(resultTV.getText().toString());
            } else if (operator.equals("-")) {
                valorGuardado = valorGuardado
                        - Double.valueOf(resultTV.getText().toString());
            } else if (operator.equals("x")) {
                valorGuardado = valorGuardado
                        * Double.valueOf(resultTV.getText().toString());
            } else if (operator.equals("/")) {
                valorGuardado = valorGuardado
                        / Double.valueOf(resultTV.getText().toString());
            }

            resultTV.setText("" + valorGuardado);
            mostrando = true;

        }
    }
}
