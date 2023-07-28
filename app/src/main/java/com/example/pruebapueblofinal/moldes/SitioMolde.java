package com.example.pruebapueblofinal.moldes;

public class SitioMolde {
    private int foto;
    private String nombre;
    private String  telefono;
    private String precio;

    public SitioMolde() {
    }

    public SitioMolde(int foto, String nombre, String telefono, String precio) {
        this.foto = foto;
        this.nombre = nombre;
        this.telefono = telefono;
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
