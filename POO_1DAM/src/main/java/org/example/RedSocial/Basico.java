package org.example.RedSocial;

public class Basico extends Usuario{

    public Basico(String nombre, int edad, String nombreDeUsuario, int seguidores) {
        super(nombre, edad, nombreDeUsuario, seguidores);
    }

    @Override

    public void mostrarInfo() {

        System.out.println("Información de la persona normal:");
        super.mostrarInfo();
    }
}
