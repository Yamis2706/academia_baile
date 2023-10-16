package co.edu.uniquindio.academia_baile.util;

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
    public static String  leerStringVentana(String mensaje) {
        String respuesta = "";
        respuesta  = JOptionPane.showInputDialog(mensaje);
        return respuesta;
    }
}