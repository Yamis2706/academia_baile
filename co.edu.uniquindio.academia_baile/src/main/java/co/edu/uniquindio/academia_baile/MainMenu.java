package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static co.edu.uniquindio.academia_baile.util.CapturaDatosUtil.*;

public class MainMenu {

    /**
     * Método para Mostrar Opciones Menú Principal
     * @return
     */
    public static String mostrarMenuPrincipal() {
        return  "Bienvenido a la Academia Baila por tus Sueños !!!" + "\n" + "\n" + "Elige alguna de las opciones " +
                "que tenemos para usted:" + "\n" +
                "1 - Clientes" +"\n" +
                "2 - Empleados" +"\n" +
                "3 - Cursos" +"\n" +
                "4 - Inscripciones" +"\n" +
                "5 - Pagos" +"\n" +
                "6 - Salir";
    }

    /**
     * Método para Mostrar Opciones CRUD Menú Cliente
     * @return
     */
    public static String mostrarMenuClientes() {
        return "Ha elegido la opción 1. Clientes, indique la acción que desea realizar:" + "\n" + "\n" +
                "1 - Crear Cliente" +"\n" +
                "2 - Obtener Clientes" +"\n" +
                "3 - Actualizar Información del Cliente" +"\n" +
                "4 - Eliminar Cliente" +"\n" +
                "5 - Volver al Menú Principal";
    }

    public static String mostrarMenuInscripciones() {
        return "Ha elegido la opción 4. Inscripciones, indique la " +
                "acción" +
                " que desea realizar:" + "\n" + "\n" +
                "1 - Crear Inscripción" +"\n" +
                "2 - Obtener Inscripción" +"\n" +
                "3 - Actualizar Información de la Inscripción" +"\n" +
                "4 - Eliminar Inscripción" +"\n" +
                "5 - Volver al Menú Principal";
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
                System.out.println("Ingrese una de las opciones");
                switch (opcion) {
                    case 1:
                        System.out.println("Ha seleccionado la opcion 1 - Clientes");
                        menuClientes(academia);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("Ha seleccionado la opcion 4 - " +
                                "Inscripciones");
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
                System.out.println("Ingrese una de las siguientes opciones");
                switch (opcion) {
                    case 1:
                        imprimir("Ha seleccionado la opcion 1 - Crear Cliente" + "\n" + "\n" +
                                "Por favor diligenciar los siguientes datos:"
                        );
                        System.out.println("Ha seleccionado la opcion 1 - Crear Cliente");
                        String respuestaNombre = leerStringVentana("Ingrese su Nombre");
                        String respuestaApellido = leerStringVentana("Ingrese su Apellido");
                        int respuestaEdad =  leerEnteroVentana ("Ingrese su Edad");
                        String respuestaCedula = leerStringVentana("Ingrese su Cédula");
                        String respuestaCorreo = leerStringVentana("Ingrese su Correo");
                        academia.crearCliente(respuestaNombre, respuestaApellido,respuestaEdad, respuestaCedula,
                                respuestaCorreo);
                        break;
                    case 2:
                        String mensaje = "";
                        for (int i = 0; i < academia.obtenerClientes().size(); i++) {
                            String idCliente = Integer.toString(i+1);
                            mensaje += idCliente +". "+ academia.obtenerClientes().get(i) + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println("Ha seleccionado la opción 2");
                        break;
                    case 3:
                        String mensaje2 = "";
                        for (int i = 0; i < academia.obtenerClientes().size(); i++) {
                            String idCliente = Integer.toString(i+1);
                            mensaje2 += idCliente +". "+ academia.obtenerClientes().get(i) + "\n";
                        }
                        System.out.println("Ha seleccionado la opción 3");
                        String cedulaActualizar = leerStringVentana("Digite el número de cédula del cliente " +
                                "que desea actualizar:" + "\n"
                                + "\n" + mensaje2
                        );
                        String actualizarNombre = leerStringVentana("Digite el nuevo Nombre");
                        String actualizarApellido = leerStringVentana("Digite el nuevo Apellido");
                        int actualizarEdad = leerEnteroVentana("Digite la nueva Edad");
                        String actualizarCedula = leerStringVentana("Digite la nueva Cédula");
                        String actualizarCorreo = leerStringVentana("Digite el nuevo Correo");
                        academia.actualizarCliente
                                (cedulaActualizar, academia.obtenerClientes(),actualizarNombre,actualizarApellido,
                                        actualizarEdad,actualizarCedula,actualizarCorreo);
                        break;
                    case 4:
                        String mensaje3 = "";
                        for (int i = 0; i < academia.obtenerClientes().size(); i++) {
                            String idCliente = Integer.toString(i+1);
                            mensaje3 += idCliente +". "+ academia.obtenerClientes().get(i) + "\n";
                        }
                        System.out.println("Ha seleccionado la opción 4");
                        String numeroCedulaClienteEliminar = leerStringVentana("Para eliminar el cliente, " +
                                "por favor digitar el número de cédula:" + "\n" + "\n" + mensaje3);
                        academia.eliminarCliente(numeroCedulaClienteEliminar);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se permiten los números entre 1 y 5");
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
                System.out.println("Ingrese una de las siguientes opciones");
                switch (opcion) {
                    case 1:
                        crearInscripcion(academia);
                        break;
                    case 2:

                        obtenerInscripciones(academia);
                        break;
                    case 3:
                        actualizarInscripcion(academia);
                        break;
                    case 4:
                        String mensaje3 = "";
                        for (int i = 0; i < academia.obtenerClientes().size(); i++) {
                            String idCliente = Integer.toString(i+1);
                            mensaje3 += idCliente +". "+ academia.obtenerClientes().get(i) + "\n";
                        }
                        System.out.println("Ha seleccionado la opción 4");
                        String numeroCedulaClienteEliminar = leerStringVentana("Para eliminar el cliente, " +
                                "por favor digitar el número de cédula:" + "\n" + "\n" + mensaje3);
                        academia.eliminarCliente(numeroCedulaClienteEliminar);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se permiten los números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe digitar un número");
                sn.next();
            }
        }
    }

    private static void crearInscripcion(Academia academia){
        imprimir("Ha seleccionado la opcion 1 - Crear inscrpcion" + "\n" +
                "\n" +
                "Por favor diligenciar los siguientes datos:"
        );
        int numeroInscripcion = leerEnteroVentana("Ingrese el numero de " +
                "inscripcion");
        String cedulaCliente = leerStringVentana("Ingrese la cedula del " +
                "cliente");
        String tipoBaile = leerStringVentana("Ingrese el tipo baile");
        String categoria = leerStringVentana("Ingrese la categoria");
        String respuestNivel = leerStringVentana("Ingrese su Nivel");
        academia.crearInscripcion(numeroInscripcion, cedulaCliente,
                TipoBaile.valueOf(tipoBaile.toUpperCase()), categoria,
                respuestNivel);
    }
    private static void obtenerInscripciones(Academia academia){
        String mensaje = "";
        for (int i = 0; i < academia.getListaInscripciones().size(); i++) {
            String idCliente = Integer.toString(i+1);
            mensaje += idCliente +". " +academia.getListaInscripciones().get(i).getNumeroInscripcion()+ "  " +
                    academia.getListaInscripciones().get(i).getCurso().getTipoBaile()+ "  " +
                    academia.getListaInscripciones().get(i).getCliente().getCedula()+"  " +
                    academia.getListaInscripciones().get(i).getCliente().getNombre() +"  " +
                     academia.getListaInscripciones().get(i).getCliente().getEdad() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    private static void actualizarInscripcion(Academia academia){
        String mensaje2 = "";
        for (int i = 0; i < academia.getListaInscripciones().size(); i++) {
            String idCliente = Integer.toString(i+1);
            mensaje2 +=  academia.getListaInscripciones().get(i).getNumeroInscripcion()+" "+
                    academia.getListaInscripciones().get(i).getCurso().getTipoBaile()+ "  " +
                    academia.getListaInscripciones().get(i).getCliente().getCedula()+"  " +
                    academia.getListaInscripciones().get(i).getCliente().getNombre() +"  " +
                    academia.getListaInscripciones().get(i).getCliente().getEdad() + "\n";
        }
        System.out.println("Ha seleccionado la opción 3");
        String cedulaActualizar = leerStringVentana("Digite el " +
                "getNumeroInscripcion " +
                "que desea actualizar:" + "\n"
                + "\n" + mensaje2
        );
        int numeroInscripcion = leerEnteroVentana("ingrese el numero de " +
                "inscripcion");
        String cedulaCliente = leerStringVentana("Digite la nueva cedula");
        String tipoBaile = leerStringVentana("Digite el nuevo tipo baile: SALSA, CUMBIA, BALLE");
        String categoria = leerStringVentana("Digite la nueva categoria  ADULTOS, JUVENIL, PREJUVENIL");
        String respuestNivel = leerStringVentana("Digite el nuevo nivel:   ALTO, MEDIO, BAJO");
        academia.actualizarInscripcion(numeroInscripcion, cedulaCliente,
                TipoBaile.valueOf(tipoBaile.toUpperCase()),
                Categoria.valueOf(categoria.toUpperCase()),
                Nivel.valueOf(respuestNivel.toUpperCase()));
    }
}