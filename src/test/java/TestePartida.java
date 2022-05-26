import controller.ControllerPartida;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertEquals;
import model.Equipe;
import model.Partida;
import org.junit.Test;

/**
 * @author Eloisa Bazzanella
 * @since  maio, 2022
 */
public class TestePartida {
    
    @Test
    public void testaQtdSetsValida() throws Exception {
        Partida p = new Partida("18:30", "Imbatíveis", "Os incríveis");
        assertTrue(p.qtdSetsValida());
    }
    
    @Test
    public void testaQtdJogadasValida() {
        Partida p = new Partida("18:30", "Imbatíveis", "Os incríveis");
        assertTrue(p.qtdJogadasValida());
    }
    
    @Test
    public void testaNomesEquipesExistente() {
        Partida p = new Partida("18:30", "Imbatíveis", "Os incríveis");
        assertTrue(p.existeNomeEquipes());
    }
    
    @Test
    public void testaCriacaoPartida() {
        ControllerPartida c = ControllerPartida.getInstance();
        c.criarPartida("18:30", "Imbatíveis", "Os incríveis");
        
        Partida p = new Partida("18:30", "Imbatíveis", "Os incríveis");
        
        assertEquals(p.getHorario(), c.getPartida().getHorario());
        assertEquals(p.getEquipeA().getNome(), c.getPartida().getEquipeA().getNome());
        assertEquals(p.getEquipeB().getNome(), c.getPartida().getEquipeB().getNome());
    }   
    
    @Test
    public void testaNaoHaEquipeVencedoraAinda() {
        ControllerPartida c = ControllerPartida.getInstance();
        c.criarPartida("18:30", "Imbatíveis", "Os incríveis");
        Equipe vencedora = null;
        
        for(int i = 0; i < 13; i++) {
            vencedora = c.pontuar("Imbatíveis");
        }
        
        assertEquals(vencedora, null);
    }    
}
