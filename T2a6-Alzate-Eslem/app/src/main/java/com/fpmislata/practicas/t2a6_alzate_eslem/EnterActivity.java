package com.fpmislata.practicas.t2a6_alzate_eslem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
    }


    public void enter(View v){
        String dni = getIntent().getStringExtra("dni");
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("dni", dni);
        startActivity(intent);
    }

    public void exit(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
