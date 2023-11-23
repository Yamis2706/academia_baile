package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.*;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static co.edu.uniquindio.academia_baile.constantes.ClienteConstantes.*;
import static co.edu.uniquindio.academia_baile.constantes.InscripcionConstantes.*;
import static co.edu.uniquindio.academia_baile.constantes.MenuConstantes.*;
import static co.edu.uniquindio.academia_baile.util.CapturaDatosUtil.*;

public class MainMenu {
    /**
     * Método para Mostrar Opciones Menú Principal
     * @return
     */
    public static String mostrarMenuPrincipal() {
        return  MENU_PRINCIPAL;
    }

    /**
     * Método para Mostrar Opciones CRUD Menú Cliente
     * @return
     */
    public static String mostrarMenuClientes() {
        return MENU_CLIENTES;
    }

    public static String mostrarMenuInscripciones() {
        return MENU_INSCRIPCIONES;
    }

    /**
     *Método para Elegir las Opciones del Sistema
     * @param academia
     */
    public static void opcionesMenuPrincipal(Academia academia) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            opcion = leerEnteroVentana(mostrarMenuPrincipal());
            try {
                switch (opcion) {
                    case 1:
                        menuClientes(academia);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        menuInscripcion(academia);
                        break;
                    case 5:

                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se permiten los números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe digitar un número");
                sn.next();
            }
        }
    }

    /**
     * Método para Elegir Opciones CRUD Cliente
     * @param academia
     */
    public static void menuClientes(Academia academia) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            opcion = leerEnteroVentana(mostrarMenuClientes());
            try {
                switch (opcion) {
                    case 1:
                        imprimir(MENSAJE_CREAR_CLIENTE);
                        crearCliente("Juan Felipe Arias Sánchez", 24,
                                "1094536998", academia);
                        break;
                    case 2:
                        obtenerListaCLiente(academia);
                        break;
                    case 3:
                        actualizarCliente(academia);
                        break;
                    case 4:
                        eliminarCliente(academia);
                        break;
                    case 5:
                        ObtenerClienteCedula(academia);
                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se permiten los números " +
                                "entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe digitar un número");
                sn.next();
            }
        }
    }

    public static void menuInscripcion(Academia academia) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            opcion = leerEnteroVentana(mostrarMenuInscripciones());
            try {
                switch (opcion) {
                    case 1:
                        crearInscripcion(academia);
                        break;
                    case 2:
                        obtenerListaInscripcion(academia);
                        break;
                    case 3:
                        actualizarInscripcion(academia);
                        break;
                    case 4:
                        eliminarInscripcion(academia);
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se permiten los números " +
                                "entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe digitar un número");
                sn.next();
            }
        }
    }

    private static void crearInscripcion(Academia academia){
        imprimir(MENSAJE_CREAR_INSCRIPCION);
        int numeroInscripcion = leerEnteroVentana(INGRESAR_NUMERO_INSCRIPCION);
        String cedulaCliente = leerStringVentana(INGRESAR_CEDULA_CLIENTE_REGISTRADO);
        String tipoBaile = leerStringVentana(INGRESAR_TIPO_BAILE);
        academia.crearInscripcion(numeroInscripcion, cedulaCliente,
                TipoBaile.valueOf(tipoBaile.toUpperCase()));
    }

    private static void obtenerListaInscripcion(Academia academia){
        String mensaje = academia.obtenerListaInscripcion();
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static void actualizarInscripcion(Academia academia){
        String mensaje2 = academia.obtenerListaInscripcion();;
        int numeroInscripcion = leerEnteroVentana(INGRESAR_NUMERO_INSCRIPCION_ACTUALIZAR
                + "\n" + mensaje2 );
        String cedulaCliente = leerStringVentana(INGRESAR_CEDULA_CLIENTE_REGISTRADO);
        String tipoBaile = leerStringVentana(INGRESAR_TIPO_BAILE);
        academia.actualizarInscripcion(numeroInscripcion, cedulaCliente,
                TipoBaile.valueOf(tipoBaile.toUpperCase()));
    }

    private static void eliminarInscripcion(Academia academia){
        String mensaje3= academia.obtenerListaInscripcion();
        int numeroInscripcionEliminar = leerEnteroVentana( ELIMINAR_INSCRIPCION+ "\n" + "\n"
                + mensaje3);
        academia.eliminarInscripcion(numeroInscripcionEliminar);
    }

    private static void crearCliente(String juanFelipeAriasSánchez, int i, String number,
                                     Academia academia){
        String respuestaNombre = leerStringVentana(INGRESE_NOMBRE_CLIENTE);
        int respuestaEdad =  leerEnteroVentana (INGRESE_EDAD_CLIENTE);
        String respuestaCedula = leerStringVentana(INGRESE_CEDULA_CLIENTE);
        academia.crearCliente(respuestaNombre, respuestaEdad, respuestaCedula);
    }

    private static void obtenerListaCLiente(Academia academia){
        String mensaje = academia.obtenerListaCliente();
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void actualizarCliente(Academia academia){
        String mensaje2 = academia.obtenerListaCliente();
        String cedulaActualizar = leerStringVentana(CLIENTE_PARA_ACTUALIZAR + mensaje2);
        String actualizarNombre = leerStringVentana(INGRESE_NOMBRE_CLIENTE);
        int actualizarEdad = leerEnteroVentana(INGRESE_EDAD_CLIENTE);
        String actualizarCedula = leerStringVentana(INGRESE_CEDULA_CLIENTE);
        int operacion = 2;
        academia.actualizarCliente
                (cedulaActualizar,actualizarNombre,actualizarEdad,actualizarCedula);
    }

    private static void eliminarCliente(Academia academia){
        String mensaje3 = academia.obtenerListaCliente();
        String numeroCedulaClienteEliminar = leerStringVentana(CLIENTE_PARA_ELIMINAR +
                mensaje3);
        academia.eliminarCliente(numeroCedulaClienteEliminar);
    }

    public static void ObtenerClienteCedula(Academia academia){
        String mensaje4 = academia.obtenerListaCliente();
        String numeroCedula = leerStringVentana(INGRESE_CEDULA_CLIENTE_BUSCAR);
        int  obtenerCedula = 1;
        String nombreCliente = academia.obtenerClienteCedula(numeroCedula,academia,
                obtenerCedula).getNombre();
        String nombreCedula = academia.obtenerClienteCedula(numeroCedula,academia,
                obtenerCedula).getCedula();
        int edad = academia.obtenerClienteCedula(numeroCedula,academia,obtenerCedula).getEdad();
        if(academia.obtenerClienteCedula(numeroCedula, academia,obtenerCedula)== null){
            imprimir("la cedula no ha sido encontrada");
        }else{
            imprimir(nombreCliente + " CC: " + nombreCedula + " edad " + edad);
            menuClientes(academia);
        }
    }
}