package co.edu.uniquindio.academia_baile.services;

import co.edu.uniquindio.academia_baile.model.Cliente;
import co.edu.uniquindio.academia_baile.model.Curso;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

public interface IAcademia {

    boolean crearInscripcion(int numeroIncripcion,
                             String cedulaCliente,
                             TipoBaile tipoBaile,
                             String categoria,
                             String nivel
                            );

    boolean eliminarInscripcion (int numeroIncripcion);

    boolean actualizarInscripcion (int numeroIncripcion,
                                   String cedulaCliente,
                                   TipoBaile tipoBaile,
                                   String categoria,
                                   String nivel);

    boolean obtenerInscripcion (int numeroIncripcion);
}
