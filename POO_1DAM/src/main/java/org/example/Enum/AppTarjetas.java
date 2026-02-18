package org.example.Enum;
import java.util.Scanner;

public class AppTarjetas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Tarjetas tarjeta = Tarjetas.VISA;

        System.out.println(tarjeta.ordinal());
        System.out.println(tarjeta.name());
        System.out.println();
        System.out.println("Tipo de tarjetas:");

        for(Tarjetas t : Tarjetas.values()) {
            System.out.println(t.name());
        }

        Tarjetas tipo = Tarjetas.valueOf(entrada.next().toUpperCase());

        System.out.println("La tarjeta de tipo " + tipo.name() + " tiene una comisión de " + tipo.getComision() + "€");
    }
}
