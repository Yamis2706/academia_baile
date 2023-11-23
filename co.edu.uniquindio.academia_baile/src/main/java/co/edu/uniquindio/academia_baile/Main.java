package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.*;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import static co.edu.uniquindio.academia_baile.MainMenu.*;

public class Main {
    /**
     * Main Principal del Proyecto
     * @param args
     */
    public static void main(String[] args) {
        // Declaración Método Inicializar Datos Prueba
        Academia academiaBaile = inializarDatosPrueba();

        // Create (Crear) - Cliente

        crearCliente("Juan Felipe Arias Sánchez", 24, "1094536998",
                academiaBaile);
        crearCliente("Ana María Alzate Mora", 35, "1067429755", academiaBaile);
        crearCliente("Camila Perez Gonzales", 22, "1055234787", academiaBaile);

        // Create (Crear) - Curso
        crearCurso(TipoBaile.SALSA, Categoria.ADULTOS, Nivel.ALTO, "Yamileth " +
                "Londoño Burgos", academiaBaile);
        crearCurso(TipoBaile.CUMBIA, Categoria.JUVENIL, Nivel.MEDIO, "Karen " +
                "Valentina Valbuena Reyes", academiaBaile);
        crearCurso(TipoBaile.BALLET, Categoria.PREJUVENIL, Nivel.ALTO,
                "Nelson Fabián Gallego Sánchez", academiaBaile);

        // Create (Crear) - Empleado
        crearEmpleado("Luis Alfonso Rodriguez", 45, "79523678",
                "Profesor", 1500000, academiaBaile);
        crearEmpleado("Martha Higuera Cepeda", 65, "51337009",
                "Administradora", 2500000, academiaBaile);
        crearEmpleado("Pilar Marcela Perez Choachi", 25, "1012544028",
                "Secretaria", 1500000, academiaBaile);

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
        return academiaBaile;
    }

    /**
     * Método para Inicializar Datos Prueba Clase Cliente
     *
     * @param nombre
     * @param edad
     * @param cedula
     * @param academiaBaile
     */
    private static void crearCliente(String nombre, int edad, String cedula,
                                     Academia academiaBaile) {
        academiaBaile.crearCliente(nombre, edad, cedula);
    }

    /**
     * Método para Inicializar Datos Prueba Clase Curso
     * @param tipoBaile
     * @param categoria
     * @param nivel
     * @param profesor
     * @param academiaBaile
     */
    private static void crearCurso(TipoBaile tipoBaile, Categoria categoria,
                                   Nivel nivel, String profesor, Academia academiaBaile) {
        academiaBaile.crearCurso(tipoBaile, categoria, nivel, profesor);
    }

    private static void crearEmpleado(String nombre, int edad, String cedula, String cargo,
                                      double salario, Academia academiaBaile) {
        academiaBaile.crearEmpleado(nombre, edad, cedula, cargo, salario);
    }
}