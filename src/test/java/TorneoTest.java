
import dux.Jugadores;
import dux.Torneo;
import org.junit.jupiter.api .Assertions;
import org.junit.jupiter.api.Test;

public class TorneoTest {
    @Test
    public void cargarNombreTorneoTest(){
        //Resultado
        String resultado="German"; //cargar nombre German
        Torneo torneo= new Torneo();
        Jugadores jugador1=new Jugadores();
        Jugadores jugador2=new Jugadores();
        torneo.cargarNombreTorneo();;
        Assertions.assertEquals("German",torneo.getNombreTorneo());
    }
    @Test
    public void cargarSetsTest(){
        Torneo torneo=new Torneo();
        torneo.cargarSets();
        Assertions.assertTrue(torneo.getSetsTotales()==3 || torneo.getSetsTotales()==5);
    }

}
