package ExercicioClassHeranca.domain;

import java.util.Arrays;

public class Gerente {
    private String nome;
    private String departamento;
    private Projeto[] projetos;

    public Gerente(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public Gerente(String nome, String departamento, Projeto[] projetos) {
        this.nome = nome;
        this.departamento = departamento;
        this.projetos = projetos;
    }

    public void imprime() {
        System.out.println("nome " + this.nome);
        System.out.println("departamento " + this.departamento);
        if ( this.projetos != null && this.projetos.length > 0 ) {
            System.out.println("--- Gerente do projeto ---");

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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Projeto[] getProjetos() {
        return projetos;
    }

    public void setProjetos(Projeto[] projetos) {
        this.projetos = projetos;
    }
}
