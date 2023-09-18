package co.edu.uniquindio.academia_baile.model;

public class Vestuario {
    private String tipo;
    private String estado;
    private String talla;
    private String material;
    private double precio;
    private double descuento;

    public Vestuario(String tipo, String estado, String talla,
                     String material, double precio, double descuento) {
        this.tipo = tipo;
        this.estado = estado;
        this.talla = talla;
        this.material = material;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}