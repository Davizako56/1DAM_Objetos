package org.example.Carrefour;
import java.util.Scanner;

public class Cajero extends Persona{
    static Scanner entrada = new Scanner(System.in);

    private int caja;

    public Cajero(int codigo, String nombre, double sueldo) {

        super(codigo, nombre, sueldo);
        setCaja();
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja() {

        System.out.println("Introduce la caja registradora:");
        caja = entrada.nextInt();
    }

    @Override

    public void trabajar() {
        System.out.println("Cobrando productos...");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cajero que trabaja en la caja " + caja);
    }

    @Override

    public String toString() {

        return "[Caja = " + caja + "]";
    }
}
