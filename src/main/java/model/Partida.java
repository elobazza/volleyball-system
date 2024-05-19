package model;

/**
 * @author Eloísa Bazzanella
 * @since  maio, 2022
 */
public class Partida {
    
    private String horario;
    private Equipe equipeA;
    private Equipe equipeB;
    
    private int sets;
    private int jogadas;

    public Partida(String horario, String nomeEquipeA, String nomeEquipeB) {
        this.horario = horario;
        this.equipeA = new Equipe(nomeEquipeA);
        this.equipeB = new Equipe(nomeEquipeB);
        
        this.sets = 0;
        this.jogadas = 0;
    }
       
    public String getHorario() {
        return horario;
    }

    public Equipe getEquipeA() {
        return equipeA;
    }

    public Equipe getEquipeB() {
        return equipeB;
    }

    public int getSets() {
        return sets;
    }

    public int getJogadas() {
        return jogadas;
    }
    
    public void addSet() {
        this.sets++;
        this.resetJogada();
    }

    public void addJogada() {
        this.jogadas++;
    }
    
    public void resetJogada() {
        this.getEquipeA().resetPontos();
        this.getEquipeB().resetPontos();
        this.jogadas = 0;
    }
    
    public void pontuar(String nomeEquipePontuada) {
        
        if(nomeEquipePontuada.equalsIgnoreCase(equipeA.getNome())) {
            this.equipeA.addPontuacao();
        } else {
            this.equipeB.addPontuacao();
        }
        
        this.addJogada();
    }
    
    public void pontuarSet(Equipe vencedorSet) {
        if(vencedorSet.getNome().equalsIgnoreCase(equipeA.getNome())) {
            this.equipeA.addSetGanho();
        } else {
            this.equipeB.addSetGanho();
        }
        this.addSet();
    }
    
    public Equipe vencedorSet() {
        if(this.equipeA.getPontuacao() >= 25 && this.equipeA.getPontuacao() - this.equipeB.getPontuacao() > 1 ) {
            return this.equipeA;
        }
        if(this.equipeB.getPontuacao() >= 25 && this.equipeB.getPontuacao() - this.equipeA.getPontuacao() > 1 ) {
            return this.equipeB;
        }
        return null;
    }
    
    public Equipe vencedorQuintoSet() {
        if(this.equipeA.getPontuacao() >= 15 && this.equipeA.getPontuacao() - this.equipeB.getPontuacao() > 1 ) {
            return this.equipeA;
        }
        if(this.equipeB.getPontuacao() >= 15 && this.equipeB.getPontuacao() - this.equipeA.getPontuacao() > 1 ) {
            return this.equipeB;
        }
        return null;
    }
    
    public Equipe vencedorPartida() {
        if(this.equipeA.getSetsGanhos() >= 3 && this.equipeA.getSetsGanhos() - this.equipeB.getSetsGanhos() > 1 ) {
            return this.equipeA;
        }
        if(this.equipeB.getSetsGanhos() >= 3 && this.equipeB.getSetsGanhos()- this.equipeA.getSetsGanhos() > 1 ) {
            return this.equipeB;
        }
        return null;
    }
    
    public boolean qtdSetsValida() {
        if(this.sets >= 0) {
            return true;
        }
        return false;
    }
    
    public boolean qtdJogadasValida() {
        if(this.jogadas >= 0) {
            return true;
        }
        return false;
    }
    
    public boolean existeNomeEquipes() {
        if(this.getEquipeA().getNome().equals("") || this.getEquipeB().getNome().equals("")) {
            return false;
        }
        return true;
    }
}
