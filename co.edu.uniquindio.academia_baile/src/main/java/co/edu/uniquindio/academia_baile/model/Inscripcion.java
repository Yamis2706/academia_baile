package co.edu.uniquindio.academia_baile.model;

public class Inscripcion {
    /**
     * Atributos Clase Inscripción
     */
    private int numeroInscripcion;
    private Cliente clienteAsociado;
    private Curso cursoAsociado;

    /**
     * Variable para Relacionar Padre
     */
    Academia ownedByAcademia;

    /**
     * Constructor Vacío
     */
    public Inscripcion() {
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Curso getCursoAsociado() {
        return cursoAsociado;
    }

    public void setCursoAsociado(Curso cursoAsociado) {
        this.cursoAsociado = cursoAsociado;
    }

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "numeroInscripcion=" + numeroInscripcion +
                ", clienteAsociado=" + clienteAsociado +
                ", cursoAsociado=" + cursoAsociado +
                ", ownedByAcademia=" + ownedByAcademia +
                '}';
    }
}