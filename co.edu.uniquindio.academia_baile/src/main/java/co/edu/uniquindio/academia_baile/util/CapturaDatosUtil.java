package co.edu.uniquindio.academia_baile.util;

import co.edu.uniquindio.academia_baile.MainMenu;
import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

import javax.swing.*;

public class CapturaDatosUtil {
    /**
     * Método para Imprimir Mensaje Librería JOptionPane
     * @param mensaje
     */
    public static void imprimir (String mensaje) {
        JOptionPane.showMessageDialog(null,mensaje);
    }

    /**
     * Método para Leer Dato Tipo Entero Librería JOptionPane
     * @param mensaje
     * @return
     */
    public static int leerEnteroVentana (String mensaje) {
        int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    /**
     * Método para Leer Dato Tipo String Librería JOptionPane
     * @param mensaje
     * @return
     */
    public static String  leerStringVentana (String mensaje) {
        String respuesta = "";
        respuesta  = JOptionPane.showInputDialog(mensaje);
        return respuesta;
    }

    public static double leerDoubleVentana (String mensaje) {
        double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    public static String  MensajeError (String mensaje) {
        MainMenu mainMenu = new MainMenu();
        String respuesta = "";
        return respuesta = JOptionPane.showInputDialog(null,
                "Escriba nuevamente la cedula", "Error!", JOptionPane.ERROR_MESSAGE);
    }
}