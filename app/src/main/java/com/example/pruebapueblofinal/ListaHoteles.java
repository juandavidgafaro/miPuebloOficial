package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.Settings;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        //Obtener los texto del archivo strings:
        String[] nombresHoteles = getResources().getStringArray(R.array.ArrayNombreHoteles);
        String[] preciosHoteles = getResources().getStringArray(R.array.ArrayPreciosHoteles);

        recyclerHoteles = findViewById(R.id.listaHoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista(nombresHoteles, preciosHoteles);
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }

    public void crearLista(String[] nombresHoteles, String[] preciosHoteles){
        listaHoteles.add(new MoldeHotel(nombresHoteles[0],preciosHoteles[0],R.drawable.foto_hotel1) );
        listaHoteles.add(new MoldeHotel(nombresHoteles[1],preciosHoteles[1],R.drawable.foto_hotel2) );
        listaHoteles.add(new MoldeHotel(nombresHoteles[2],preciosHoteles[2],R.drawable.foto_hotel3) );
        listaHoteles.add(new MoldeHotel(nombresHoteles[3],preciosHoteles[3],R.drawable.foto_hotel4) );
        listaHoteles.add(new MoldeHotel(nombresHoteles[4],preciosHoteles[4],R.drawable.foto_hotel5) );
    }

}