package com.example.googleplaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.googleplaymusic.models.Artista;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    List<Artista> artistaList;
    List<String> listaNombreArtistas;
    ListView lvRegistros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        inicializer();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaNombreArtistas);
        lvRegistros.setAdapter(arrayAdapter);

    }
    private void inicializer(){
        artistaList = new ArrayList<>();
        listaNombreArtistas = new ArrayList<>();
        lvRegistros = findViewById(R.id.lv_registros);
        llenarLista();


    }
    private void llenarLista(){

        artistaList.add(new Artista(1061796056,"Santiago","Cruz","santi@gmail.com",312657554));
        artistaList.add(new Artista(1061777777,"Carlos","Maya","carlos@gmail.com",3155555));
        artistaList.add(new Artista(1061999999,"Gustavo","Rodriguez","garo@gmail.com",312688888));

        for (int i =0; i<artistaList.size(); i++){
            listaNombreArtistas.add(artistaList.get(i).getNombre());
        }
    }
}
