package org.example.Streaming;

public class PlanGratis extends Suscripcion{

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override

    public void mostrarInfo() {

        System.out.println("Información del plan gratuito:");
        super.mostrarInfo();
    }

    @Override

    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }

    @Override

    public void obtenerPeriodoPrueba() {
        System.out.println("Sin periodo de prueba.");
    }
}
