package co.edu.uniquindio.academia_baile.model;


public class Vestuario {
    private String tipoVestuario;
    private String estado;
    private String talla;
    private String material;
    private double precio;
    private double descuento;

    public Vestuario(String tipoVestuario, String estado, String talla,
                     String material, double precio, double descuento) {
        this.tipoVestuario = tipoVestuario;
        this.estado = estado;
        this.talla = talla;
        this.material = material;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getTipoVestuario() {
        return tipoVestuario;
    }

    public void setTipoVestuario(String tipoVestuario) {
        this.tipoVestuario = tipoVestuario;
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
