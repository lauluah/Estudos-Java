package JmodificadorFinal.domain.test;

import JmodificadorFinal.domain.Carro;
import JmodificadorFinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("kaio");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("enzo");
        ferrari.imprime();

    }
}
