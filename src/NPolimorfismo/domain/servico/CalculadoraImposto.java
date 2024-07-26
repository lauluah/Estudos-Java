package NPolimorfismo.domain.servico;

import NPolimorfismo.domain.Computador;
import NPolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto " + imposto);
    }
}
