package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.Curso;
import co.edu.uniquindio.academia_baile.model.Vestuario;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

public class Main {

    public static void main(String[] args) {
        Academia academiaBaile = inicializaDatosPrueba();
        academiaBaile.mostrarInformacionCurso();
        academiaBaile.calcularPromedioPrecio();
    }

    private static Academia inicializaDatosPrueba() {
        Curso cursoSalsa = crearCurso(TipoBaile.SALSA, Categoria.ADULTO, Nivel.ALTO,"Camilo Mora",
                "6-9 pm",180000);
        Curso cursoCumbia = crearCurso(TipoBaile.CUMBIA, Categoria.JUVENIL, Nivel.MEDIO,"Laura Fonseca",
                "4-6 pm",150000);
        Curso cursoBallet = crearCurso(TipoBaile.BALLET, Categoria.PREJUVENIL, Nivel.ALTO,"Neftaly Malagón",
                "2-5 pm",220000);
        Vestuario vestuarioFormal = new Vestuario (Tipo.FORMAL, Estado.NUEVO, Talla.M, "lentejuelas",
                560000, 0.1);
        Vestuario vestuarioEnsayo = new Vestuario (Tipo.ENSAYO, Estado.NUEVO, Talla.S, "Dácron",
                480000, 0.05);
        Vestuario vestuarioCompetencia = new Vestuario (Tipo.COMPETENCIA, Estado.NUEVO, Talla.XS,
                "licra Power", 390000, 0.03);
        Academia academiaBaile = new Academia ("Baila por tus sueños", "Armenia - Quindío",
                cursoSalsa, cursoCumbia, cursoBallet, vestuarioFormal, vestuarioEnsayo, vestuarioCompetencia);
        academiaBaile.setCursoSalsa(cursoSalsa);
        academiaBaile.setCursoCumbia(cursoCumbia);
        academiaBaile.setCursoBallet(cursoBallet);
        return academiaBaile;
    }

    private static Curso crearCurso(TipoBaile tipoBaile, Categoria categoria, Nivel nivel, String profesor,
                                    String horario, double precioMes){
        Curso curso = new Curso(tipoBaile, categoria, nivel, profesor, horario, precioMes);
        return curso;
    }
}