package com.fpmislata.practicas.t2a6_alzate_eslem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    private EditText dniEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        dniEditText = (EditText) findViewById(R.id.dni);
    }

    public void enter(View v){
        String dni = dniEditText.getText().toString();

        if(dniEditText.getText().length() ==0){
            Toast errToast = Toast.makeText(this, "El DNI no puede ir vacio", Toast.LENGTH_SHORT);
            errToast.show();
            return;
        }

        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("dni", dni);
        startActivity(intent);
    }


    public void exit(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
