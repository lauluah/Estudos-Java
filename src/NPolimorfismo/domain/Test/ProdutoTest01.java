package NPolimorfismo.domain.Test;

import NPolimorfismo.domain.Computador;
import NPolimorfismo.domain.Televisao;
import NPolimorfismo.domain.Tomate;
import NPolimorfismo.domain.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Sansung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
