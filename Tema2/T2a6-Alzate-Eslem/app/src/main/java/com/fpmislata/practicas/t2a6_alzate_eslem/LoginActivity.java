package com.fpmislata.practicas.t2a6_alzate_eslem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity {

    private EditText dniEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dniEditText = (EditText) findViewById(R.id.dni);
    }


    public void enter(View v){
        String dni = dniEditText.getText().toString();
        System.out.println(dni);

        if(dniEditText.getText().length() ==0){
            Toast errToast = Toast.makeText(this, "El DNI no puede ir vacio", Toast.LENGTH_SHORT);
            errToast.show();
            return;
        }


        Intent intent = new Intent(LoginActivity.this, EnterActivity.class);
        intent.putExtra("dni", dni);
        startActivity(intent);
    }

}

