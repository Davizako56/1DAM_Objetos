package org.example.RedSocial;

public class Usuario {

    private String nombre;
    private int edad;
    private String nombreDeUsuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombreDeUsuario, int seguidores) {

        this.nombre = nombre;
        this.edad = edad;
        this.nombreDeUsuario = nombreDeUsuario;
        this.seguidores = seguidores;

    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombreDeUsuario);
        System.out.println("Seguidores: " + seguidores);
    }

    @Override

    public String toString() {

        return "[Nombre = " + nombre + ", edad = " + edad + ", nombre de usuario = " + nombreDeUsuario + ", seguidores = " + seguidores + "]";
    }
}
