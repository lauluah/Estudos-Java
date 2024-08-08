package runtime.test;

import java.io.FileInputStream;
import java.io.IOException;

public class RunTimeExceptionTest2 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo.");
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
