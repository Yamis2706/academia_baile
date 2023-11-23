package co.edu.uniquindio.academia_baile.model;

public class Cliente extends Persona {
    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    public Cliente() {
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
}