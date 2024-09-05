package Exercicios.Ex01.ex03;

public class Test01 {
    public static void main(String[] args) {
        Produto feijao = new Produto("9999", 2.50, 2);
        Produto arroz = new Produto("888", 1.50, 2);

        NotaFiscal nota = new NotaFiscal();
        nota.adicionarProduto(feijao);
        nota.adicionarProduto(arroz);
        nota.removerProdutos("9999");
        nota.removerProdutos("888");

        System.out.println(nota.calcularValorNotaFiscal());
    }
}
