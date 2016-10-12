package com.fpmislata.practicas.t2a6_alzate_eslem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goLogin(View v){
        Intent goIntent = new Intent(this, SignInActivity.class);
        startActivity(goIntent);
    }
}
