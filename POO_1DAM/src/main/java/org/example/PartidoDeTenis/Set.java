package org.example.PartidoDeTenis;

public class Set {

    private int puntosJ1;
    private int puntosJ2;

    public Set() {

        setPuntosJ1(puntosJ1);
        setPuntosJ2(puntosJ2);
    }

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1) {

        if(puntosJ1 == 6 || puntosJ2 == 6) {

            if (puntosJ1 < 0) {
                this.puntosJ1 = puntosJ1;
            }else{
                System.out.println("Los puntos del primer jugador no pueden ser menores que 0.");
            }

        }else{
            System.out.println("Al menos uno de los dos puntages debe de ser 6.");
        }
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2) {

        if(puntosJ1 == 6 || puntosJ2 == 6) {

            if (puntosJ2 < 0) {
                this.puntosJ2 = puntosJ2;
            }else{
                System.out.println("Los puntos del segundo jugador no pueden ser menores que 0.");
            }

        }else{
            System.out.println("Al menos uno de los dos puntages debe de ser 6.");
        }
    }

    @Override

    public String toString() {

        return "[puntosJ1 = " + puntosJ1 + ", pùntosJ2 = " + puntosJ1 + "]";
    }
}
