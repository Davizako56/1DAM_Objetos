package org.example.Streaming;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precion) {

        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void obtenerBeneficios();

    public abstract void obtenerPeriodoPrueba();

    public void mostrarInfo() {

        System.out.println("Plan: " + nombrePlan);
        System.out.println("Precio: " + precio);
    }

    @Override

    public String toString() {

        return "[Nombre del plan = " + nombrePlan + ", precio = " + precio + "]";
    }
}
