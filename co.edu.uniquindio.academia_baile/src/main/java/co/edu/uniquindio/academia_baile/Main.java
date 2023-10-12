package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import static co.edu.uniquindio.academia_baile.MainMenu.opcionesMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        Academia academiaBaile = inializarDatosPrueba();
        //Create (Crear)
        crearCliente("Juan Felipe", "Arias Sánchez", 24, "1094536998",
                "juanf.ariass@bailaportussuenos.co", academiaBaile);
        crearCliente("Ana María", "Alzate Mora", 35, "1067429755",
                " anam.alzatem@bailaportussuenos.co", academiaBaile);
        crearCliente("Camila", "Perez Gonzales", 22, "1055234787",
                "camila.perezg@bailaportussuenos.co", academiaBaile);

        opcionesMenuPrincipal(academiaBaile);
    }

    /**
     *Método para Inicializar Datos Prueba
     * @return
     */
    private static Academia inializarDatosPrueba() {
        Academia academiaBaile = new Academia();
        academiaBaile.setNombre("Baila por tus Sueños");
        academiaBaile.setUbicacion("Avenida 13 Norte de la ciudad de Armenia, Quindío");
        return academiaBaile;
    }

    /**
     * Método para crear cliente
     * @param nombre
     * @param apellido
     * @param edad
     * @param cedula
     * @param correo
     * @param academiaBaile
     */
    private static void crearCliente(String nombre, String apellido, int edad, String cedula, String correo,
                                     Academia academiaBaile) {
        academiaBaile.crearCliente(nombre, apellido, edad, cedula, correo);
    }
}