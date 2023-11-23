package co.edu.uniquindio.academia_baile.dto;

public record AcademiaDto(
    String nombreCliente,
    String cedulaCliente,
    String cedulaEmpleado,
    int edadCliente,
    int numReferencia,
    String tipoBaile,
    double valorPagar) {
}