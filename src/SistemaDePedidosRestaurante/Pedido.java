package SistemaDePedidosRestaurante;

import java.util.Arrays;

public class Pedido {

    private static int qtdPedidos;

    private final Cliente cliente;
    private final Item[] itens;
    private int valorTotal;
    private int qtdItem;

    public Pedido(Cliente cliente, Item[] item, int valorTotal, int qtdItem) {
        this.cliente = cliente;
        this.itens = item;
        this.valorTotal = valorTotal;
        this.qtdItem = qtdItem;
        qtdPedidos++;
    }

    public static Pedido criarPedido() {
        Cliente cliente = Cliente.criarCliente();
        var scanner = new java.util.Scanner(System.in);

        Item[] item = new Item[10];
        int valorTotal = 0;

        int i = 0, n = 0;

        a:
        do {
            System.out.println("Qual item você deseja adicionar no pedido: ");
            Item.cardapio();


            while(true) {
                try {
                    System.out.print("Digite o número do item: ");
                    int num = Integer.parseInt(scanner.nextLine());

                    if(num >= 1 && num <= 8) {
                        item[i].categoria = switch (num) {
                            case 1 -> Item.Categoria.SUCO;
                            case 2 -> Item.Categoria.REFRIGERANTE;
                            case 3 -> Item.Categoria.AGUA;
                            case 4 -> Item.Categoria.ARROZ;
                            case 5 -> Item.Categoria.CARNE;
                            case 6 -> Item.Categoria.FEIJAO;
                            case 7 -> Item.Categoria.SORVETE;
                            case 8 -> Item.Categoria.ACAI;
                            default -> {
                                yield null;
                            }
                        };
                        System.out.printf("Item '%s' adicionado com sucesso!", item[i].categoria.getNome());
                        valorTotal += item[i].categoria.getValor();
                    } else {
                        continue;
                    }

                } catch(Exception e) {
                }

                while(true) {
                    System.out.print("Deseja adicionar mais algum item (sim[1] - não[2]): ");
                    n = Integer.parseInt(scanner.nextLine());

                    if(n == 1) {
                        continue a;
                    } else if(n == 2){
                        break a;
                    }
                }
            }
        } while(i<10 && n != 2);
        System.out.println("Pedido finalizado com sucesso!");

        return new Pedido(cliente, item, valorTotal, i);
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
