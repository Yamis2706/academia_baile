package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import static co.edu.uniquindio.academia_baile.MainMenu.opcionesMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        Academia academiaBaile = inializarDatosPrueba();
        //Create
        crearCliente("juan", "arias", 24, "1094","juan@1001",  academiaBaile);
        crearCliente("ana", "alzate",35, "1095", " ana@1002", academiaBaile);
        crearCliente("maria", "perez",22, "1096", "maria@1003", academiaBaile);

        opcionesMenuPrincipal(academiaBaile);
    }

    /**
     *Método para Inicializar Datos Prueba
     * @return
     */
    private static Academia inializarDatosPrueba() {
        Academia academiaBaile = new Academia();
        academiaBaile.setNombre("Baila por tus sueños");
        academiaBaile.setUbicacion("Av 13 N Armenia, Quindio");
        return academiaBaile;
    }

    /**
     *Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param edad
     * @param cedula
     * @param correo
     * @param academiaBaile
     */
    private static void crearCliente(String nombre,
                                     String apellido,
                                     int edad,
                                     String cedula,
                                     String correo,
                                     Academia academiaBaile) {
        academiaBaile.crearCliente(nombre, apellido, edad, cedula, correo);
    }
}