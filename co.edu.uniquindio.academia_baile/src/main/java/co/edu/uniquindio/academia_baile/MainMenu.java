package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static co.edu.uniquindio.academia_baile.util.CapturaDatosUtil.*;

public class MainMenu {

    /**
     * Método utilizado para mostrar las opciones del menú principal
     * @return
     */
    public static String mostrarMenuPrincipal() {
        return  "Bienvenido a la Academia Baila por tus Sueños, elige alguna de las opciones que tenemos para usted:"
                + "\n" +
                "1 - Clientes" +"\n" +
                "2 - Empleados" +"\n" +
                "3 - Cursos" +"\n" +
                "4 - Inscripciones" +"\n" +
                "5 - Pagos" +"\n" +
                "6 - Salir";
    }

    /**
     * Método utilizado para mostrar las opciones del CRUD menú clientes
     * @return
     */
    public static String mostrarMenuClientes() {
        return "Ha elegido la opción 1. Clientes, indique que quiere realizar:" + "\n" +
                "1 - Crear Cliente" +"\n" +
                "2 - Obtener Clientes" +"\n" +
                "3 - Actualizar Información del Cliente" +"\n" +
                "4 - Eliminar Cliente" +"\n" +
                "5 - Salir";
    }

    public static void opcionesMenuPrincipal(Academia academia) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {

            //mostrarMenu();
            opcion = leerEnteroVentana(mostrarMenuPrincipal());
            try {
                System.out.println("Ingrese una de las opciones");
                //opcion = sn.nextInt();
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

    public static void menuClientes(Academia academia) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {
            //mostrarMenu();

            opcion = leerEnteroVentana(mostrarMenuClientes());
            try {
                System.out.println("Ingrese una de las siguientes opciones");
                //opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        imprimir("Ha seleccionado la opcion 1 - Crear Cliente"+ "\n" +
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
                        System.out.println("Ha seleccionado la opciÓn 3");

                        //Actualizar
                        String cedulaActualizar = leerStringVentana("Digite el número de cédula del cliente " +
                                "que desea actualizar" + "\n"
                                +"\n"+ mensaje2
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
                                "por favor digitar el número de cédula" + "\n" + mensaje3);
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
}