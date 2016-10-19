package com.fpmislata.practicas.pmdm_t4a11_alzate_eslem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    MiArrayAdapter<Food> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView)findViewById(R.id.list);
        adaptador = new MiArrayAdapter<Food>(this, FoodList.FOOD_LIST);
        lista.setAdapter(adaptador);
    }
}
