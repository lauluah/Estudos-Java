package Exercicio01;

public enum TipoPagamento {
    DEBITO,
    CREDITO,
    DINHEIRO;

    private String cupom = "Ferias20";

    public String getCupom() {
        return cupom;
    }
}
