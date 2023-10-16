package co.edu.uniquindio.academia_baile.model;

public class Empleado extends Academia {

    /**
     * Atributos Clase Empleado
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String correo;

    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    /**
     * Constructor Vacío
     */
    public Empleado() {
    }

    /**
     * Constructor con Parámetros
     * @param nombre
     * @param apellido
     * @param edad
     * @param cedula
     * @param correo
     */
    public Empleado(String nombre, String apellido, int edad, String cedula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.correo = correo;
    }

    /**
     * Getters y Setters de Atributos Clase Empleado
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Getters y Setters de Variable para Relacionar Padre
     * @return
     */

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }

    /**
     * To String Clase Empleado
     * @return
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Edad=" + edad +
                ", Cédula='" + cedula + '\'' +
                ", Correo='" + correo + '\'' +
                '}';
    }
}