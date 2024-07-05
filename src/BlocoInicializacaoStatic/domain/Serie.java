package BlocoInicializacaoStatic.domain;

public class Serie {
    private String nome;
    private static int[] episodios;

    // 0 - blocos de inicializaçao static é execultado qnd a JVM carrega a classe
    // 1 - alocado espaço em memoria pro obj
    // 2 - cada atributo de classe é criado e inicializado com valores default ou o valor atribuido
    // 3 - bloco de inicializaçao é execultado
    // 4 - construtor é execultado

    static {
        System.out.println("dentro do bloco de inicializção static");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    {
        System.out.println("dentro do bloco de inicializção");
    }


    public Serie (String nome) { this.nome = nome; }

    public Serie () {
        for(int episodio: Serie.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() { return nome; }

    public int[] getEpisodios() { return episodios; }
}
