package co.edu.uniquindio.academia_baile.model;

public class Pago {

    /**
     * Atributos Clase Pago
     */
    private int numeroPago;
    private Inscripcion inscripcion;
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

    /**
     * Constructor con Parámetros
     * @param inscripcion
     * @param valorApagar
     */
    public Pago(Inscripcion inscripcion, double valorApagar) {
        this.inscripcion = inscripcion;
        this.valorPagar = valorApagar;
    }

    /**
     * Getters y Setters de Atributos Clase Pago
     * @return
     */
    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    /**
     * Getters y Setters de Variable para Relacionar Padre
     * @return
     */
    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }

    /**
     * To String Clase Pago
     * @return
     */
    @Override
    public String toString() {
        return "Pago{" +
                "inscripcion=" + inscripcion +
                ", valorPagar=" + valorPagar +
                '}';
    }
}