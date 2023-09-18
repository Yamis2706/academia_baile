package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Curso;
import co.edu.uniquindio.academia_baile.model.Vestuario;


public class Main {
    public static void main(String[] args) {

        Curso curso = inicializaDatosPrueba();

        curso.mostrarInformacionCurso();


    }

    private static Curso inicializaDatosPrueba() {
        Curso curso1 = crearCurso1("Salsa","Adultos","Alto","Sí",
                "6-9 pm",180000);
        Curso curso2 = crearCurso2("Cumbia","Juvenil","Medio","Sí",
                "4-6 pm",150000);
        Curso curso3 = crearCurso3("Ballet","Pre-juvenil","Alto","Sí",
                "2-5 pm",220000);
        Curso curso = null;

        curso.setCurso1(curso1);
        curso.setCurso2(curso2);
        curso.setCurso3(curso3);

        return curso;
    }


    private static Curso crearCurso(String tipoBaile, String categoria, String nivel,
                                    String vestuario, String horario, double precioMes){
        Curso curso = new Curso();
        curso.setTipoBaile(tipoBaile);
        curso.setCategoria(categoria);
        curso.setNivel(nivel);
        curso.setVestuario(vestuario);
        curso.setHorario(horario);
        curso.setPrecioMes(precioMes);


        return curso;
    }


}