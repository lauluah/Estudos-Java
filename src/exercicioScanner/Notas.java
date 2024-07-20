package exercicioScanner;

public class Notas {

    public double mediaAlunos( double primeiraNota,  double segundaNota, double terceiraNota) {
        Double media = (primeiraNota + segundaNota + terceiraNota)/3;

        if(media < 6) {
            System.out.println("O aluno foi reprovado");
        }

        return media;
    }

}
