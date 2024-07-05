package Associacao.test;

import Associacao.domain.Jogador;
import Associacao.domain.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();

        jogador2.setTime(time);
        jogador2.imprime();

    }
}
