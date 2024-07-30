package NPolimorfismo.domain.test;

import NPolimorfismo.domain.Computador;
import NPolimorfismo.domain.Produto;
import NPolimorfismo.domain.Tomate;
import NPolimorfismo.domain.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate americano", 10);
        tomate.setDataValidade("10/08/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(produto1);
    }
}
