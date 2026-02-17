package org.example.DispositivosInteligentes;
import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        Televisor televisor = new Televisor("LG", false);
        ParlanteInteligente parlante = new ParlanteInteligente("Siri", false);
        AireAcondicionado aire = new AireAcondicionado("Roca", false);

        Dispositivo proyector = new Dispositivo("Optoma", false) {

            @Override

            public void encender() {

                if(mostrarEstado()){
                    System.out.println("El proyector ya está encendido.");
                }else{
                    System.out.println("Encendiendo proyector...");
                    setEstado(true);
                }
            }
        };

        proyector.encender();
        proyector.encender();

        ControlRemoto proyector2 = new ControlRemoto() {

            @Override

            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto...");
            }
        };

        proyector2.sincronizar();

        Dispositivo horno = new Dispositivo("Hexa", false) {

            @Override

            public void encender() {

                if(mostrarEstado()) {
                    System.out.println("El horno ya está encendido.");
                }else{
                    System.out.println("Encendiendo horno...");
                    setEstado(true);
                }
            }
        };

        horno.encender();
        horno.encender();

        dispositivos.add(televisor);
        dispositivos.add(parlante);
        dispositivos.add(aire);
        dispositivos.add(proyector);
        dispositivos.add(horno);

        for (Dispositivo dispositivo : dispositivos) {

            dispositivo.encender();

            if(dispositivo instanceof Televisor) {
                ((Televisor) dispositivo).sincronizar();
            }else if (dispositivo instanceof AireAcondicionado) {
                ((AireAcondicionado) dispositivo).sincronizar();
            }else if(dispositivo.getNombre().equalsIgnoreCase("Optoma")) {
                proyector2.sincronizar();
            }

            System.out.println(dispositivo.mostrarEstado());
            dispositivo.apagar();
        }

    }
}
