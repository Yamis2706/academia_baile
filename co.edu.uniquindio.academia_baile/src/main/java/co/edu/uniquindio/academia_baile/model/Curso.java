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
    private int horario;

    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    /**
     * Constructor Vacío
     */
    public Curso() {
    }

    /**
     * Constructor con Parámetros
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
    }

    /**
     * Getters y Setters de Atributos Clase Curso
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
     * To String Clase Curso
     * @return
     */
    @Override
    public String toString() {
        return "Curso{" +
                "tipoBaile=" + tipoBaile +
                ", categoria=" + categoria +
                ", nivel=" + nivel +
                ", profesor='" + profesor + '\'' +
                ", horario=" + horario +
                '}';
    }


    /**
     * Método para Obtener Información
     * @return
     */
    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion + "\n" +
                "Tipo de Baile: " + getTipoBaile() + "\n" +
                "Categoría: " + getCategoria() + "\n" +
                "Nivel: " + getNivel() + "\n" +
                "Profesor: " + getProfesor() + "\n" +
                "Horario: " + getHorario() + "\n";
        return informacion;
    }


    /**
     * Método para Calcular Promedio Precio
     * @param precioMes
     * @return
     */
    public double calcularPromedioPrecio(double precioMes) {
        double promedioPrecio = 0.0;
        double curso1 = 180.000;
        double curso2 = 150.000;
        double curso3 = 220.000;
        promedioPrecio = (curso1 + curso2 + curso3) / 3;
        return promedioPrecio;
    }
}