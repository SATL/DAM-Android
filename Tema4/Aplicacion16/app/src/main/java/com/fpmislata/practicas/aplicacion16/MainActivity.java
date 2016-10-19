package com.fpmislata.practicas.aplicacion16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

package com.fpmislata.practicas.aplicacion16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    MiArrayAdapter<Tarea> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Instancia del ListView
        lista = (ListView)findViewById(R.id.lista);
//Inicializar el adaptador con la fuente de datos
        adaptador = new MiArrayAdapter<Tarea>(this, DatosTareas.TAREAS);
//Relacionando la lista con el adaptador
        lista.setAdapter(adaptador);
    }
}

