package exercicioScanner;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a primeira nota: ");
        Double primeiraNota = scanner.nextDouble();
        System.out.println("digite a segunda nota: ");
        Double segundaNota = scanner.nextDouble();
        System.out.println("digite a terceira nota: ");
        Double terceiraNota = scanner.nextDouble();

         Notas notas = new Notas();

         double mediaAlunos = notas.mediaAlunos(primeiraNota, segundaNota, terceiraNota);

        System.out.println("A média do aluno é: " + mediaAlunos);

        scanner.close();

    }

}
