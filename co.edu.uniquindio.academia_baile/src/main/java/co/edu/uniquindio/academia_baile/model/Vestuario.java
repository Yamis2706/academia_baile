package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Estado;
import co.edu.uniquindio.academia_baile.model.enumeracion.Talla;
import co.edu.uniquindio.academia_baile.model.enumeracion.Tipo;

public class Vestuario {
    private Tipo tipo;
    private Estado estado;
    private Talla talla;
    private String material;
    private double precio;
    private double descuento;

    public Vestuario(Tipo tipo, Estado estado, Talla talla, String material, double precio, double descuento) {
        this.tipo = tipo;
        this.estado = estado;
        this.talla = talla;
        this.material = material;
        this.precio = precio;
        this.descuento = descuento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
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