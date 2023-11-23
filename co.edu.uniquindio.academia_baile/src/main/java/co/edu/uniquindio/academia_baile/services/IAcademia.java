package co.edu.uniquindio.academia_baile.services;

import co.edu.uniquindio.academia_baile.model.*;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import java.util.List;

public interface IAcademia {
    void crearCliente(String nombre, int edad, String cedula);
    List<Cliente> obtenerClientes();
    void actualizarCliente(String cedulaActualizar , String nombre, int edad, String cedula);
    void eliminarCliente(String cedula);
    boolean crearCurso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor);
    List<Curso> obtenerCursos();
    void actualizarCurso(TipoBaile tipoBaileActualizar, List<Curso> lista,
                                 TipoBaile tipoBaile, Categoria categoria, Nivel nivel,
                                 String profesor, int horario,
                                 double precioMes,
                         Categoria actualizarCategoria, Nivel actualizarNivel
            , String actualizarProfesor);
    static int obtenerPosicionPorTipoBaile(List<Curso> lista,
                                           TipoBaile tipoBaile) {
        return 0;
    }
    static int obtenerPosicionPorNumeroInscripcion(List<Inscripcion> lista,
                                                   int numeroinscripcion) {
        return 0;
    }
    void eliminarCurso(TipoBaile tipoBaile);
    boolean crearInscripcion(int numeroIncripcion, String cedulaCliente,
                             TipoBaile tipoBaile);
    void eliminarInscripcion (int numeroIncripcion);
    void actualizarInscripcion (int numeroIncripcion,
                                String cedulaCliente,
                                TipoBaile tipoBaile);
    Inscripcion obtenerInscripcion (int numeroIncripcion);
    String obtenerListaInscripcion();
    Cliente obtenerCliente(String cedula);
    Cliente obtenerClienteCedula(String cedula,Academia academia, int operacion);
    String obtenerListaCliente();
    Curso obtenerCurso(TipoBaile tipoBaile);
    String obtenerListaCurso();
    void crearEmpleado(String nombre, int edad, String cedula, String cargo,
                    double salario);
    List<Empleado> obtenerEmpleados();
    String obtenerListaEmpleado();
    void actualizarEmpleado(String cedulaActualizar, String nombre, int edad, String cedula,
                            String cargo, double salario);
    Empleado obtenerEmpleado(String cedulaEmpleado);
    void eliminarEmpleado(String cedula);

    void actualizarCurso(TipoBaile tipoBaileActualizar, Categoria actualizarCategoria, Nivel actualizarNivel, String actualizarProfesor);
}