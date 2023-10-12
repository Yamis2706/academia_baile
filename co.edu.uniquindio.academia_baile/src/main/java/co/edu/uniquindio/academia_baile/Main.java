package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import static co.edu.uniquindio.academia_baile.MainMenu.opcionesMenuPrincipal;


public class Main {

    public static void main(String[] args) {
        Academia academiaBaile = inializarDatosPrueba();
        opcionesMenuPrincipal(academiaBaile);

    }
    private static Academia inializarDatosPrueba() {
        Academia academiaBaile = new Academia();
        academiaBaile.setNombre("Baila por tus sueños");
        academiaBaile.setUbicacion("Av 13 N Armenia, Quindio");
        return academiaBaile;
    }
}