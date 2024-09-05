package Exercicios.Ex01.ex03;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProdutos(String codigo) {
        try {
        for (Produto produto : produtos) {
            if (produto.codigo.equals(codigo)) {
                produtos.remove(produto);
            }
        }
        } catch (RuntimeException e) {
            System.out.println("Erro ao remover produto: " + e.getMessage());
        }
    }

    public double calcularValorProduto(Produto produto) {
        if (produto.quantidade < 0) {
            return 0;
        } else {
           return produto.precoUnitario * produto.quantidade;
        }
    }

    public double calcularValorNotaFiscal() {
        double valorTotal = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            valorTotal += calcularValorProduto(produtos.get(i));
            System.out.println(produtos.get(i).codigo);
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "NotaFiscal " +
                "produtos= " + produtos +
                '}';
    }
}

