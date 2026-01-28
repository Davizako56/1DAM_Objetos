package org.example.Biblioteca;
import java.util.ArrayList;

public class Estudiante {

    private static final String correo_format = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int contador_estudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> listaLibros;

    public Estudiante(String nombre, String curso, String email) {

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        setNia();
        listaLibros = new ArrayList<Libro>();
    }

    public Estudiante(String nombre) {
        this(nombre, "", "");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public void setNia() {
        nia = ++contador_estudiantes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.listaLibros = libro;
    }

    public static int obtenerTotalEstudiantes() {
        return contador_estudiantes;
    }

    public static boolean validarCorreo(String email) {

        if (email.matches(correo_format)) {
            return true;
        }else{
            return false;
        }
    }

    public void insertarLibro(Libro libro) {

        listaLibros.add(libro);
    }

    public void borrarLibro(Libro libro) {

        listaLibros.remove(libro);
    }

    @Override
    public String toString() {
        return "[nombre = " + nombre + ", curso = " + curso + ", NIA = " + nia + ", email = " + email + "]";
    }


}
