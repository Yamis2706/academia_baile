package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.MainMenu;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;
import co.edu.uniquindio.academia_baile.services.*;

import java.util.ArrayList;
import java.util.List;

import static co.edu.uniquindio.academia_baile.util.CapturaDatosUtil.*;

public class Academia implements IAcademia {
    /**
     * Atributos Clase Academia
     */
    private String nombre;

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
     */
    public Academia(String nombre) {
        this.nombre = nombre;
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
                ", listaClientes=" + listaClientes +
                ", listaCursos=" + listaCursos +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInscripciones=" + listaInscripciones +
                ", listaPagos=" + listaPagos +
                '}';
    }

    /**
     * Método para Crear Cliente
     *
     * @param nombre
     * @param edad
     * @param cedula
     */
    @Override
    public void crearCliente(String nombre, int edad, String cedula) {
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
            cliente.setEdad(edad);
            cliente.setCedula(cedula);
            getListaClientes().add(cliente);
        }
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
     *
     * @param cedulaActualizar
     * @param nombre
     * @param edad
     * @param cedula
     */
    @Override
    public void actualizarCliente(String cedulaActualizar , String nombre, int edad,
                                  String cedula){
        Cliente clienteEncontrado = obtenerCliente(cedulaActualizar);
        if(clienteEncontrado!=null){
            clienteEncontrado.setNombre(nombre);
            clienteEncontrado.setEdad(edad);
            clienteEncontrado.setCedula(cedula);
        }else {
        }
    }

    /**
    public static int obtenerPosicionPorCedula( List<Cliente> lista, String cedula) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(cedula)) {
                return i;  // Se encontró el nombre en la posición i
            }
        }
        return -1;  // No se encontró el nombre en la lista
    }**/

    /**
     * Método para Eliminar Cliente
     * @param cedula
     */
    @Override
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

    @Override
    public boolean crearCurso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel,
                              String profesor) {
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
            getListaCursos().add(curso);
        }
        return true;
    }

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
    public  void actualizarCurso(TipoBaile tipoBaileActualizar, List<Curso> lista,
                                 TipoBaile tipoBaile, Categoria categoria, Nivel nivel,
                                 String profesor, int horario, double precioMes){
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

    public static int obtenerPosicionPorNumeroInscripcion( List<Inscripcion> lista,
                                                           int numeroinscripcion) {
        int retorno = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumeroInscripcion() == numeroinscripcion) {
                retorno = i;  // Se encontró el nombre en la posición i
                System.out.println("posicion: "+i);
            }
        }
        return retorno;  // No se encontró el nombre en la lista
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

    @Override
    public boolean crearInscripcion(int numeroIncripcion, String cedulaCliente,
                                    TipoBaile tipoBaile) {
        Cliente clientes = obtenerCliente(cedulaCliente);
        // Empleado empleado = obtenerEmpleado(cedulaCliente);
        Curso curso = obtenerCurso(tipoBaile);
        if(clientes == null ||  curso == null){
            return false;
        }
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setNumeroInscripcion(numeroIncripcion);
        inscripcion.setClienteAsociado(clientes);
        inscripcion.setCursoAsociado(curso);
        getListaInscripciones().add(inscripcion);
        return true;
    }

    @Override
    public void eliminarInscripcion(int numeroIncripcion) {

        int tamanioLista = getListaInscripciones().size();
        for (int i=0; i < tamanioLista; i++){
            Inscripcion inscripcion = getListaInscripciones().get(i);
            if(inscripcion.getNumeroInscripcion() == numeroIncripcion){
                getListaInscripciones().remove(i);
                break;
            }
        }
    }

    @Override
    public void actualizarInscripcion(int numeroInscripcion, String cedulaCliente,
                                      TipoBaile tipoBaile) {
        Inscripcion inscripcion = obtenerInscripcion(numeroInscripcion);
        if(inscripcion == null){
            return;
        }
        //validar cliente
        if(!inscripcion.getClienteAsociado().getCedula().equalsIgnoreCase(cedulaCliente)){
            Cliente cliente = obtenerCliente(cedulaCliente);
            if(cliente == null){
                return;
            }
            inscripcion.setClienteAsociado(cliente);
        }
        if(!inscripcion.getCursoAsociado().getTipoBaile().equals(tipoBaile)){
            Curso curso = obtenerCurso(tipoBaile);
            if(curso == null){
                return;
            }
            inscripcion.setCursoAsociado(curso);
        }
    }

    @Override
    public Inscripcion obtenerInscripcion(int numeroIncripcion) {
        String mensaje = "";
        Inscripcion inscripcion =new Inscripcion();
        for (int i = 0; i < getListaInscripciones().size(); i++) {
            if(getListaInscripciones().get(i).getNumeroInscripcion() == numeroIncripcion){
                inscripcion = getListaInscripciones().get(i);
            }
        }
        return inscripcion;
    }

    @Override
    public String obtenerListaInscripcion() {
        String mensaje="";
        for (int i = 0; i < getListaInscripciones().size(); i++) {
            String idCliente = Integer.toString(i+1);
            mensaje += idCliente +". " +getListaInscripciones().get(i).getNumeroInscripcion()+
                    "  " +
                    getListaInscripciones().get(i).getCursoAsociado().getTipoBaile()+ "  " +
                    getListaInscripciones().get(i).getClienteAsociado().getCedula()+"  " +
                    getListaInscripciones().get(i).getClienteAsociado().getNombre() +"  " +
                    getListaInscripciones().get(i).getClienteAsociado().getEdad() + "\n";
        }
        return mensaje;
    }

    public Cliente obtenerCliente(String cedula){
        Cliente clienteEncontrado = null;
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

    public Cliente obtenerClienteCedula(String cedula,Academia academia,int operacion){
        Cliente clienteEncontrado = null;
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                clienteEncontrado = cliente;
                break;
            }
        }
        if(clienteEncontrado == null) {
            imprimir("No se encontro la cedula");
            MainMenu mainMenu = new MainMenu();
            mainMenu.ObtenerClienteCedula(academia);
        }
        return clienteEncontrado;
    }

    @Override
    public String obtenerListaCliente(){
        String mensaje ="";
        for (int i = 0; i < obtenerClientes().size(); i++) {
            String idCliente = Integer.toString(i+1);
            mensaje += idCliente +". "+ obtenerClientes().get(i).getNombre()+
                    " CC: " + obtenerClientes().get(i).getCedula()+
                    " edad: " + obtenerClientes().get(i).getEdad()+ "\n";
        }
        return mensaje;
    }

    public Empleado obtenerEmpleado(String cedulaEmpleado) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado: getListaEmpleados()) {
            if (empleado.getCedula().equalsIgnoreCase(cedulaEmpleado)){
                empleadoEncontrado = empleado;
            }
        }
        return empleadoEncontrado;
    }

    public Curso obtenerCurso(TipoBaile tipoBaile) {
        Curso cursoEncontrado = null;
        for (Curso curso: getListaCursos()) {
            if (curso.getTipoBaile().equals(tipoBaile)){
                cursoEncontrado = curso;
            }
        }
        return cursoEncontrado;
    }

    public void crearEmpleado(String nombre, int edad, String cedula, String cargo,
                              double salario) {
    }
}