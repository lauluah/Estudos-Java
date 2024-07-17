package ExercicioClassHeranca.domain.test;

import ExercicioClassHeranca.domain.Cliente;
import ExercicioClassHeranca.domain.Gerente;
import ExercicioClassHeranca.domain.Membros;
import ExercicioClassHeranca.domain.Projeto;

public class TestCliente {
    public static void main(String[] args) {
        Membros membro1 = new Membros("desenvolvedor", "joao");
        Membros membro2 = new Membros("analista", "maria");
        Membros[] membros = {membro1, membro2};
        Gerente gerente = new Gerente("Carlos", "TI");
        Cliente cliente = new Cliente("antonio", "Acm corp");
        Projeto projeto1 = new Projeto("sistemas de venda", "01/08/2024", "31/12/2024", gerente, cliente, membros);

        projeto1.imprime();
    }
}
