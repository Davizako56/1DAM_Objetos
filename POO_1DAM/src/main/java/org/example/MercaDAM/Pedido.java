package org.example.MercaDAM;
import java.util.HashMap;

public class Pedido {

    private HashMap<Producto, Integer> pedido = new HashMap<>();
    private double importeTotal;

    public Pedido() {

    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void actualizarImporteTotal(double importe) {

    }

    public void aplicarPromo3x2() {

    }

    public void aplicarPromo10() {

    }

    @Override

    public String toString() {

        return "[Pedido = " + pedido + ", importe total = " + importeTotal + "]";
     }
}
