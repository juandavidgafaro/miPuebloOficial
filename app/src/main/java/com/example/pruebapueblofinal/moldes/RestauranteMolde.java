package com.example.pruebapueblofinal.moldes;

public class RestauranteMolde {
    private String nombre;
    private String  rangoPrecio;
    private String plato;
    private int foto;

    public RestauranteMolde() {
    }

    public RestauranteMolde(String nombre, String rangoPrecio, String plato, int foto) {
        this.nombre = nombre;
        this.rangoPrecio = rangoPrecio;
        this.plato = plato;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRangoPrecio() {
        return rangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
