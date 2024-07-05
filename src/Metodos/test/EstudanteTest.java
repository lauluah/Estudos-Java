package Metodos.test;

import Metodos.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "laura";
        estudante01.idade = 20;
        estudante01.sobrenome = "gouveia";

        estudante02.nome = "luisa";
        estudante02.idade = 16;
        estudante02.sobrenome = "pereira";

        estudante01.imprime();
        estudante02.imprime();
    }
}
