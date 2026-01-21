package org.example;

public class Estudiante {

    private static final String correo_format = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int contador_estudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante(String nombre, String curso, String email) {

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        setNia();
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

    @Override
    public String toString() {
        return "[nombre = " + nombre + ", curso = " + curso + ", NIA = " + nia + ", email = " + email + "]";
    }


}
