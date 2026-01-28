package org.example.Biblioteca;
import java.util.ArrayList;

public class Editorial {

    private String nombre;
    private String pais;
    private ArrayList<Libro> listaLibros;

    public Editorial(String nombre, String pais) {

        this.nombre = nombre;
        this.pais = pais;
        listaLibros = new ArrayList<Libro>();
    }

    public Editorial() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void insertarLibro(Libro libro) {

        listaLibros.add(libro);
    }

    public void borrarLibro(Libro libro) {

        listaLibros.remove(libro);
    }

    @Override
    public String toString() {

        return "[nombre = " + nombre + ", país = " + pais + "]";
    }
}
