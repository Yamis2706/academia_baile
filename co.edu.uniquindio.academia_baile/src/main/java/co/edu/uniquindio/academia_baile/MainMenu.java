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

}
