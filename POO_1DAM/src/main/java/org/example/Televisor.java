package org.example;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor(int canal, int volumen) {

        this.canal = canal;
        this.volumen = volumen;
    }

    public Televisor() {
        canal = 1;
        volumen = 5;
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
            canal = canal + 1;
        }
    }

    public void bajarCanal() {

        System.out.println("Bajando canal...");

        if (canal == 1) {
            canal = 99;
        }else{
            canal = canal - 1;
        }
    }
}
