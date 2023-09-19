package co.edu.uniquindio.academia_baile;

import co.edu.uniquindio.academia_baile.model.Academia;
import co.edu.uniquindio.academia_baile.model.Curso;
import co.edu.uniquindio.academia_baile.model.Vestuario;
import co.edu.uniquindio.academia_baile.model.enumeracion.*;

import static co.edu.uniquindio.academia_baile.model.Curso.obtenerCursoNivelAlto;
import static co.edu.uniquindio.academia_baile.model.Curso.obtenerCursoMenorDuracion;
import static co.edu.uniquindio.academia_baile.model.Vestuario.calcularPrecioTotal;
import static co.edu.uniquindio.academia_baile.model.Vestuario.obtenerDescuentoMayor;

public class Main {

    public static void main(String[] args) {
        Academia academiaBaile = inicializaDatosPrueba();
        academiaBaile.mostrarInformacionCurso();
        academiaBaile.mostrarInformacionVestuario();

        double promedioPrecio = academiaBaile.obtenerPromedioPrecio();
        academiaBaile.mostrarPromedioPrecio(promedioPrecio);
        obtenerCursoNivelAlto(academiaBaile.getCursoSalsa(),academiaBaile.getCursoCumbia(),
                academiaBaile.getCursoBallet());
        obtenerCursoMenorDuracion(academiaBaile.getCursoSalsa(),academiaBaile.getCursoCumbia(),
                academiaBaile.getCursoBallet());
        calcularPrecioTotal (academiaBaile.getVestuarioFormal(),academiaBaile.getVestuarioEnsayo(),
                academiaBaile.getVestuarioCompetencia());
        obtenerDescuentoMayor(academiaBaile.getVestuarioFormal(),academiaBaile.getVestuarioEnsayo(),
                academiaBaile.getVestuarioCompetencia());



//        academiaBaile.getCursoSalsa().calcularPromedioPrecio(academiaBaile.getCursoSalsa(),academiaBaile.getCursoCumbia(), getCursoBallet);

    }

    private static Academia inicializaDatosPrueba() {
        Curso cursoSalsa = new Curso(TipoBaile.SALSA, Categoria.ADULTO, Nivel.ALTO,"Camilo Mora",
                3,180000);
        Curso cursoCumbia = new Curso(TipoBaile.CUMBIA, Categoria.JUVENIL, Nivel.MEDIO,"Laura Fonseca",
                2,150000);
        Curso cursoBallet = new Curso(TipoBaile.BALLET, Categoria.PREJUVENIL, Nivel.ALTO,"Neftaly Malagón",
                3,220000);
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
}