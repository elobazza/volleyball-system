package model;

/**
 * @author Eloísa Bazzanella
 * @since  maio, 2022
 */
public class Equipe {
    
    private String nome;
    private int setsGanhos;
    private int pontuacao;

    public Equipe(String nome) {
        this.nome = nome;
        this.setsGanhos = 0;
        this.pontuacao = 0;
    }
    
    public void addPontuacao() {
        this.pontuacao++;
    }
    
    public void addSetGanho() {
        this.setsGanhos++;
    }
    
    public void resetPontos() {
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getSetsGanhos() {
        return setsGanhos;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
