package NPolimorfismo.domain.Test;

import NPolimorfismo.domain.Computador;
import NPolimorfismo.domain.Tomate;
import NPolimorfismo.domain.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
