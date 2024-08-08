package runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        abreConexao();

    }

    private static String abreConexao() {
        try {
            System.out.println("abrindo arquivos");
            System.out.println("escrevendo  dados no arq");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos liberados SO");
        }
        return null;
    }
}
