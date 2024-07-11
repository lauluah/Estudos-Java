package Heranca.domain;

// 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe supenclasse
// 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe fiLha
// 2 - Alocado espaco em memória pro objeto da supenclasse
// 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
// 4 - Bloco de inicialização da superclasse é executado na ondem em que aparece
// 5 - Construton é executado da superclasse
// 6 - Alocado espaca em memónia pro objeto da subclasse
// 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
// 8 - Bloco de inicialização da subclasse é executado na orden em que aparece
// 9 - Construtor é executado da subclasse

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
