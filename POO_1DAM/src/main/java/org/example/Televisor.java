package org.example;

public class Televisor {

    private int canal;
    private int volumen;
    private static final int def_canal = 1;
    private static final int def_volumen = 5;

    public Televisor(int canal, int volumen) {

        this.canal = canal;
        this.volumen = volumen;
    }

    public Televisor() {
        canal = def_canal;
        volumen = def_volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void imprimirInfoTele() {

        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
    }

    public void subirCanal() {

        System.out.println("Subiendo canal...");

        if (canal == 99){
            canal = 1;
        }else{
            canal++;
        }

        System.out.println("Canal: " + canal);
    }

    public void bajarCanal() {

        System.out.println("Bajando canal...");

        if (canal == 1) {
            canal = 99;
        }else{
            canal--;
        }

        System.out.println("Canal: " + canal);
    }

    public void subirVolumen() {

        System.out.println("Subiendo el volumen...");

        if (volumen >= 100) {
            System.out.println("No se puede subir el volumen");
        }else{
            volumen++;
        }

        System.out.println("Volumen: " + volumen);
    }

    public void bajarVolumen() {

        System.out.println("Bajando el volumen...");

        if (volumen <= 0) {
            System.out.println("No se puede bajar el volumen");
        }else{
            volumen--;
        }

        System.out.println("Volumen: " + volumen);
    }
}
