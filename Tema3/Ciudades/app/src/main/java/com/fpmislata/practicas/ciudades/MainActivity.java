package com.fpmislata.practicas.ciudades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    Spinner paises;
    Spinner ciudades;
    TextView texto;
    HashMap<Integer, String[]> countriesMap = new HashMap<>();
    int selectedCountry = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paises = (Spinner) findViewById(R.id.paises);
        ciudades = (Spinner) findViewById(R.id.ciudades);
        texto = (TextView) findViewById(R.id.texto);

        String[] spain = getResources().getStringArray(R.array.ciudadesespana);
        String[] france = getResources().getStringArray(R.array.ciudadesfrancia);
        String[] german = getResources().getStringArray(R.array.ciudadesalemania);


        countriesMap.put(0, spain);
        countriesMap.put(1, german);
        countriesMap.put(2, france);

        //setCities(selectedCountry);
        //setCity(0);

        paises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setCities(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ciudades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setCity(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    private void setCities(int num){
        selectedCountry=num;
        ArrayAdapter<String> adf=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, countriesMap.get(num));
        ciudades.setAdapter(adf);
    }

    private void setCity(int position){
        String[] cities = countriesMap.get(selectedCountry);
        String city = cities[position];
        texto.setText(city);
    }
}
