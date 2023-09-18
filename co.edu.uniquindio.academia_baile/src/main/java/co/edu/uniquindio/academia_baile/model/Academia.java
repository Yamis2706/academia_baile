package co.edu.uniquindio.academia_baile.model;

public class Academia {

    private String nombre;
    private String ubicacion;
    private Curso cursoSalsa;
    private Curso cursoCumbia;
    private Curso cursoBallet;
    private Vestuario vestuarioFormal;
    private Vestuario vestuarioEnsayo;
    private Vestuario vestuarioCompetencia;

    public Academia(String nombre, String ubicacion, Curso cursoSalsa, Curso cursoCumbia, Curso cursoBallet,
                    Vestuario vestuarioFormal, Vestuario vestuarioEnsayo,
                    Vestuario vestuarioCompetencia) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cursoSalsa = cursoSalsa;
        this.cursoCumbia = cursoCumbia;
        this.cursoBallet = cursoBallet;
        this.vestuarioFormal = vestuarioFormal;
        this.vestuarioEnsayo = vestuarioEnsayo;
        this.vestuarioCompetencia = vestuarioCompetencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Curso getCursoSalsa() {
        return cursoSalsa;
    }

    public void setCursoSalsa(Curso cursoSalsa) {
        this.cursoSalsa = cursoSalsa;
    }

    public Curso getCursoCumbia() {
        return cursoCumbia;
    }

    public void setCursoCumbia(Curso cursoCumbia) {
        this.cursoCumbia = cursoCumbia;
    }

    public Curso getCursoBallet() {
        return cursoBallet;
    }

    public void setCursoBallet(Curso cursoBallet) {
        this.cursoBallet = cursoBallet;
    }

    public Vestuario getVestuarioFormal() {
        return vestuarioFormal;
    }

    public void setVestuarioFormal(Vestuario vestuarioFormal) {
        this.vestuarioFormal = vestuarioFormal;
    }

    public Vestuario getVestuarioEnsayo() {
        return vestuarioEnsayo;
    }

    public void setVestuarioEnsayo(Vestuario vestuarioEnsayo) {
        this.vestuarioEnsayo = vestuarioEnsayo;
    }

    public Vestuario getVestuarioCompetencia() {
        return vestuarioCompetencia;
    }

    public void setVestuarioCompetencia(Vestuario vestuarioCompetencia) {
        this.vestuarioCompetencia = vestuarioCompetencia;
    }

    public void mostrarInformacionCurso() {

        String informacionCurso1 = getCursoSalsa().obtenerInformacion();
        String informacionCurso2 = getCursoCumbia().obtenerInformacion();
        String informacionCurso3 = getCursoBallet().obtenerInformacion();
        System.out.println("Informacion del curso 1: "+ informacionCurso1);
        System.out.println("Informacion del curso 2: "+ informacionCurso2);
        System.out.println("Informacion del curso 3: "+ informacionCurso3);
    }

    public double calcularPromedioPrecio(){
        double precioCursoSalsa = 0.0;
        double precioCursoCumbia = 0.0;
        double precioCursoBallet = 0.0;
        double promedioPrecio = 0.0;
        precioCursoSalsa = getCursoSalsa().getPrecioMes();
        precioCursoCumbia = getCursoCumbia().getPrecioMes();
        precioCursoBallet = getCursoBallet().getPrecioMes();
        promedioPrecio = (precioCursoSalsa + precioCursoCumbia + precioCursoBallet) / 3;
        System.out.println("El promedio del precio de los cursos es: " + promedioPrecio);
        return promedioPrecio;
    }
}