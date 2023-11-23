package academia;

import co.edu.uniquindio.academia_baile.dto.AcademiaDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AcademiaTest {
    AcademiaDto academiaDto;

    @BeforeEach
    public void init() {
        academiaDto = new AcademiaDto("mario", "10948", "10453", 18,
                15, "salsa",  150000);
    }

    @Test
    void testActualizarClienteCedula() {
        String cedulaClienteValidar = "10948";
        String cedulaCliente = academiaDto.cedulaCliente();
        assertTrue(cedulaCliente == cedulaClienteValidar);
    }

    @Test
    void testEliminarInscripciones() {
        int busquedaNumReferencia = 6;
        int numReferenciaExistente = academiaDto.numReferencia();
        assertFalse(busquedaNumReferencia != numReferenciaExistente);
    }

    @Test
    void testPago() {
        double valorPagar = academiaDto.valorPagar();
        assertTrue(valorPagar != 0);
    }

    @Test
    void testEliminarEmpleadoCedula() {
        String cedula = "1087";
        String cedulaEmpleado = academiaDto.cedulaEmpleado();
        assertTrue(cedula == cedulaEmpleado);
    }

    @Test
    void testObtenerInscripciones() {
        int NumReferencia = 9;
        int numReferenciaExistente = academiaDto.numReferencia();
        assertFalse(NumReferencia != numReferenciaExistente);
    }
}
