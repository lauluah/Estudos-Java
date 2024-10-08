package Kenum.domain.test;

import Kenum.domain.Cliente;
import Kenum.domain.TipoCliente;
import Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Andreia", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Luisa", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Ana", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Analia", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(10));
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorValor(2);
        System.out.println("o resultado é " + tipoCliente2);
    }
}
