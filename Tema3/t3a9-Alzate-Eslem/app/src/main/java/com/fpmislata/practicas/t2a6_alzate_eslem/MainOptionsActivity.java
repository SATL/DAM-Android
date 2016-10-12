package com.fpmislata.practicas.t2a6_alzate_eslem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_options);
    }

    public void exit(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void info(View v){
        Intent intent= new Intent(this, InfoActivity.class);
        startActivity(intent);
    }

    public void changePass(View v){
        Intent intent= new Intent(this, ChangePassActivity.class);
        startActivity(intent);
    }
}
