package co.edu.uniquindio.academia_baile.model;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    private String nombre;
    private String ubicacion;

    List<Curso> listaCursos = new ArrayList<>();
    private Vestuario vestuarioFormal;
    private Vestuario vestuarioEnsayo;
    private Vestuario vestuarioCompetencia;


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

        //String informacionCurso1 = getCursoSalsa().obtenerInformacion();
        //String informacionCurso2 = getCursoCumbia().obtenerInformacion();
        //String informacionCurso3 = getCursoBallet().obtenerInformacion();
        //System.out.println("Informacion del curso 1: "+ informacionCurso1);
        //System.out.println("Informacion del curso 2: "+ informacionCurso2);
        //System.out.println("Informacion del curso 3: "+ informacionCurso3);
    }

    public void mostrarInformacionVestuario() {

        String informacionVestuario1 = getVestuarioFormal().obtenerInformacion();
        String informacionVestuario2 = getVestuarioEnsayo().obtenerInformacion();
        String informacionVestuario3 = getVestuarioCompetencia().obtenerInformacion();
        System.out.println("Informacion del vestuario 1: "+ informacionVestuario1);
        System.out.println("Informacion del vestuario 2: "+ informacionVestuario2);
        System.out.println("Informacion del vestuario 3: "+ informacionVestuario3);
    }

    public double obtenerPromedioPrecio() {
        //double promedioPrecio = cursoSalsa.calcularPromedioPrecio(cursoSalsa,
        //       cursoCumbia, cursoBallet);
        //return promedioPrecio;
        return  0.0;
    }

    public void mostrarPromedioPrecio(double promedioPrecio){
        System.out.println("El promedio del precio de los cursos es de: $ " + promedioPrecio);
    }
}