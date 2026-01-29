package org.example.Inmobiliaria;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomestico> listaElectrodomesticos;

    public Habitacion(String nombre, double metros) {

        this.nombre = nombre;
        this.metros = metros;
        listaElectrodomesticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public ArrayList<Electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodomestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    public void crearElectrodomestico(String nombre, double consumo) {

        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo);

        for(Electrodomestico e : listaElectrodomesticos) {

            if (e.getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("El electrodoméstico " + nombre + " ya existe en esta habitación");
                return;
            }
        }

        listaElectrodomesticos.add(electrodomestico);
    }

    public void mostrarElectrodomesticos() {

        System.out.println("La habitacion " + nombre + " tiene " + listaElectrodomesticos.size() + ":");

        for(Electrodomestico electrodomestico : listaElectrodomesticos) {
            System.out.println("- " + electrodomestico.getNombre() + " (" + electrodomestico.getConsumo() + ")kWh");
        }
    }

    public double calcularConsumo() {

        double resultado = 0;

        for(Electrodomestico electrodomestico : listaElectrodomesticos) {

            resultado += electrodomestico.getConsumo();
        }

        return resultado;
    }

    @Override

    public String toString() {

        return "[nombre = " + nombre + ", metros = " + metros + "]";
    }
}
