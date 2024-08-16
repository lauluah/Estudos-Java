package Pstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(40_000);
        fim = System.currentTimeMillis();
        System.out.println("Elapsed time stringBuilder: " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += texto;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
