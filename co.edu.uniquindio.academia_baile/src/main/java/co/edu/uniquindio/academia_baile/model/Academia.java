package co.edu.uniquindio.academia_baile.model;

import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

import java.util.ArrayList;
import java.util.List;

import static co.edu.uniquindio.academia_baile.util.CapturaDatosUtil.imprimir;

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

    /**
     * Método para Crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, int edad, String cedula, String correo) {
        Cliente cliente = new Cliente();

        //boolean validarCedula = validarCedula(cedula, cliente);
        boolean cedulaExistente = false;
        for (Cliente cliente2 : listaCliente) {
            if (cliente2.getCedula().equals(cedula)) {
                cedulaExistente = true;
                break;
            }
        }
        if (cedulaExistente) {
            imprimir("El número de cédula ya existe, ingresa de nuevo los datos");

        } else {
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCedula(cedula);
            cliente.setEdad(edad);
            cliente.setCorreo(correo);
            getListaCliente().add(cliente);
        }
        return true;
    }
    /**
     * Metodo para obtener la lista de todos los clientes
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaCliente();
    }

    /**
     * Método para Actualizar un Cliente
     * @param cedulaActualizar
     * @param lista
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     */
    public  void actualizarCliente(String cedulaActualizar , List<Cliente> lista, String nombre, String apellido,int edad, String cedula,String correo ){

        int indice = obtenerPosicionPorCedula(lista,cedulaActualizar);
        boolean cedulaExistente = false;
        for (Cliente cliente: lista){
            if(cliente.getCedula().equals(cedula)){
                cedulaExistente = true;
                break;
            }
        }
        if(cedulaExistente){
            imprimir("El número de cédula ya existe, ingresa de nuevo los datos");

        }else{
            listaCliente.get(indice).setNombre(nombre);
            listaCliente.get(indice).setApellido(apellido);
            listaCliente.get(indice).setCedula(cedula);
            listaCliente.get(indice).setEdad(edad);
        }
    }
    /**
     * Método para Obtener la posicion por Cédula
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
     * Método para Eliminar un Cliente
     * @param cedula
     */
    public void eliminarCliente(String cedula) {
        int tamanioLista = getListaCliente().size();
        for (int i=0; i < tamanioLista; i++){
            Cliente cliente = getListaCliente().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaCliente().remove(i);
                break;
            }
        }
    }

}