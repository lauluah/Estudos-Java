package LClassesAbstratas.domain.test;
import LClassesAbstratas.domain.Desenvolvedor;
import LClassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("maria", 1900);
        Desenvolvedor dev = new Desenvolvedor("laura", 6000);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
