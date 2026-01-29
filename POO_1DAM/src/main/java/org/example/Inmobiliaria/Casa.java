package org.example.Inmobiliaria;
import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    static Scanner entrada = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa(String direccion) {

        this.direccion = direccion;
        setPropietario();
        listaHabitaciones = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario:");
        String nombre = entrada.next();
        System.out.println("Introduce la edad:");
        int edad = entrada.nextInt();
        Propietario propietario = new Propietario(nombre, edad);
        this.propietario = propietario;
        System.out.println("Propietario " + nombre + " añadido.");
    }

    public void crearHabitacion(String nombre, double metros) {

        for (Habitacion h : listaHabitaciones) {

            if (h.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Esta habitaión ya existe");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitacion " + nombre + " creada");
    }

    public void eliminarHabitacion(String nombre) {

        for(Habitacion h : listaHabitaciones) {

            if (h.getNombre().equals(nombre)) {

                listaHabitaciones.remove(h);
                System.out.println("Habitación " + nombre + " eliminada con éxito");
                return;
            }
        }

        System.out.println("La habitacion " + nombre + " no existe");
    }

    public void mostrarHabitaciones() {

        System.out.println("Casa en " + direccion + " tiene " + listaHabitaciones.size() + " habitaciones con el propietario " + propietario.getNombre());

        for(Habitacion habitacion : listaHabitaciones) {

            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") m2");
        }
    }

    public Habitacion habitacionMasGrande(){

        Habitacion mayor = listaHabitaciones.getFirst();

        for(Habitacion habitacion : listaHabitaciones) {

            if (habitacion.getMetros() > mayor.getMetros()) {
                mayor = habitacion;
            }
        }

        return mayor;
    }

    public Habitacion habitacionMasCostosa() {

        Habitacion mayor = listaHabitaciones.getFirst();

        for(Habitacion habitacion : listaHabitaciones) {

            if (habitacion.calcularConsumo() > mayor.calcularConsumo()) {
                mayor = habitacion;
            }
        }

        return mayor;
    }

    @Override

    public String toString() {

        return "[dirección = " + direccion + ", propietario = " + propietario + "]";
    }
}
