package org.example.RedSocial;

public class AppRed {

    public static void main(String[] args) {

        Usuario ana = new Usuario("Ana",30,"@ana",231);
        System.out.println("Información del usuario:");
        ana.mostrarInfo();
        System.out.println();

        Influencer luis = new Influencer("Luis",25,"@Luisito_comunica",50000);
        luis.anyadirColaboracion("MediaMarkt");
        luis.anyadirColaboracion("Yoigo");
        luis.anyadirColaboracion("Temu");
        luis.mostrarInfo();
        System.out.println();

        Streamer carlos = new Streamer("Carlos",27,"@Carlos_stream",1300,150,2000);
        carlos.mostrarInfo();
        System.out.println();

        Basico pedro = new Basico("Pedro",22,"@Pedro123",455);
        pedro.mostrarInfo();
    }
}
