package Exercicio01;

import java.util.List;
import java.util.Scanner;

public class HotelTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite seu telefone: ");
        String telefone = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf, telefone);

        Hotel hotel = new Hotel("ibis", "7283903", "lslsll@gmail.com", List.of(Quartos.SOLTEIRO, Quartos.CASAL));

        System.out.println("Escolha seu Quarto: ");
        hotel.mostrarPrecosQuartos();
        String escolhaDoQuarto = sc.nextLine();

        Reservar reserva1 = new Reservar(cliente, escolhaDoQuarto);
        System.out.println(reserva1.reservarQuartoDoHotel(escolhaDoQuarto));
        reserva1.imprimirReserva(cliente, escolhaDoQuarto);
        sc.close();
    }
}
