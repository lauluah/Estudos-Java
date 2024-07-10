package Heranca.dominio.Test;

import Heranca.dominio.Endereco;
import Heranca.dominio.Funcionario;
import Heranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 4");
        endereco.setCep("01929-71");
        Pessoa pessoa = new Pessoa("luisa");
        pessoa.setCpf("9292992929");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-----------");

        Funcionario funcionario = new Funcionario("lucas");
        funcionario.setCpf("92849204");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4500.0);
        funcionario.imprime();

    }
}
