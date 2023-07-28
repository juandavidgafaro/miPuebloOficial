package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    //
    ArrayList<MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerHoteles = findViewById(R.id.listaHoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }

    public void crearLista(){
        listaHoteles.add(new MoldeHotel("HOTEL El BUEN DORMIR","199000",R.drawable.foto_hotel1) );
        listaHoteles.add(new MoldeHotel("HOTEL LAS GALAXIAS ","199100",R.drawable.foto_hotel2) );
        listaHoteles.add(new MoldeHotel("HOTEL LAS ESTRELLAS","199200",R.drawable.foto_hotel3) );
        listaHoteles.add(new MoldeHotel("HOTEL EL ENANO","199300",R.drawable.foto_hotel4) );
        listaHoteles.add(new MoldeHotel("HOTEL LA ESQUINA","199400",R.drawable.foto_hotel5) );
    }

}