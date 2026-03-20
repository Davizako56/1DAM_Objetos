package org.example.StringBuilder;
import java.util.Random;

public class Bus {

    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        int a = 0;
        int b = 0;// POSICIÓN INICIAL DEL AUTOBÚS

        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM && b < TAM) {

            int num = random.nextInt(2);

            if(num == 0) {
                a++;
            }else{
                b++;
            }

            limpiarPantalla();

            if (a < TAM && a < b) {
                System.out.println(dibujarCarrera(a, b));
                Thread.sleep(70);
            }

        }

        if(a > b) {
            System.out.println("\033[32m" + "EL AUTOBUSITO IES MUTXAMEL HA LLEGADO A SU DESTINO!!" + "\033[0m");
        }else{
            System.out.println("\033[32m" + "EL AUTOBUSITO BERLANGA HA LLEGADO A SU DESTINO!!" + "\033[0m");
        }

    }

    public static String dibujarCarrera(int n1, int n2) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   IES MUTXAMEL  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));

        sb.append("\n");

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("________________    ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|   BERLANGA      |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }


}
