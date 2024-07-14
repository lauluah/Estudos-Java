package Kenum.domain;

public class Cliente {
    public enum TipoPagamento {
            DEBITO,
            CREDITO;
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nome= " + nome +
                ", tipo cliente: " + tipoCliente.nomeRelatorio +
                ", tipo = " + tipoCliente.VALOR +
                ", tipo pagamento = " + tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
