package ExercicioClassHeranca.domain;

public class Projeto {
    private String nome;
    private String dataInicio;
    private String dataFim;
    private Gerente gerente;
    private Cliente cliente;
    private Membros[] membros;

    public Projeto(String nome, String dataInicio, String dataFim, Gerente gerente, Membros[] membros) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.gerente = gerente;
        this.membros = membros;
    }

    public Projeto(String nome, String dataInicio, String dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Projeto(String nome, String dataInicio, String dataFim, Gerente gerente, Cliente cliente, Membros[] membros) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.gerente = gerente;
        this.cliente = cliente;
        this.membros = membros;
    }

    public void imprime() {
        System.out.println("Projeto: " + this.nome);
        System.out.println("Data de Início: " + this.dataInicio);
        System.out.println("Data de Fim: " + this.dataFim);
        System.out.println("cliente " + this.cliente.getNome() + ",  " + "empresa: " + this.cliente.getEmpresa());
        System.out.println("----- membros do proj ----");
        for (Membros membros : this.membros) {
            membros.imprime();
        }
        System.out.println("gerente: " + this.gerente.getNome() + ", " + "departamento: " + this.gerente.getDepartamento());
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
