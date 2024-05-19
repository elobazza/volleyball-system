package controller;

import model.Equipe;
import model.Partida;

/**
 * @author Eloísa Bazzanella
 * @since  maio, 2022
 */
public class ControllerPartida {
    
    private Partida partida;
    private static ControllerPartida instance = null;
    
    public ControllerPartida() {}
    
    public static ControllerPartida getInstance() {
        if(instance == null) {
            instance = new ControllerPartida();
        }
        return instance;
    }
    
    public void criarPartida(String horario, String nomeEquipeA, String nomeEquipeB) {
        this.partida = new Partida(horario, nomeEquipeA, nomeEquipeB);
    }
    
    public Equipe pontuar(String nomeEquipePontuada) {
        this.partida.pontuar(nomeEquipePontuada);
        
        if(this.partida.getSets() == 4) {
            if(this.partida.vencedorQuintoSet() != null) {
                this.partida.pontuarSet(this.partida.vencedorSet());
            }
        } else {
            if(this.partida.vencedorSet() != null) {
                this.partida.pontuarSet(this.partida.vencedorSet());
            }
        }
        
        if(this.partida.vencedorPartida() != null) {
            Equipe vencedora = this.partida.vencedorPartida();
            return vencedora;
        }
        return null;
    }    
    
    public Partida getPartida() {
        return this.partida;
    }
}
