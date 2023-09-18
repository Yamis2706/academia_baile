package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

public class Curso {

    private TipoBaile tipoBaile;
    private Categoria categoria;
    private Nivel nivel;
    private String profesor;
    private String horario;
    private double precioMes;

    public Curso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor, String horario, double precioMes) {
        this.tipoBaile = tipoBaile;
        this.categoria = categoria;
        this.nivel = nivel;
        this.profesor = profesor;
        this.horario = horario;
        this.precioMes = precioMes;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecioMes() {
        return precioMes;
    }

    public void setPrecioMes(double precioMes) {
        this.precioMes = precioMes;
    }

    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion + "\n"+
                "Tipo Baile: "+getTipoBaile() + "\n"+
                "Categoria: "+getCategoria() + "\n"+
                "Nivel: "+getNivel() + "\n"+
                "Profesor: "+getProfesor() + "\n"+
                "Horario: "+getHorario() + "\n"+
                "Precio del Mes: "+getPrecioMes() + "\n";
        return informacion;
    }
}