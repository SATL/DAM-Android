package com.fpmislata.practicas.t2a6_alzate_eslem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView dniTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        dniTextView = (TextView) findViewById(R.id.dniTextView);
        dniTextView.setText(getIntent().getStringExtra("dni"));
    }

    public void goOptions(View v){
        Intent intent= new Intent(this, MainOptionsActivity.class);
        startActivity(intent);
    }
}
