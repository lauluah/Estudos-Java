package Associacao.domain;

public class Time {
    private String name;
    private Jogador[] jogadores;

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] jgadores) {
        this.name = name;
        this.jogadores = jgadores;
    }

    public void imprime() {
        System.out.println(this.name);
        if(jogadores == null) return;
         for (Jogador jogador : jogadores) {
             System.out.println(jogador.getName());
         }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
