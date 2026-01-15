package org.example;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private String residencia;
    private String profesion;



    public Persona(String nombre, String dni, int edad, String residencia, String profesion) {

        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.residencia = residencia;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void imprimirDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Residencia: " + residencia);
        System.out.println("Profesión: " + profesion);
    }
}
