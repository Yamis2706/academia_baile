package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.Curso;
import co.edu.uniquindio.academia_baile.model.Vestuario;

public class Main {
    public static void main(String[] args) {

        Academia academiaBaile = inicializaDatosPrueba();
        academiaBaile.mostrarInformacionCurso();

    }

    private static Academia inicializaDatosPrueba() {
        Curso cursoSalsa = crearCurso("Salsa","Adultos","Alto","Sí",
                "6-9 pm",180000);
        Curso cursoCumbia = crearCurso("Cumbia","Juvenil","Medio","Sí",
                "4-6 pm",150000);
        Curso cursoBallet = crearCurso("Ballet","Pre-juvenil","Alto","Sí",
                "2-5 pm",220000);
        Vestuario vestuarioFormal = new Vestuario ("Formal", "Nuevo", "M", "lentejuelas", 560000, 0.1);
        Vestuario vestuarioEnsayo = new Vestuario ("Ensayo", "Usado", "S", "Dácron", 480000, 0.05);
        Vestuario vestuarioCompetencia = new Vestuario ("Competencia", "Nuevo", "XS", "licra Power", 390000, 0.03);
        Academia academiaBaile = new Academia ("Baila por tus sueños", "Armenia - Quindío", cursoSalsa, cursoCumbia, cursoBallet, vestuarioFormal, vestuarioEnsayo, vestuarioCompetencia);
        academiaBaile.setCursoSalsa(cursoSalsa);
        academiaBaile.setCursoCumbia(cursoCumbia);
        academiaBaile.setCursoBallet(cursoBallet);
        return academiaBaile;
    }

    private static Curso crearCurso(String tipoBaile, String categoria, String nivel,
                                    String profesor, String horario, double precioMes){
        Curso curso = new Curso();
        curso.setTipoBaile(tipoBaile);
        curso.setCategoria(categoria);
        curso.setNivel(nivel);
        curso.setProfesor(profesor);
        curso.setHorario(horario);
        curso.setPrecioMes(precioMes);
        return curso;
    }
}