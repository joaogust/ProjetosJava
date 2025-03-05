package SistemaDePedidosRestaurante;

public class Cliente {

    private final String nome_cliente;
    private final int mesa;


    public Cliente(String nome_cliente, int mesa) {
        this.nome_cliente = nome_cliente;
        this.mesa = mesa;
    }

    public Cliente criarCliente() {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite os dados abaixo:\n");

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        int mesa = 0;

        while (true) {
            System.out.print("Mesa (1 à 10): ");
            try {
                while(mesa < 1 && mesa > 10) mesa = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        return new Cliente(nome, mesa);
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public int getMesa() {
        return mesa;
    }

}
