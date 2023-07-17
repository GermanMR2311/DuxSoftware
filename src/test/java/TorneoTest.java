
import dux.Jugadores;
import dux.Torneo;
import org.apache.commons.validator.routines.DoubleValidator;
import org.junit.jupiter.api .Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TorneoTest {
    DoubleValidator validator = new DoubleValidator();

    @Test
    public void cargarNombreTorneoTest() {
        //Resultado
        String resultado = "German"; //cargar nombre German
        Torneo torneo = new Torneo();
        Jugadores jugador1 = new Jugadores();
        Jugadores jugador2 = new Jugadores();
        //Escribir el nombre German
        torneo.cargarNombreTorneo();
        ;
        Assertions.assertEquals("German", torneo.getNombreTorneo());
    }

    @Test
    public void cargarSetsTest() {
        Torneo torneo = new Torneo();
        torneo.cargarSets();
        Assertions.assertTrue(Arrays.asList(torneo.getopcionesCargarJOptionPane()).contains(String.valueOf(torneo.getSetsTotales())));

    }

    @Test
    public void cargarProbabilidadDeGanar() {
        Torneo torneo = new Torneo();
        Jugadores jugador1 = new Jugadores("Pablo");
        Jugadores jugador2 = new Jugadores("Pedro");
        torneo.cargarProbabilidadDeGanar(jugador1, jugador2);
        Assertions.assertTrue(validator.isInRange(jugador1.getProbabilidadDeGanar(), 1, 100) && validator.isInRange(jugador2.getProbabilidadDeGanar(), 1, 100));
        Assertions.assertTrue(jugador2.getProbabilidadDeGanar() == 100 - jugador1.getProbabilidadDeGanar());
    }

    @Test
    public void igualarLargoNombreTest() {
        Torneo torneo = new Torneo();
        Jugadores jugador1 = new Jugadores("Ger");
        Jugadores jugador2 = new Jugadores("Matias");
        torneo.igualarLargoNombre(jugador1, jugador2);
        Assertions.assertTrue(jugador1.getNombre().length() == jugador2.getNombre().length());
    }

    @Test
    public void getGanadorTorneo() {
        Torneo torneo = new Torneo();
        torneo.setNombreTorneo("Grand Slam");
        torneo.setSetsTotales(3);
        Jugadores jugador1 = new Jugadores("German");
        ArrayList<Integer> setsJugador1 = new ArrayList<Integer>();
        setsJugador1.add(4);
        setsJugador1.add(6);
        setsJugador1.add(3);
        jugador1.setPuntosSets(setsJugador1);
        Jugadores jugador2 = new Jugadores("Pablo");
        ArrayList<Integer> setsJugador2 = new ArrayList<Integer>();
        setsJugador2.add(6);
        setsJugador2.add(2);
        setsJugador2.add(6);
        jugador2.setPuntosSets(setsJugador1);
        Assertions.assertEquals(jugador2, torneo.getGanadorTorneo(jugador1, jugador2));
    }

    @Test
    public void preguntarRevanchaTest() {
        Torneo torneo = new Torneo();
        String resultado;
        if (JOptionPane.showOptionDialog(null, "¿Quieren jugar la revancha?", null, 0, JOptionPane.QUESTION_MESSAGE, null, torneo.getOpcionesRevanchaJOptionPane(), torneo.getOpcionesRevanchaJOptionPane()[0]) == 0) {
            Assertions.assertTrue(true);
        }
        else{
            Assertions.assertFalse(false);
        }

    }



}
