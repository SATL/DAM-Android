package com.fpmislata.practicas.aplicacion15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lista;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.lista);

        String[] data = {"Elemento 1", "Elemento 2", "Elemento 3"};
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        lista.setAdapter(adaptador);
    }
}
