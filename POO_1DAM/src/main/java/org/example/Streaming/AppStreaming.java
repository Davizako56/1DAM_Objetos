package org.example.Streaming;

public class AppStreaming {

    public static void main(String[] args) {

        PlanGratis gratis = new PlanGratis("plan gratis", 0);
        gratis.mostrarInfo();
        System.out.println();
        gratis.obtenerBeneficios();
        System.out.println();
        gratis.obtenerPeriodoPrueba();
    }
}
