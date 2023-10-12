package co.edu.uniquindio.academia_baile.model;

public class Pago {
    private Inscripcion inscripcion;
    private double valorPagar;
    Academia ownedByAcademia;

    public Pago() {
    }

    public Pago(Inscripcion inscripcion, double valorApagar) {
        this.inscripcion = inscripcion;
        this.valorPagar = valorApagar;
    }

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

}
