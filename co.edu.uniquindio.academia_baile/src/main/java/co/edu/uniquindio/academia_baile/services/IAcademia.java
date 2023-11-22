package co.edu.uniquindio.academia_baile.services;

import co.edu.uniquindio.academia_baile.model.Inscripcion;
import co.edu.uniquindio.academia_baile.model.enumeracion.Categoria;
import co.edu.uniquindio.academia_baile.model.enumeracion.Nivel;
import co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile;

public interface IAcademia {

    boolean crearInscripcion(int numeroIncripcion,
                             String cedulaCliente,
                             TipoBaile tipoBaile
                            );

    boolean eliminarInscripcion (int numeroIncripcion);

    boolean actualizarInscripcion (int numeroIncripcion,
                                   String cedulaCliente,
                                   TipoBaile tipoBaile);

    Inscripcion obtenerInscripcion (int numeroIncripcion);
}