package org.example.Práctica2;
import java.util.Scanner;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    static Scanner entrada = new Scanner(System.in);

    private final String formato = "\\d{1,2}-\\d{1,2}-\\d{1,2}";
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo){

        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida();
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida() {

        String formacion;

        do{
            System.out.println("Introduce la formación:");
            formacion = entrada.next();

            if(formacion.matches(formato)) {
                this.formacionPreferida = formacionPreferida;
            }else{
                System.out.println("Error: El formato no encaja, vuele a intentarlo.");
            }
        }while(!formacion.matches(formato));
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador " + getNombre() + " planifica el entrenamiento.");
    }

    public void hacerCambios() {
        setFormacionPreferida();
    }

    @Override

    public void concentrarse() {
        System.out.println(getNombre() + " se concentra.");
    }

    @Override

    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viaja a " + ciudad + ".");
    }

    @Override

    public void celebrarGol() {
        System.out.println(getNombre() + " celebra un gol");
    }

    @Override

    public void entrenar() {
        System.out.println(getNombre() + " se pone a entrenar.");
    }

    @Override

    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " juega contra " + rival + ".");
    }

    @Override

    public String toString() {
        return "[Nombre = " + getNombre() + ", edad = " + getEdad() + ", equipo = " + equipo + ", formación preferida = " + formacionPreferida + "]";
    }
}
