package Associacao.test;

import Associacao.domain.Jogador;
import Associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("------ jogador -----");
        jogador1.imprime();
        System.out.println("------ Time -----");
        time.imprime();
    }
}
