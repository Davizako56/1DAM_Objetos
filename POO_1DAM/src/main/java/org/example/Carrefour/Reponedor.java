package org.example.Carrefour;
import java.util.Scanner;

public class Reponedor extends Persona{
    static Scanner entrada = new Scanner(System.in);

    private int pasillo;

    public Reponedor(int codigo, String nombre, double sueldo) {

        super(codigo, nombre, sueldo);
        setPasillo();
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo() {

        System.out.println("Introduce el número del pasillo:");
        pasillo = entrada.nextInt();
    }

    @Override

    public void trabajar() {
        System.out.println("Recogiendo cajas...");
    }

    @Override

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Reponedor que trabaja en el pasillo " + pasillo);
    }

    @Override

    public String toString() {

        return "[Pasillo = " + pasillo + "]";
    }
}
