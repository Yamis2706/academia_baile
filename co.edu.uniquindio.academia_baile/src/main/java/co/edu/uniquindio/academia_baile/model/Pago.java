package co.edu.uniquindio.academia_baile.model;

/**
 * Atributos de la clase pago
 */
public class Pago {
    private Inscripcion inscripcion;
    private double valorPagar;
    Academia ownedByAcademia;

    /**
     * Constructor vacio
     */
    public Pago() {
    }

    /**
     * Constructor con parámetros
     * @param inscripcion
     * @param valorApagar
     */
    public Pago(Inscripcion inscripcion, double valorApagar) {
        this.inscripcion = inscripcion;
        this.valorPagar = valorApagar;
    }

    /**
     * getters y setters
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

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Pago{" +
                "inscripcion=" + inscripcion +
                ", valorPagar=" + valorPagar +
                '}';
    }
}
=======
}
>>>>>>> 33bc1c140d071df5428018b4f75518760d2da131
