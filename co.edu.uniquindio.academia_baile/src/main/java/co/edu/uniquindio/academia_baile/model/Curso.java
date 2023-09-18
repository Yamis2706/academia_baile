package co.edu.uniquindio.academia_baile.model;

public class Curso {

    private String tipoBaile;
    private String categoria;
    private String nivel;
    private String profesor;
    private String horario;
    private double precioMes;

    public Curso(String tipoBaile, String categoria, String nivel, String vestuario,
                 String horario, double precioMes) {
        this.tipoBaile = tipoBaile;
        this.categoria = categoria;
        this.nivel = nivel;
        this.profesor = profesor;
        this.horario = horario;
        this.precioMes = precioMes;
    }

    public Curso() {

    }

    public String getTipoBaile() {
        return tipoBaile;
    }

    public void setTipoBaile(String tipoBaile) {
        this.tipoBaile = tipoBaile;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
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
        informacion = informacion +
                "tipoBaile: "+getTipoBaile() + "\n"+
                "categoria: "+getCategoria() + "\n"+
                "nivel: "+getNivel() + "\n"+
                "profesor: "+getProfesor() + "\n"+
                "Horario: "+getHorario() + "\n"+
                "precioMes: "+getPrecioMes() + "\n";

        return informacion;
    }
    
}