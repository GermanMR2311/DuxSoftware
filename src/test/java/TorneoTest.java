
import dux.Jugadores;
import dux.Torneo;
import org.apache.commons.validator.routines.DoubleValidator;
import org.junit.jupiter.api .Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TorneoTest {
    DoubleValidator validator=new DoubleValidator();
    @Test
    public void cargarNombreTorneoTest(){
        //Resultado
        String resultado="German"; //cargar nombre German
        Torneo torneo= new Torneo();
        Jugadores jugador1=new Jugadores();
        Jugadores jugador2=new Jugadores();
        //Escribir el nombre German
        torneo.cargarNombreTorneo();;
        Assertions.assertEquals("German",torneo.getNombreTorneo());
    }
    @Test
    public void cargarSetsTest(){
        Torneo torneo=new Torneo();
        torneo.cargarSets();
        Assertions.assertTrue(Arrays.asList(torneo.getopcionesCargarJOptionPane()).contains(String.valueOf(torneo.getSetsTotales())));

    }
    @Test
    public void cargarPorbabilidadDeGanar(){
        Torneo torneo= new Torneo();
        Jugadores jugador1=new Jugadores("Pablo");
        Jugadores jugador2=new Jugadores("Pedro");
        torneo.cargarPorbabilidadDeGanar(jugador1,jugador2);
        Assertions.assertTrue(validator.isInRange(jugador1.getProbabilidadDeGanar(),1,100)&&validator.isInRange(jugador2.getProbabilidadDeGanar(),1,100));
        Assertions.assertTrue(jugador2.getProbabilidadDeGanar()==100-jugador1.getProbabilidadDeGanar());
    }
    @Test
    public void igualarLargoNombreTest(){
        Torneo torneo=new Torneo();
        Jugadores jugador1=new Jugadores("Ger");
        Jugadores jugador2=new Jugadores("Matias");
        torneo.igualarLargoNombre(jugador1,jugador2);
        Assertions.assertTrue(jugador1.getNombre().length()==jugador2.getNombre().length());
    }



}
