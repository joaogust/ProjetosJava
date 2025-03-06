package SistemaDePedidosRestaurante;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Pedido {

    private static int qtdPedidos;

    private final Cliente cliente;
    private final Item[] itens = new Item[10];
    private int valorTotal;
    private int qtdItem;

    public Pedido() {
        Scanner scanner = new Scanner(System.in);

        // Instanciando Cliente
        this.cliente = Cliente.criarCliente();

        // Instanciando itens
        a:
        for(int i = 0; i < 10; i++) {
            Item.cardapio();

            itens[i] = Item.criarItem();
            this.valorTotal += itens[i].categoria.getValor();
            this.qtdItem++;

            int n;
            while (qtdItem < 9) {
                try {
                    System.out.print("Deseja adicionar mais algum item (sim[1] - não[2]): ");
                    n = Integer.parseInt(scanner.nextLine());
                    switch (n) {
                        case 1 -> {
                            continue a;
                        }
                        case 2 -> {
                            break a;
                        }
                    }
                } catch (NumberFormatException ignore) {
                }
            }
        }
        System.out.println("\nPedido finalizado com sucesso!\n");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
        qtdPedidos++;
    }

    public static void listarPedidos(Pedido[] p) {

        Scanner scanner = new Scanner(System.in);

        Locale locale = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        if(qtdPedidos == 0) {
            System.out.println("Não há pedidos no sistema.");
            System.out.println("Pressione Enter para continuar...");
            scanner.next();
            return;
        }

        System.out.print("---------- Pedidos ----------");
        for(int i = 0; i < qtdPedidos; i++) {
            if(i>0) System.out.println("\n-- -- -- -- -- -- -- -- -- --");
            System.out.format("\nPedido %d: \n", i+1);
            System.out.println("Nome: " + p[i].cliente.getNomeCliente());
            System.out.println("Mesa: " + p[i].cliente.getMesa());
            for(int j = 0; j < p[i].qtdItem; j++) {
                System.out.format("\t%d - %s\n", j+1, p[i].itens[j].getItem());
            }

            String formatted = nf.format(p[i].valorTotal);
            System.out.println("\tTotal: "+ formatted);
        }
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", itens=" + Arrays.toString(itens) +
                ", valorTotal=" + valorTotal +
                ", qtdItem=" + qtdItem +
                '}';
    }

    public static int getQtdPedidos() {
        return qtdPedidos;
    }
}
