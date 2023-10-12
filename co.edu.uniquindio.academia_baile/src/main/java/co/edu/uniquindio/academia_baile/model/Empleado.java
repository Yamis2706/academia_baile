package co.edu.uniquindio.academia_baile.model;

/**
 * Atributos de la clase empleado
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String correo;
    Academia ownedByAcademia;

    /**
     * Constructor vacio
     */
    public Empleado() {
    }

    /**
     * Constructor con parametros
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
     * getters y setters
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

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
