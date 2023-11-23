package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.*;

import static co.edu.uniquindio.academia_baile.model.enumeracion.Categoria.*;
import static co.edu.uniquindio.academia_baile.model.enumeracion.Nivel.*;
import static co.edu.uniquindio.academia_baile.model.enumeracion.TipoBaile.*;

public class MainTransaccion {
    public static void main(String[] args) {
        // Declaración Método Inicializar Datos Prueba
        Academia academia = inializarDatosPrueba();

        if(crearInscripcion(academia) == true){
            System.out.println("Inscripción creada !!!");
        }else{
            System.out.println("Inscripción no creada ¡¡¡");
        }
    }

    private static boolean crearInscripcion(Academia academia){
        return academia.crearInscripcion(
                001, "1094", SALSA);
    }

    private static Academia inializarDatosPrueba() {
        Academia academia = new Academia();
        academia.setNombre("Baila por tus Sueños");

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Felipe Andres Hidalgo Cifuentes");
        cliente1.setCedula("1047884391");
        cliente1.setEdad(25);
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Margarita Sol Mora");
        cliente2.setCedula("1011876033");
        cliente2.setEdad(32);
        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Susana Martinez Salazar");
        cliente3.setCedula("1005776712");
        cliente3.setEdad(21);

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Sofía Garcia Serpa");
        empleado1.setCedula("1080234917");
        empleado1.setEdad(41);
        Empleado empleado2 = new Empleado();
        empleado1.setNombre("Camilo Torres Zapata");
        empleado1.setCedula("79522506");
        empleado1.setEdad(64);
        Empleado empleado3 = new Empleado();
        empleado1.setNombre("Ana María Quintero Cubillos");
        empleado1.setCedula("1118453761");
        empleado1.setEdad(24);

        Curso curso1 = new Curso();
        curso1.setTipoBaile(SALSA);
        curso1.setCategoria(JUVENIL);
        curso1.setNivel(BAJO);
        curso1.setProfesor("Martha Burgos Ortega");
        Curso curso2 = new Curso();
        curso2.setTipoBaile(CUMBIA);
        curso2.setCategoria(ADULTOS);
        curso2.setNivel(MEDIO);
        curso2.setProfesor("Tatiana Carolina Cifuentes Carvajal");
        Curso curso3 = new Curso();
        curso3.setTipoBaile(BALLET);
        curso3.setCategoria(PREJUVENIL);
        curso3.setNivel(ALTO);
        curso3.setProfesor("Lina Fernanda Torres Acevedo");

        cliente1.setOwnedByAcademia(academia);
        cliente2.setOwnedByAcademia(academia);
        cliente3.setOwnedByAcademia(academia);
        empleado1.setOwnedByAcademia(academia);
        empleado2.setOwnedByAcademia(academia);
        empleado3.setOwnedByAcademia(academia);
        curso1.setOwnedByAcademia(academia);
        curso2.setOwnedByAcademia(academia);
        curso3.setOwnedByAcademia(academia);

        academia.getListaClientes().add(cliente1);
        academia.getListaClientes().add(cliente2);
        academia.getListaClientes().add(cliente3);
        academia.getListaEmpleados().add(empleado1);
        academia.getListaEmpleados().add(empleado2);
        academia.getListaEmpleados().add(empleado3);
        academia.getListaCursos().add(curso1);
        academia.getListaCursos().add(curso2);
        academia.getListaCursos().add(curso3);

        return academia;
    }
}