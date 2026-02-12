package org.example.Streaming;

public class PlanBasico extends Suscripcion{

    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override

    public void mostrarInfo() {

        System.out.println("Información del plan básico:");
        super.mostrarInfo();
    }

    @Override

    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estandar sin anuncios.");
    }

    @Override

    public void obtenerPeriodoPrueba() {
        System.out.println("30 días de prueba gratuita.");
    }
}
