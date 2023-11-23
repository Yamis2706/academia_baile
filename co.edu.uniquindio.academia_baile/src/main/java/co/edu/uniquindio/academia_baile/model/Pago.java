package co.edu.uniquindio.academia_baile.model;

public class Pago {
    /**
     * Atributos Clase Pago
     */
    private int numeroPago;
    private Inscripcion inscripcionAsociada;
    private double valorPagar;

    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    /**
     * Constructor Vacío
     */
    public Pago() {
    }

    public Pago(int numeroPago, Inscripcion inscripcionAsociada, double valorPagar) {
        this.numeroPago = numeroPago;
        this.inscripcionAsociada = inscripcionAsociada;
        this.valorPagar = valorPagar;
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public Inscripcion getInscripcionAsociada() {
        return inscripcionAsociada;
    }

    public void setInscripcionAsociada(Inscripcion inscripcionAsociada) {
        this.inscripcionAsociada = inscripcionAsociada;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "numeroPago=" + numeroPago +
                ", inscripcionAsociada=" + inscripcionAsociada +
                ", valorPagar=" + valorPagar +
                '}';
    }
}