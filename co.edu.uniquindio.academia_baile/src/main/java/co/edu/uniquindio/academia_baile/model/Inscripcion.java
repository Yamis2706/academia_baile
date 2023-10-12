package co.edu.uniquindio.academia_baile.model;

public class Inscripcion {
    private Cliente cliente;
    private Curso curso;
    Academia ownedByAcademia;

    public Inscripcion() {
    }

    public Inscripcion(Cliente cliente, Curso curso) {
        this.cliente = cliente;
        this.curso = curso;
    }

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

    public Academia getOwnedByAcademia() {
        return ownedByAcademia;
    }

    public void setOwnedByAcademia(Academia ownedByAcademia) {
        this.ownedByAcademia = ownedByAcademia;
    }

    @Override
    public String toString() {
        return "Inscripción{" +
                "Cliente=" + cliente +
                ", Curso=" + curso +
                '}';
    }
}