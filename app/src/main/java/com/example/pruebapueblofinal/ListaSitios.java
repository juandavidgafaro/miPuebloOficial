package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.adaptadores.SitiosAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.SitioMolde;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList<SitioMolde> listaSitios = new ArrayList<>();
    RecyclerView recyclerSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerSitios = findViewById(R.id.listaSitios);
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        SitiosAdaptador adaptador = new SitiosAdaptador(listaSitios);
        recyclerSitios.setAdapter(adaptador);
    }

    public void crearLista(){
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio1, "PUEBLO VIEJO", "3227854623", "7.000"));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio2, "LA LAGUNA", "3229954623", "15.000"));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio3, "LA FINCA", "3227833323", "30.000"));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio4, "EL JARDIN", "3227854685", "11.000"));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio5, "EL SALON DE LA ARTES", "3299954623", "6.000"));
    }
}