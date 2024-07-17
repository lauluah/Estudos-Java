package ExercicioClassHeranca.domain;

import java.util.Arrays;

public class Membros {
    private String nome;
    private String cargo;
    private Projeto[] projetos;

    public Membros(String cargo, String nome) {
        this.cargo = cargo;
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("nome: " + this.nome);
        System.out.println("cargo: " + this.cargo);
        if ( this.projetos != null && this.projetos.length > 0 ) {
            System.out.println("--- Membro do projeto ---");

            for (Projeto projetos : this.projetos) {
                projetos.imprime();
            }
        };

    }

    public Membros(String nome, String cargo, Projeto[] projetos) {
        this.nome = nome;
        this.cargo = cargo;
        this.projetos = projetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Projeto[] getProjetos() {
        return projetos;
    }

    public void setProjetos(Projeto[] projetos) {
        this.projetos = projetos;
    }
}
