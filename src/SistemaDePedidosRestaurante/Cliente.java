package SistemaDePedidosRestaurante;

public class Cliente {

    private final String nome_cliente;
    private final int mesa;


    public Cliente(String nome_cliente, int mesa) {
        this.nome_cliente = nome_cliente;
        this.mesa = mesa;
    }

    public static Cliente criarCliente() {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("\nDigite os dados abaixo:\n");

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        int mesa = 0;

        while (true) {
            try {
                while(mesa < 1 || mesa > 10){
                    System.out.print("Mesa (1 à 10): ");
                    mesa = Integer.parseInt(scanner.nextLine());
                    if(mesa < 1 || mesa > 10) System.out.println("Mesa inválida...");
                }
                break;
            } catch (Exception e) {
                System.out.println("Mesa inválida...");
            }
        }
        return new Cliente(nome, mesa);
    }

    public String getNomeCliente() {
        return nome_cliente;
    }

    public int getMesa() {
        return mesa;
    }

}
