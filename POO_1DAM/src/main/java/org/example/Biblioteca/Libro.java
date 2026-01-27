package org.example.Biblioteca;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial) {

        cantidadLibros++;
        this.titulo = titulo;
        this.autor = autor;
        setId();
        disponible = true;
        librosDisponibles++;
        estudiantePrestado = null;
        this.editorial = editorial;
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

        if (cantidadLibros < 10) {
            return "LIB00" + num;
        }else if (cantidadLibros >= 100) {
            return "LIB" + num;
        }else{
            return "LIB0" + num;
        }

    }



    public Prestamo prestar(Estudiante estudiante) {

        Prestamo prestamo = null;

        if (estaDisponible() && estudiante.getLibro() == null) {
            System.out.println("El libro " + titulo + " ha sido prestado a " + estudiante.getNombre() + " de " + estudiante.getCurso());
            disponible = false;
            librosDisponibles--;
            estudiante.setLibro(this);
            estudiantePrestado = estudiante;
            prestamo = new Prestamo(this, estudiante);
            System.out.println("Prestamo realizado con éxito");
        }else if (estudiante.getLibro() != null){
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado.");
        }else{
            System.out.println("El libro " + titulo + " ya está prestado.");
        }

        return prestamo;
    }

    public void devolver(Estudiante estudiante) {

        if (estaDisponible()) {
            System.out.println("El libro " + titulo + " está disponible, no devuelvas " + estudiante.getNombre() + " de " + estudiante.getCurso());
        }else{
            System.out.println("El libro " + titulo + " ha sido devuelto con éxito.");
            disponible = true;
            librosDisponibles++;
            estudiantePrestado = null;
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

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }


    @Override

    public String toString() {

        return "Libro: [título = " + titulo + ", autor = " + autor + ", id = " + id + ", prestado = " + disponible + ", estudiante = " + estudiantePrestado + ", editorial = " + editorial + "]";
    }
}
