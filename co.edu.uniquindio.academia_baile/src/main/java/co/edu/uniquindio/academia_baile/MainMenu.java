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
        return  "Bienvenido a la academia baila por tus sueños, elije alguna de las opciones que tenermos para ti" + "\n" +
                "1 - Clientes" +"\n" +
                "2 - empleados" +"\n" +
                "3 - cursos" +"\n" +
                "4 - inscripciones" +"\n" +
                "5 - pagos" +"\n" +
                "6 - Salir";
    }

    /**
     * Método utilizado para mostrar las opciones del CRUD menú clientes
     * @return
     */
    public static String mostrarMenuClientes() {
        return "haz elegido la opción 1. Clientes, indica que quieres realizar" + "\n" +
                "1 - Crear Cliente" +"\n" +
                "2 - Obtener Clientes" +"\n" +
                "3 - Actualizar información de Cliente" +"\n" +
                "4 - Eliminar Cliente" +"\n" +
                "5 - Salir";
    }

    /**
     *Método utilizado para elegir las diferentes opciones que tiene el usuario dentro del sistema
     * @param academia
     */
    public static void opcionesMenuPrincipal(Academia academia) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            //mostrarMenu();

            opcion = leerEnteroVentana(mostrarMenuPrincipal());

            try {

                System.out.println("Escribe una de las opciones");
                //opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1 - clientes");
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
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    /**
     * Método utilizado para elegir las diferentes opciones del CRUD de clientes
     * @param academia
     */
    public static void menuClientes(Academia academia) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {
            //mostrarMenu();

            opcion = leerEnteroVentana(mostrarMenuClientes());
            try {

                System.out.println("Escribe una de las opciones");
                //opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        imprimir("Has seleccionado la opcion 1 - Crear cliente"+ "\n" +
                                "Por favor diligencia los siguientes datos"
                        );
                        System.out.println("Has seleccionado la opcion 1 - Crear cliente");

                        String respuestaNombre = leerStringVentana("Ingresa tu nombre");
                        String respuestaApellido = leerStringVentana("Ingresa tu apellido");
                        int respuestaEdad =  leerEnteroVentana ("ingresa tu edad");
                        String respuestaCedula = leerStringVentana("Ingresa tu cedula");
                        String respuestaCorreo = leerStringVentana("Ingresa tu correo");

                        academia.crearCliente(respuestaNombre, respuestaApellido,respuestaEdad, respuestaCedula,respuestaCorreo);
                        break;
                    case 2:
                        String mensaje = "";
                        for (int i = 0; i < academia.obtenerClientes().size(); i++) {
                            String idCliente = Integer.toString(i+1);
                            mensaje += idCliente +". "+ academia.obtenerClientes().get(i) + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        String mensaje2 = "";
                        for (int i = 0; i < academia.obtenerClientes().size(); i++) {
                            String idCliente = Integer.toString(i+1);
                            mensaje2 += idCliente +". "+ academia.obtenerClientes().get(i) + "\n";
                        }
                        System.out.println("Has seleccionado la opcion 3");

                        //Actualizar

                        String cedulaActualizar = leerStringVentana("Elige el numero de cédula del cliente que desea actualizar" + "\n"
                                +"\n"+ mensaje2

                        );

                        String actualizarNombre = leerStringVentana("escriba el nuevo nombre");
                        String actualizarApellido = leerStringVentana("escriba el nuevo apellido");

                        int actualizarEdad = leerEnteroVentana("Elige la nueva edad");
                        String actualizarCedula = leerStringVentana("escriba la nueva cedula");
                        String actualizarCorreo = leerStringVentana("escriba el nuevo correo");


                        academia.actualizarCliente
                                (cedulaActualizar, academia.obtenerClientes(),actualizarNombre,actualizarApellido,actualizarEdad,actualizarCedula,actualizarCorreo);
                        break;
                    case 4:
                        String mensaje3 = "";
                        for (int i = 0; i < academia.obtenerClientes().size(); i++) {
                            String idCliente = Integer.toString(i+1);
                            mensaje3 += idCliente +". "+ academia.obtenerClientes().get(i) + "\n";
                        }
                        System.out.println("Has seleccionado la opcion 4");
                        String numeroCedulaClienteEliminar = leerStringVentana("Para eliminar el cliente, por favor indica el numero de cedula" + "\n" + mensaje3);
                        academia.eliminarCliente(numeroCedulaClienteEliminar);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
