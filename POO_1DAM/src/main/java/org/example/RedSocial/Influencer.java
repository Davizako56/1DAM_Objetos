package org.example.RedSocial;
import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreDeUsuario, int seguidores) {
        super(nombre, edad, nombreDeUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    public void anyadirColaboracion(String colaboracion) {

        if(colaboraciones.contains(colaboracion.toLowerCase())) {
            System.out.println("Esta colaboración ya está en curso.");
        }else{
            colaboraciones.add(colaboracion.toLowerCase());
        }
    }

    public void borrarColaboracion(String colaboracion) {

        if(colaboraciones.contains(colaboracion.toLowerCase())) {
            colaboraciones.remove(colaboracion.toLowerCase());
        }else{
            System.out.println("Este influencer no tiene esta colaboración.");
        }
    }

    @Override

    public void mostrarInfo() {

        System.out.println("Información del influencer:");
        super.mostrarInfo();
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
