package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import static co.edu.uniquindio.academia_baile.MainMenu.opcionesMenuPrincipal;

public class Main {

    /**
     * Main Principal del Proyecto
     * @param args
     */
    public static void main(String[] args) {


        // Declaración Método Inicializar Datos Prueba
        Academia academiaBaile = inializarDatosPrueba();


        // Create (Crear) - Cliente
        crearCliente("Juan Felipe", "Arias Sánchez", 24, "1094536998",
                "juanf.ariass@bailaportussuenos.co", academiaBaile);
        crearCliente("Ana María", "Alzate Mora", 35, "1067429755",
                " anam.alzatem@bailaportussuenos.co", academiaBaile);
        crearCliente("Camila", "Perez Gonzales", 22, "1055234787",
                "camila.perezg@bailaportussuenos.co", academiaBaile);


        // Create (Crear) - Curso
        crearCurso(TipoBaile.SALSA, Categoria.ADULTOS, Nivel.ALTO, "Si", 69, 180.000,
                academiaBaile);
        crearCurso(TipoBaile.CUMBIA, Categoria.JUVENIL, Nivel.MEDIO, "Si", 46, 150.000,
                academiaBaile);
        crearCurso(TipoBaile.BALLET, Categoria.PREJUVENIL, Nivel.ALTO, "Si", 25, 220.000,
                academiaBaile);


        // Declaración Método Opciones Menú Principal
        opcionesMenuPrincipal(academiaBaile);
    }

    /**
     *Método para Inicializar Datos Prueba Clase Academia
     * @return
     */
    private static Academia inializarDatosPrueba() {
        Academia academiaBaile = new Academia();
        academiaBaile.setNombre("Baila por tus Sueños");
        academiaBaile.setUbicacion("Avenida 13 Norte de la ciudad de Armenia, Quindío");
        return academiaBaile;
    }

    /**
     * Método para Inicializar Datos Prueba Clase Cliente
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

    /**
     * Método para Inicializar Datos Prueba Clase Curso
     * @param tipoBaile
     * @param categoria
     * @param nivel
     * @param profesor
     * @param horario
     * @param precioMes
     * @param academiaBaile
     */
    private static void crearCurso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor, int horario,
                                   double precioMes, Academia academiaBaile) {
        academiaBaile.crearCurso(tipoBaile, categoria, nivel, profesor, horario, precioMes);
    }
}