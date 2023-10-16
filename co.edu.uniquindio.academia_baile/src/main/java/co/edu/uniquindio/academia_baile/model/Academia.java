package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

import java.util.ArrayList;
import java.util.List;

import static co.edu.uniquindio.academia_baile.util.CapturaDatosUtil.imprimir;

public class Academia {

    /**
     * Atributos Clase Academia
     */
    private String nombre;
    private String ubicacion;

    /**
     * ArrayList de las Clases Creadas
     */
    List<Cliente> listaClientes = new ArrayList<>();
    List<Curso> listaCursos = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Inscripcion> listaInscripciones = new ArrayList<>();
    List<Pago> listaPagos = new ArrayList<>();

    /**
     * Constructor Vacío
     */
    public Academia() {
    }

    /**
     * Constructor con Parámetros
     * @param nombre
     * @param ubicacion
     */
    public Academia(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    /**
     * Getters y Setters de Atributos Clase Academia
     * @return
     */
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

    /**
     * Getters y Setters de ArrayList de las Clases Creadas
     * @return
     */
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Inscripcion> getListaInscripciones() {
        return listaInscripciones;
    }

    public void setListaInscripciones(List<Inscripcion> listaInscripciones) {
        this.listaInscripciones = listaInscripciones;
    }

    public List<Pago> getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(List<Pago> listaPagos) {
        this.listaPagos = listaPagos;
    }

    /**
     * To String Clase Academia
     * @return
     */
    @Override
    public String toString() {
        return "Academia{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaCursos=" + listaCursos +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInscripciones=" + listaInscripciones +
                ", listaPagos=" + listaPagos +
                '}';
    }

    /**
     * Método para Crear Cliente
     * @param nombre
     * @param apellido
     * @param edad
     * @param cedula
     * @param correo
     * @return
     */
    public boolean crearCliente(String nombre, String apellido, int edad, String cedula, String correo) {
        Cliente cliente = new Cliente();
        boolean cedulaExistente = false;
        for (Cliente cliente2 : listaClientes) {
            if (cliente2.getCedula().equals(cedula)) {
                cedulaExistente = true;
                break;
            }
        }
        if (cedulaExistente) {
            imprimir("El número de cédula ya existe, digite de nuevo el dato correcto");
        } else {
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEdad(edad);
            cliente.setCedula(cedula);
            cliente.setCorreo(correo);
            getListaClientes().add(cliente);
        }
        return true;
    }

    /**
     * Método para Obtener Cliente
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    /**
     * Método para Actulizar Cliente
     * @param cedulaActualizar
     * @param lista
     * @param nombre
     * @param apellido
     * @param edad
     * @param cedula
     * @param correo
     */
    public  void actualizarCliente(String cedulaActualizar , List<Cliente> lista, String nombre, String apellido,
                                   int edad, String cedula,String correo ){
        int indice = obtenerPosicionPorCedula(lista,cedulaActualizar);
        boolean cedulaExistente = false;
        for (Cliente cliente: lista){
            if(cliente.getCedula().equals(cedula)){
                cedulaExistente = true;
                break;
            }
        }
        if(cedulaExistente){
            imprimir("El número de cédula ya existe, digite de nuevo el dato correcto");
        }else{
            listaClientes.get(indice).setNombre(nombre);
            listaClientes.get(indice).setApellido(apellido);
            listaClientes.get(indice).setEdad(edad);
            listaClientes.get(indice).setCedula(cedula);
            listaClientes.get(indice).setCorreo(correo);
        }
    }

    /**
     * Método para Obtener Posicion de Cédula
     * @param lista
     * @param cedula
     * @return
     */
    public static int obtenerPosicionPorCedula( List<Cliente> lista, String cedula) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(cedula)) {
                return i;  // Se encontró el nombre en la posición i
            }
        }
        return -1;  // No se encontró el nombre en la lista
    }

    /**
     * Método para Eliminar Cliente
     * @param cedula
     */
    public void eliminarCliente(String cedula) {
        int tamanioLista = getListaClientes().size();
        for (int i=0; i < tamanioLista; i++){
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(i);
                break;
            }
        }
    }


    /**
     * Método para Crear Curso
     * @param tipoBaile
     * @param categoria
     * @param nivel
     * @param profesor
     * @param horario
     * @param precioMes
     * @return
     */
    public boolean crearCurso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor, int horario,
                              double precioMes) {
        Curso curso = new Curso();
        boolean tipoBaileExistente = false;
        for (Curso curso2 : listaCursos) {
            if (curso2.getTipoBaile().equals(tipoBaile)) {
                tipoBaileExistente = true;
                break;
            }
        }
        if (tipoBaileExistente) {
            imprimir("El tipo de baile ya existe, digite de nuevo el dato correcto");
        } else {
            curso.setTipoBaile(tipoBaile);
            curso.setCategoria(categoria);
            curso.setNivel(nivel);
            curso.setProfesor(profesor);
            curso.setHorario(horario);
            curso.setPrecioMes(precioMes);
            getListaCursos().add(curso);
        }
        return true;
    }


    /**
     * Método para Obtener Curso
     * @return
     */
    public List<Curso> obtenerCursos() {
        return getListaCursos();
    }


    /**
     * Método para Actulizar Curso
     * @param tipoBaileActualizar
     * @param lista
     * @param tipoBaile
     * @param categoria
     * @param nivel
     * @param profesor
     * @param horario
     * @param precioMes
     */
    public  void actualizarCurso(TipoBaile tipoBaileActualizar, List<Curso> lista, TipoBaile tipoBaile,
                                 Categoria categoria, Nivel nivel, String profesor, int horario, double precioMes){
        int indice = obtenerPosicionPorTipoBaile(lista,tipoBaileActualizar);
        boolean tipoBaileExistente = false;
        for (Curso curso: lista){
            if(curso.getTipoBaile().equals(tipoBaile)){
                tipoBaileExistente = true;
                break;
            }
        }
        if(tipoBaileExistente){
            imprimir("El tipo de baile ya existe, digite de nuevo el dato correcto");
        }else{
            listaCursos.get(indice).setTipoBaile(tipoBaile);
            listaCursos.get(indice).setCategoria(categoria);
            listaCursos.get(indice).setNivel(nivel);
            listaCursos.get(indice).setProfesor(profesor);
            listaCursos.get(indice).setHorario(horario);
            listaCursos.get(indice).setPrecioMes(precioMes);
        }
    }


    /**
     * Método para Obtener Posicion de Tipo Baile
     * @param lista
     * @param tipoBaile
     * @return
     */
    public static int obtenerPosicionPorTipoBaile( List<Curso> lista, TipoBaile tipoBaile) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTipoBaile().equals(tipoBaile)) {
                return i;  // Se encontró el nombre en la posición i
            }
        }
        return -1;  // No se encontró el nombre en la lista
    }


    /**
     * Método para Eliminar Curso
     * @param tipoBaile
     */
    public void eliminarCurso(TipoBaile tipoBaile) {
        int tamanoLista = getListaCursos().size();
        for (int i=0; i < tamanoLista; i++){
            Curso curso = getListaCursos().get(i);
            if(curso.getTipoBaile().equalsIgnoreCase(tipoBaile)){
                getListaCursos().remove(i);
                break;
            }
        }
    }


    /**
     * Método para Mostrar Promedio Precio
     * @param promedioPrecio
     */
    public void mostrarPromedioPrecio(double promedioPrecio){
        System.out.println("El promedio del precio de los cursos es de: $ " + promedioPrecio);
    }
}