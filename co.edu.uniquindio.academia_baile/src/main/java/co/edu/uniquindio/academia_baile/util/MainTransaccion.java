package co.edu.uniquindio.academia_baile.util;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.Cliente;
import co.edu.uniquindio.academia_baile.model.Curso;
import co.edu.uniquindio.academia_baile.model.Empleado;

import static co.edu.uniquindio.academia_baile.model.enumeracion.Categoria.ADULTOS;
import static co.edu.uniquindio.academia_baile.model.enumeracion.Categoria.PREJUVENIL;
import static co.edu.uniquindio.academia_baile.model.enumeracion.Nivel.BAJO;
import static co.edu.uniquindio.academia_baile.model.enumeracion.Nivel.MEDIO;
import static co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile.SALSA;

public class MainTransaccion {
    public static void main(String[] args) {
        Academia academia = inializarDatosPrueba();
        if(crearInscripcion(academia)== true){
            System.out.println("inscripcion creado");
        }else{
            System.out.println("inscripcion no creado");
        }
    }

    private static boolean crearInscripcion(Academia academia){
        return academia.crearInscripcion(
          001,
                "1094",
                SALSA,
                PREJUVENIL.toString(),
                BAJO.toString()

        );

    }

    private static Academia inializarDatosPrueba() {
        Academia academia = new Academia();
        academia.setNombre("Baila por tus Sueños");

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Jorge");
        cliente1.setApellido("Alfonso");
        cliente1.setCedula("1094");
        cliente1.setEdad(25);
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Margarita");
        cliente2.setApellido("Garza");
        cliente2.setCedula("1095");
        cliente2.setEdad(32);

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Sofía");
        empleado1.setApellido("Mora");
        empleado1.setCedula("1080");
        empleado1.setEdad(41);

        Curso curso = new Curso();
        curso.setTipoBaile(SALSA);
        curso.setCategoria(ADULTOS);
        curso.setNivel(MEDIO);
        curso.setProfesor("Sofía Mora");
        curso.setHorario(2);

        cliente1.setOwnedByAcademia(academia);
        cliente2.setOwnedByAcademia(academia);
        empleado1.setOwnedByAcademia(academia);
        curso.setOwnedByAcademia(academia);

        academia.getListaClientes().add(cliente1);
        academia.getListaClientes().add(cliente2);
        academia.getListaEmpleados().add(empleado1);
        academia.getListaCursos().add(curso);

        return academia;
    }
}
