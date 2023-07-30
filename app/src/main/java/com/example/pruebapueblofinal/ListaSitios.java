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
import java.util.HashMap;
import java.util.Map;

public class ListaSitios extends AppCompatActivity {

    Map<String, String[]> dataSitios = new HashMap<>();
    ArrayList<SitioMolde> listaSitios = new ArrayList<>();
    RecyclerView recyclerSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] nombresSitios = getResources().getStringArray(R.array.ArrayNombresSitios);
        String[] telefonosSitios = getResources().getStringArray(R.array.ArrayTelefonosSitios);
        String[] preciosSitios = getResources().getStringArray(R.array.ArrayPreciosSitios);

        dataSitios.put("nombres", nombresSitios);
        dataSitios.put("telefonos", telefonosSitios);
        dataSitios.put("precios", preciosSitios);

        setContentView(R.layout.activity_lista_sitios);
        recyclerSitios = findViewById(R.id.listaSitios);
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista(dataSitios);
        SitiosAdaptador adaptador = new SitiosAdaptador(listaSitios);
        recyclerSitios.setAdapter(adaptador);
    }

    public void crearLista(Map<String, String[]> dataSitios){
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio1, dataSitios.get("nombres")[0], dataSitios.get("telefonos")[0], dataSitios.get("precios")[0]));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio2, dataSitios.get("nombres")[1], dataSitios.get("telefonos")[1], dataSitios.get("precios")[1]));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio3, dataSitios.get("nombres")[2], dataSitios.get("telefonos")[2], dataSitios.get("precios")[2]));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio4, dataSitios.get("nombres")[3], dataSitios.get("telefonos")[3], dataSitios.get("precios")[3]));
        listaSitios.add(new SitioMolde(R.drawable.foto_sitio5, dataSitios.get("nombres")[4], dataSitios.get("telefonos")[4], dataSitios.get("precios")[04]));
    }
}