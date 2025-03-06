package SistemaDePedidosRestaurante;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pedido[] p = new Pedido[50];

        while(true) {
            menu();
            int g;
            try {
                g = Integer.parseInt(scanner.nextLine());
            } catch(RuntimeException e) {
                System.out.println("Ops, tente novamente...\n");
                continue;
            }

            switch (g) {
                case 1 -> p[Pedido.getQtdPedidos()] = new Pedido();
                case 2 -> Pedido.listarPedidos(p);
                case 3 -> {
                    return;
                }
                default -> System.out.println("Tente novamente...");
            }

        }

    }

    static void menu() {
        System.out.println("\n------- Menu -------");
        System.out.println("1 - Adicionar pedido.");
        System.out.println("2 - Listar pedidos");
        System.out.println("3 - Sair");
        System.out.print("\nDigite: ");
    }
}
