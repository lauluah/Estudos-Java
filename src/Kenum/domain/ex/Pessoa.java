package Kenum.domain.ex;

public class Pessoa {
    public static void main(String[] args) {
        FaixaEtaria idade = FaixaEtaria.CRIANCA;

        String aviso = idadeDaPessoa(idade);
        System.out.println(aviso);
    }

    // Método que usa switch com enum para determinar a idade da pessoa
    public static String idadeDaPessoa(FaixaEtaria idades) {
        switch (idades) {
            case CRIANCA:
                return idades + " pode usar os brinquedos";
            case ADULTO:
                return idades + " pode usar apenas o salão de jogos";
            case IDOSO:
                return idades + " pode usar o salão de graça";
            default:
                return "erro";
        }
    }
}
