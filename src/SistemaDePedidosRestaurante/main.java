package SistemaDePedidosRestaurante;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pedido[] p1 = new Pedido[50];

        while(true) {
            menu();
            int g = Integer.parseInt(scanner.nextLine());

            switch (g) {
                case 1 -> p1[Pedido.getQtdPedidos()] = Pedido.criarPedido();
                case 2 -> {
                    if(Pedido.getQtdPedidos() == 0) {
                        System.out.println("Não há pedidos no sistema.");
                        System.out.println("Pressione Enter para continuar...");
                        scanner.next();
                        continue;
                    }
                    System.out.println("Pedidos");
                    for(int i = 0; i < Pedido.getQtdPedidos(); i++) {
                        System.out.format("Pedido %d: ", i+1);
                        System.out.println(p1[Pedido.getQtdPedidos()-1]);
                    }

                    System.out.println("Pressione Enter para continuar...");
                    scanner.next();
                }
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
