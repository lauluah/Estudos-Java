package Metodos.domain;

public class Estudante {
   public String nome;
   public String sobrenome;
   public int idade;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sobrenome);
    }
}
