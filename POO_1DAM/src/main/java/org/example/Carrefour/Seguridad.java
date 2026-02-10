package org.example.Carrefour;
import java.util.ArrayList;
import java.util.Scanner;

public class Seguridad extends Persona{
    static Scanner entrada = new Scanner(System.in);

    private String empresa;
    private ArrayList<String> armas;

    public Seguridad(int codigo, String nombre, double sueldo, String empresa) {

        super(codigo, nombre, sueldo);
        this.empresa = empresa;
        armas = new ArrayList<>();
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void añadirArma(String arma) {

        if (armas.contains(arma.toLowerCase())) {
            System.out.println("Este segurata ya tiene este arma.");
        }else{
            armas.add(arma.toLowerCase());
        }
    }

    public void borrarArma(String arma) {

        if (armas.contains(arma.toLowerCase())) {
            armas.remove(arma.toLowerCase());
        }else{
            System.out.println("El segurata no posee esta arma actualmente.");
        }
    }

    public void mostrarArmas() {

        System.out.println("Armas de " + getNombre());

        for (String s : armas) {
            System.out.println("- " + s);
        }
    }

    @Override

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Segurata con las armas " + armas + " y empresa " + empresa);
    }

    @Override

    public String toString() {

        return "[Armas = " + armas + "]";
    }
}
