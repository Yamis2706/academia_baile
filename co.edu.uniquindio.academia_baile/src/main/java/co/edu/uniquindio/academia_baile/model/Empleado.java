package co.edu.uniquindio.academia_baile.model;

public class Empleado extends Persona {

    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    /**
     * Constructor Vacío
     */
    public Empleado() {
    }

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }
}