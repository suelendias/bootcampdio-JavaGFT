package strategy;

public class Main {

    public static void main(String[] args) {
        Acoes chutar = new ChutarBola();
        Acoes defesa = new Defender();
        Acoes passe = new PassarBola();

        Jogador jogador = new Jogador();
        jogador.setAcoes(chutar);
        jogador.mover();
        jogador.mover();
        jogador.setAcoes(defesa);
        jogador.mover();
        jogador.setAcoes(passe);
        jogador.mover();
        jogador.mover();
        jogador.mover();
    }
}