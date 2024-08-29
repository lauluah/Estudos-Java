package Exercicio01;

import java.util.Random;

public class Reservar {
    private String cliente;
    private String quarto;
    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODIGO_LENGTH = 5;


    public Reservar(Cliente cliente, String quarto) {
        this.cliente = String.valueOf(cliente);
        this.quarto = quarto;
    }

    public String reservarQuartoDoHotel(String numeroQuarto) {
        Pagamento pagamento = null;

        try {
            Quartos quartoEscolhido;

            if (numeroQuarto.equals("1")) {
                quartoEscolhido = Quartos.CASAL;
            } else if (numeroQuarto.equals("2")) {
                quartoEscolhido = Quartos.SOLTEIRO;
            } else {
                return "Número do quarto inválido!";
            }
            pagamento = new Pagamento(quartoEscolhido);

        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao processar a reserva.";
        }
        return "Reserva confirmada! Valor da compra: R$" + pagamento.getValorCompra();
    }

    public String gerarCodigo() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder(CODIGO_LENGTH);

        for (int i = 0; i < CODIGO_LENGTH; i++) {
            int index = random.nextInt(CHAR_SET.length());
            codigo.append(CHAR_SET.charAt(index));
        }

        return codigo.toString();
    }

    public void imprimirReserva(Cliente cliente, String quarto) {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Telefone: " + cliente.getTelefone());
         if (quarto == "1") {
            System.out.println("Quarto de casal");
        } else {
            System.out.println("Quarto de solteiro");
        }
        System.out.println("Codigo da reserva: " + gerarCodigo());
    }

    public String getCliente() {
        return cliente;
    }
}