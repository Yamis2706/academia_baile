package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

/**
 * Atributos de la clase Curso
 */
public class Curso {

    private TipoBaile tipoBaile;
    private Categoria categoria;
    private Nivel nivel;
    private String profesor;
    private int horario;
    private double precioMes;
    Academia ownedByAcademia;


    /**
     * Constructor vacio
     */
    public Curso() {
    }

    /**
     * Constructor con parámetros
     * @param tipoBaile
     * @param categoria
     * @param nivel
     * @param profesor
     * @param horario
     * @param precioMes
     */
    public Curso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor, int horario,
                 double precioMes) {
        this.tipoBaile = tipoBaile;
        this.categoria = categoria;
        this.nivel = nivel;
        this.profesor = profesor;
        this.horario = horario;
        this.precioMes = precioMes;
    }

    /**
     * getters y setters
     * @return
     */
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

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getPrecioMes() {
        return precioMes;
    }

    public void setPrecioMes(double precioMes) {
        this.precioMes = precioMes;
    }

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }


    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion + "\n" +
                "Tipo de Baile: " + getTipoBaile() + "\n" +
                "Categoría: " + getCategoria() + "\n" +
                "Nivel: " + getNivel() + "\n" +
                "Profesor: " + getProfesor() + "\n" +
                "Horario: " + getHorario() + "\n" +
                "Precio del Mes: $ " + getPrecioMes() + "\n";
        return informacion;
    }
}