package co.edu.uniquindio.academia_baile.model;

public class Inscripcion {

    /**
     * Atributos Clase Inscripción
     */
    private int numeroInscripcion;
    private Cliente cliente;
    private Curso curso;

    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    /**
     * Constructor Vacío
     */
    public Inscripcion() {
    }

    /**
     * Constructor con Parámetros
     * @param cliente
     * @param curso
     */
    public Inscripcion(int numeroInscripcion, Cliente cliente, Curso curso) {
        this.numeroInscripcion = numeroInscripcion;
        this.cliente = cliente;
        this.curso = curso;
    }

    /**
     * Getters y Setters de Atributos Clase Inscripción
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
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
     * To String Clase Inscripción
     * @return
     */
    @Override
    public String toString() {
        return "Inscripción{" +
                "Cliente=" + cliente +
                ", Curso=" + curso +
                '}';
    }
}