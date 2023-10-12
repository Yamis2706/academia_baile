package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    private String nombre;
    private String ubicacion;

    List<Curso> listaCursos = new ArrayList<>();
    List<Cliente> listaCliente = new ArrayList<>();
    List<Empleado> listaEmpleado = new ArrayList<>();
    List<Inscripcion> listaInscripcion = new ArrayList<>();
    List<Pago> listaPago = new ArrayList<>();

    public Academia() {
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public List<Inscripcion> getListaInscripcion() {
        return listaInscripcion;
    }

    public void setListaInscripcion(List<Inscripcion> listaInscripcion) {
        this.listaInscripcion = listaInscripcion;
    }

    public List<Pago> getListaPago() {
        return listaPago;
    }

    public void setListaPago(List<Pago> listaPago) {
        this.listaPago = listaPago;
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




    public void mostrarInformacionCurso() {

        //String informacionCurso1 = getCursoSalsa().obtenerInformacion();
        //String informacionCurso2 = getCursoCumbia().obtenerInformacion();
        //String informacionCurso3 = getCursoBallet().obtenerInformacion();
        //System.out.println("Informacion del curso 1: "+ informacionCurso1);
        //System.out.println("Informacion del curso 2: "+ informacionCurso2);
        //System.out.println("Informacion del curso 3: "+ informacionCurso3);
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


    public boolean crearCurso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor, int horario,
                              double precioMes) {
        return false;
    }
}