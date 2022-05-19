package strategy;

public class Jogador {

    private Acoes acoes;

    public void setAcoes(Acoes acoes) {
        this.acoes = acoes;
    }

    public void mover() {
        acoes.mover();
    }

}
