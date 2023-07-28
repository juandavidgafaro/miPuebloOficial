package com.example.pruebapueblofinal.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebapueblofinal.R;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.SitioMolde;

import java.util.ArrayList;

public class SitiosAdaptador extends RecyclerView.Adapter<SitiosAdaptador.viewHolder>  {

    //ATRIBUTOS
    public ArrayList<SitioMolde> listaSitios;

    //CONSTRUCTOR
    public SitiosAdaptador(ArrayList<SitioMolde> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public SitiosAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldesitio,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull SitiosAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaSitios.get(i));

    }

    @Override
    public int getItemCount() {

        return  listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreSitio;
        TextView telSitio;
        TextView precioSitio;
        ImageView fotoSitio;

        public viewHolder(View item) {
            super(item);
            fotoSitio = item.findViewById(R.id.fotositio);
            nombreSitio = item.findViewById(R.id.nombresitio);
            telSitio = item.findViewById(R.id.celsitio);
            precioSitio = item.findViewById(R.id.preciositio);
        }

        public void actualizarDatos(SitioMolde moldeSitios) {
            fotoSitio.setImageResource(moldeSitios.getFoto());
            nombreSitio.setText(moldeSitios.getNombre());
            telSitio.setText(moldeSitios.getTelefono());
            precioSitio.setText(moldeSitios.getPrecio());
        }
    }

}
