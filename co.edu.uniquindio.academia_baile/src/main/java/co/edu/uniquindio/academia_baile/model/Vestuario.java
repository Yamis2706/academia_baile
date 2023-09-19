package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.*;

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

    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion + "\n"+
                "Tipo: "+getTipo() + "\n"+
                "Estado: "+getEstado() + "\n"+
                "Talla: "+getTalla() + "\n"+
                "Material: "+getMaterial() + "\n"+
                "Precio: $ "+getPrecio() + "\n"+
                "Descuento: "+getDescuento()*100 + "%" + "\n";
        return informacion;
    }
    
    public static void calcularPrecioTotal(Vestuario vestuarioFormal, Vestuario vestuarioEnsayo, 
                                           Vestuario vestuarioCompetencia){
        double precioTotalVestuario1 = 0.0;
        double precioTotalVestuario2 = 0.0;
        double precioTotalVestuario3 = 0.0;
        precioTotalVestuario1 = (vestuarioFormal.getPrecio() - (vestuarioFormal.getPrecio() * 
                vestuarioFormal.getDescuento()));
        System.out.println("El precio total del vestuario FORMAL con el descuento es: $ " + precioTotalVestuario1);
        
        precioTotalVestuario2 = (vestuarioEnsayo.getPrecio() - (vestuarioEnsayo.getPrecio() *
                vestuarioEnsayo.getDescuento()));
        System.out.println("El precio total del vestuario ENSAYO con el descuento es: $ " + precioTotalVestuario2);
        
        precioTotalVestuario3 = (vestuarioCompetencia.getPrecio() - (vestuarioCompetencia.getPrecio() *
                vestuarioCompetencia.getDescuento()));
        System.out.println("El precio total del vestuario COMPETENCIA con el descuento es: $ " + precioTotalVestuario3);
    }

    public static void obtenerDescuentoMayor(Vestuario vestuarioFormal, Vestuario vestuarioEnsayo, 
                                             Vestuario vestuarioCompetencia){
        double descuentoMayor = vestuarioFormal.getDescuento();
        Tipo nombreDescuentoMayor = vestuarioFormal.getTipo();
        if(vestuarioEnsayo.getDescuento() > descuentoMayor) {
            descuentoMayor = vestuarioEnsayo.getDescuento();
            nombreDescuentoMayor = vestuarioEnsayo.getTipo();
        if (vestuarioCompetencia.getDescuento() > descuentoMayor) {
            descuentoMayor = vestuarioCompetencia.getDescuento();
            nombreDescuentoMayor = vestuarioCompetencia.getTipo();
            }
        }
        System.out.println("El mayor descuento es del " + descuentoMayor * 100 + "%, que corresponde al vestuario " +
                nombreDescuentoMayor);
    }

    public static void obtenerVestuarioEstadoNuevo(Vestuario vestuarioFormal, Vestuario vestuarioEnsayo,
                                                   Vestuario vestuarioCompetencia){
        Tipo nombreVestuarioEstadoNuevo = vestuarioFormal.getTipo();
        if(vestuarioFormal.getEstado() == Estado.NUEVO){
            nombreVestuarioEstadoNuevo = vestuarioFormal.getTipo();
            System.out.println("El vestuario " + nombreVestuarioEstadoNuevo + " se encuentra en estado NUEVO");
        }
        if(vestuarioEnsayo.getEstado() == Estado.NUEVO){
            nombreVestuarioEstadoNuevo = vestuarioEnsayo.getTipo();
            System.out.println("El vestuario " + nombreVestuarioEstadoNuevo + " se encuentra en estado NUEVO");
        }
        if(vestuarioCompetencia.getEstado() == Estado.NUEVO){
            nombreVestuarioEstadoNuevo = vestuarioCompetencia.getTipo();
            System.out.println("El vestuario " + nombreVestuarioEstadoNuevo + " se encuentra en estado NUEVO");
        }
    }
}