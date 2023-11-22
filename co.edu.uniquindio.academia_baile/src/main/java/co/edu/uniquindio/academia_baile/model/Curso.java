package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

public class Curso {

    /**
     * Atributos Clase Curso
     */

    private TipoBaile tipoBaile;
    private Categoria categoria;
    private Nivel nivel;
    private String profesor;

    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    /**
     * Constructor Vacío
     */
    public Curso() {
    }

    public Curso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor, Academia ownedByAcademia) {
        this.tipoBaile = tipoBaile;
        this.categoria = categoria;
        this.nivel = nivel;
        this.profesor = profesor;
        this.ownedByAcademia = ownedByAcademia;
    }

    public TipoBaile getTipoBaile() {
        return tipoBaile;
    }

    public void setTipoBaile(TipoBaile tipoBaile) {
        this.tipoBaile = tipoBaile;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tipoBaile=" + tipoBaile +
                ", categoria=" + categoria +
                ", nivel=" + nivel +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}