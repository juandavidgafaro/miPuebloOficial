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
import com.example.pruebapueblofinal.moldes.RestauranteMolde;

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    //ATRIBUTOS
    public ArrayList<RestauranteMolde> listaRestaurante;

    //CONSTRUCTOR
    public RestauranteAdaptador(ArrayList<RestauranteMolde> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurante.get(i));

    }

    @Override
    public int getItemCount() {

        return  listaRestaurante.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreRestaurante;
        TextView nombrePlato;
        TextView precio;
        ImageView fotoRestaurante;

        public viewHolder(View item) {
            super(item);
            nombreRestaurante = item.findViewById(R.id.titulorestaurante);
            nombrePlato = item.findViewById(R.id.mejorplato);
            precio = item.findViewById(R.id.precioplato);
            fotoRestaurante = item.findViewById(R.id.fotorestaurante);
        }

        public void actualizarDatos(RestauranteMolde moldeRestaurante) {
            nombreRestaurante.setText(moldeRestaurante.getNombre());
            nombrePlato.setText(moldeRestaurante.getPlato());
            precio.setText(moldeRestaurante.getRangoPrecio());
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
        }
    }
}
