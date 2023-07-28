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

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<RestauranteMolde> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerRestaurantes = findViewById(R.id.listaRestaurantes);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);
    }

    public void crearLista(){
        listaRestaurantes.add(new RestauranteMolde("LA SAZÓN DE MAMÁ","14.500", "Arroz con pollo",R.drawable.foto_resta1) );
        listaRestaurantes.add(new RestauranteMolde("El CARBON","35.500", "Cotillas BBQ",R.drawable.foto_resta2) );
        listaRestaurantes.add(new RestauranteMolde("EL CORRAL","12.500", "Hamburguesas",R.drawable.foto_resta3) );
        listaRestaurantes.add(new RestauranteMolde("El Kabrito","20.500", "Kabro Sudado",R.drawable.foto_resta4) );
        listaRestaurantes.add(new RestauranteMolde("La Pepitoria","14.500", "Pescado",R.drawable.foto_resta5) );
    }
}