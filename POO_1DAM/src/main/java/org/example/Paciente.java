package org.example;
import java.util.Random;

public class Paciente {
    static Random random = new Random();

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private int altura;
    private static final char def_genero = 'X';
    private static final int infrapeso = -1;
    private static final int peso_ideal = 0;
    private static final int sobrepeso = 1;
    private static final int edad_adulta = 18;

    public Paciente(String nombre, int edad, char genero, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        dni = generarDni();
        setGenero(genero);
        this.peso = peso;
        this.altura = altura;
    }

    public Paciente() {

        this(null, 0, def_genero, 0, 0);
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = validarGenero(genero);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    private static String generarDni() {

        String dni = "";

        for (int i = 0; i < 8; i++) {

            int num = random.nextInt(10);
            dni = dni + num;
        }

        int calc = Integer.parseInt(dni);
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        int resto = calc % 23;
        dni += letras[resto];

        return dni;
    }

    public int calcularIMC() {

        double resultado = peso / Math.pow( (double) altura/100,2);

        System.out.println(resultado);

        if (resultado < 20) {
            return infrapeso;
        }else if (resultado > 25) {
            return sobrepeso;
        }else{
            return peso_ideal;
        }
    }

    public boolean esMayorDeEdad() {

        if (edad < edad_adulta) {
            return false;
        }else{
            return true;
        }
    }

    public char validarGenero(char genero) {

        if (genero == 'H' || genero == 'M') {
            return genero;
        }else{
            return def_genero;
        }
    }

    @Override
    public String toString() {
        return "[nombre = " + nombre + ", edad = " + edad + ", DNI = " + dni + ", genero = " + genero + ", peso = " + peso + ", altura = " + altura + "]";
    }
}
