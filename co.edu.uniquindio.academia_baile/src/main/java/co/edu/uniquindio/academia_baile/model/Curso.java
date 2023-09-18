package co.edu.uniquindio.academia_baile.model;


public class Curso {

    private String tipoBaile;
    private String categoria;
    private String nivel;
    private String vestuario;
    private String horario;
    private double precioMes;


}
    public Curso(String tipoBaile, String categoria, String nivel, String vestuario,
                 String horario, double precioMes) {
        this.tipoBaile = tipoBaile;
        this.categoria = categoria;
        this.nivel = nivel;
        this.vestuario = vestuario;
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

    public String getVestuario() {
        return vestuario;
    }

    public void setVestuario(String vestuario) {
        this.vestuario = vestuario;
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
                "vestuario: "+getVestuario() + "\n"+
                "Horario: "+getHorario() + "\n"+
                "precioMes: "+getPrecioMes() + "\n"

        return informacion;
    }


    public void mostrarInformacionCurso() {

            String informacionCurso1 = getCurso1().obtenerInformacion();
            String informacionCurso2 = getCurso2().obtenerInformacion();
            String informacionCurso3 = getCurso3().obtenerInformacion();
            System.out.println("Informacion del curso 1: "+ informacionCurso1);
            System.out.println("Informacion del curso 2: "+ informacionCurso2);
            System.out.println("Informacion del curso 3: "+ informacionCurso3);
    }

    public void setCurso1(Curso curso1) {
    }

    public void setCurso2(Curso curso2) {
    }

    public void setCurso3(Curso curso3) {
    }
}
