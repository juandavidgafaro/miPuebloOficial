package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.adaptadores.RestauranteAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.RestauranteMolde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaRestaurantes extends AppCompatActivity {

    Map<String, String[]> dataRestaurantes = new HashMap<>();

    ArrayList<RestauranteMolde> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        //Obtener los texto del archivo strings:
        String[] nombresRestaurantes = getResources().getStringArray(R.array.ArrayNombresRestaurantes);
        String[] nombresPlatoRestaurantes = getResources().getStringArray(R.array.ArrayNombresPLatosRestaurantes);
        String[] preciosRestaurantes = getResources().getStringArray(R.array.ArrayPreciosRestaurantes);

        dataRestaurantes.put("Nombres", nombresRestaurantes);
        dataRestaurantes.put("Platos", nombresPlatoRestaurantes);
        dataRestaurantes.put("Precios", preciosRestaurantes);

        recyclerRestaurantes = findViewById(R.id.listaRestaurantes);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista(dataRestaurantes);
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);
    }

    public void crearLista(Map<String, String[]> dataRestaurantes){
        listaRestaurantes.add(new RestauranteMolde(dataRestaurantes.get("Nombres")[0],dataRestaurantes.get("Precios")[0],dataRestaurantes.get("Platos")[0] ,R.drawable.foto_resta1) );
        listaRestaurantes.add(new RestauranteMolde(dataRestaurantes.get("Nombres")[1],dataRestaurantes.get("Precios")[1],dataRestaurantes.get("Platos")[1] ,R.drawable.foto_resta2) );
        listaRestaurantes.add(new RestauranteMolde(dataRestaurantes.get("Nombres")[2],dataRestaurantes.get("Precios")[2],dataRestaurantes.get("Platos")[2] ,R.drawable.foto_resta3) );
        listaRestaurantes.add(new RestauranteMolde(dataRestaurantes.get("Nombres")[3],dataRestaurantes.get("Precios")[3],dataRestaurantes.get("Platos")[3] ,R.drawable.foto_resta4) );
        listaRestaurantes.add(new RestauranteMolde(dataRestaurantes.get("Nombres")[4],dataRestaurantes.get("Precios")[4],dataRestaurantes.get("Platos")[4] ,R.drawable.foto_resta5) );
    }
}