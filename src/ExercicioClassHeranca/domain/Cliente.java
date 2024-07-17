package ExercicioClassHeranca.domain;

import java.util.Arrays;

public class Cliente {
     private String nome;
     private String empresa;
     private Projeto[] projetos;

    public Cliente(String nome, String empresa) {
        this.nome = nome;
        this.empresa = empresa;
    }

    public Cliente(String nome, Projeto[] projetos) {
        this.nome = nome;
        this.projetos = projetos;
    }

    public Cliente(String nome, String empresa, Projeto[] projetos) {
        this.nome = nome;
        this.empresa = empresa;
        this.projetos = projetos;
    }

    public void imprime() {
        System.out.println("nome: " + this.nome);
        if (this.empresa != null) {
            System.out.println("empresa: " + this.empresa);
        };
        if ( this.projetos != null && this.projetos.length > 0 ) {
            System.out.println("--- Projeto de interesse ---");
            for (Projeto projetos : this.projetos) {
                projetos.imprime();
            }
        };
        System.out.println("-----------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Projeto[] getProjetos() {
        return projetos;
    }

    public void setProjetos(Projeto[] projetos) {
        this.projetos = projetos;
    }
}
