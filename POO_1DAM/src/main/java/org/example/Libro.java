package org.example;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro(String titulo, String autor) {

        cantidadLibros++;
        this.titulo = titulo;
        this.autor = autor;
        setId();
        disponible = true;
        librosDisponibles++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        id = calcularId();
    }

    public boolean getPrestado() {
        return disponible;
    }

    public void setPrestado(boolean prestado) {
        this.disponible = prestado;
    }

    public String calcularId() {


        String num = Integer.toString(cantidadLibros);

        return "LIB00" + num;

    }

    public void prestar() {

        if (!estaDisponible()) {
            System.out.println("El libro ya está prestado.");
        }else{
            System.out.println("El libro ha sido prestado con éxito.");
            disponible = false;
            librosDisponibles--;
        }

    }

    public void devolver() {

        if (estaDisponible()) {
            System.out.println("El libro ya está devuelto");
        }else{
            System.out.println("El libro ha sido devuelto con éxito.");
            disponible = true;
            librosDisponibles++;
        }
    }

    public boolean estaDisponible() {

        if (disponible) {
            System.out.println("El libro está disponible.");
            return true;
        }else{
            System.out.println("El libro no está disponible.");
            return false;
        }
    }

    public static int getTotalLibros() {

        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {

        return librosDisponibles;
    }

    @Override

    public String toString() {

        return "Libro: [título = " + titulo + ", autor = " + autor + ", id = " + id + ", prestado = " + disponible + "]";
    }
}
