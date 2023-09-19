package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

public class Curso {

    private TipoBaile tipoBaile;
    private Categoria categoria;
    private Nivel nivel;
    private String profesor;
    private int horario;
    private double precioMes;

    public Curso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor, int horario,
                 double precioMes) {
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

    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion + "\n" +
                "Tipo Baile: " + getTipoBaile() + "\n" +
                "Categoria: " + getCategoria() + "\n" +
                "Nivel: " + getNivel() + "\n" +
                "Profesor: " + getProfesor() + "\n" +
                "Horario: " + getHorario() + "\n" +
                "Precio del Mes: " + getPrecioMes() + "\n";
        return informacion;
    }

    public double calcularPromedioPrecio(Curso cursoSalsa, Curso cursoCumbia, Curso cursoBallet) {
        double promedioPrecio = 0.0;
        promedioPrecio = (cursoSalsa.getPrecioMes() + cursoCumbia.getPrecioMes() + cursoBallet.getPrecioMes()) / 3;
        return promedioPrecio;
    }

    public static void obtenerCursoNivelAlto(Curso cursoSalsa, Curso cursoCumbia, Curso cursoBallet){
        if(Nivel.ALTO == cursoSalsa.getNivel()){
            System.out.println("El curso Salsa es de nivel Alto");
        }
        if(Nivel.ALTO == cursoCumbia.getNivel()){
            System.out.println("El curso Cumbia es de nivel Alto");
        }
        if(Nivel.ALTO == cursoBallet.getNivel()){
            System.out.println("El curso Ballet es de nivel Alto");
        }
    }

    public static void obtenerCursoMenorDuracion(Curso cursoSalsa, Curso cursoCumbia, Curso cursoBallet){
        int cursoMenorDuracion = cursoSalsa.getHorario();
        TipoBaile nombreCursoMenorDuracion = cursoSalsa.getTipoBaile();
        if(cursoCumbia.getHorario() < cursoMenorDuracion){
            cursoMenorDuracion = cursoCumbia.getHorario();
            nombreCursoMenorDuracion = cursoCumbia.getTipoBaile();
        if (cursoBallet.getHorario() < cursoMenorDuracion){
            cursoMenorDuracion = cursoBallet.getHorario();
            nombreCursoMenorDuracion = cursoBallet.getTipoBaile();
            }
        System.out.println("El curso que tiene menor horario es " + nombreCursoMenorDuracion + ", " +
                "con una duración de " + cursoMenorDuracion + " horas");
        }
    }
}