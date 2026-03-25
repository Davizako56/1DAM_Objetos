package org.example.MercaDAM;

public class Cliente {

    private String usuario;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promocion;

    public Cliente(String usuario, String contraseña) {

        this.usuario = usuario;
        this.contraseña = contraseña;
        direccion = "Calle falsa, 123";
        pedido = null;
        promocion = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    public void crearPedido() {

    }

    public void insertarProducto(Producto producto) {

    }

    @Override

    public String toString() {

        return "[Usuario = " + usuario + ", contraseña = " + contraseña + ", dirección = " + direccion + ", pedido = " + pedido + ", promoción = " + promocion + "]";
    }
}
