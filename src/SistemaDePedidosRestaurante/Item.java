package SistemaDePedidosRestaurante;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Item {

    public enum Categoria {
        SUCO(9, "Suco"),
        REFRIGERANTE(6, "Refigerante"),
        AGUA(2, "Água"),
        ARROZ(8, "Arroz"),
        CARNE(10, "Carne"),
        FEIJAO(7, "Feijão"),
        SORVETE(13, "Sorvete"),
        ACAI(15, "Açaí");
        private int Valor;
        private String Nome;

        Categoria(int valor, String nome) {
            Valor = valor;
            Nome = nome;
        }

        public int getValor() {
            return Valor;
        }

        public String getNome() {
            return Nome;
        }
    }

    public Categoria categoria;

    public Item(Categoria categoria) {
        this.categoria = categoria;
    }

    private Item() {
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public static Item criarItem() {
        Scanner scanner = new Scanner(System.in);

        Locale locale = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        while (true) {
            try {
                System.out.print("Digite o número do item: ");
                int num = Integer.parseInt(scanner.nextLine());

                if (num >= 1 && num <= 8) {
                    Categoria categoria = Categoria.values()[num-1];
                    String formatted = nf.format(categoria.Valor);
                    System.out.printf("Item '%s' no valor de '%s' adicionado com sucesso!\n\n", categoria.getNome(), formatted);
                    return new Item(categoria);
                }
            } catch (Exception e) {
            }
        }
    }

    public static void cardapio() {
        Locale locale = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatted;
        System.out.println("\n-------------------------------\n");

        System.out.println("Cardápio:");

        System.out.println("BEBIDAS >>\n");

        formatted = nf.format(Categoria.SUCO.Valor);
        System.out.printf("1 - %-13s\t%s\n", Categoria.SUCO.Nome, formatted);

        formatted = nf.format(Categoria.REFRIGERANTE.Valor);
        System.out.printf("2 - %-13s\t%s\n", Categoria.REFRIGERANTE.Nome, formatted);

        formatted = nf.format(Categoria.AGUA.Valor);
        System.out.printf("3 - %-13s\t%s\n", Categoria.AGUA.Nome, formatted);

        System.out.println("\nCOMIDAS >>\n");

        formatted = nf.format(Categoria.ARROZ.Valor);
        System.out.printf("4 - %-13s\t%s\n", Categoria.ARROZ.Nome, formatted);

        formatted = nf.format(Categoria.CARNE.Valor);
        System.out.printf("5 - %-13s\t%s\n", Categoria.CARNE.Nome, formatted);

        formatted = nf.format(Categoria.FEIJAO.Valor);
        System.out.printf("6 - %-13s\t%s\n", Categoria.FEIJAO.Nome, formatted);

        System.out.println("\nSOBREMESAS >>\n");

        formatted = nf.format(Categoria.SORVETE.Valor);
        System.out.printf("7 - %-13s\t%s\n", Categoria.SORVETE.Nome, formatted);

        formatted = nf.format(Categoria.ACAI.Valor);
        System.out.printf("8 - %-13s\t%s\n", Categoria.ACAI.Nome, formatted);

        System.out.println("\n-------------------------------\n");
    }

    public String getItem() {
        Locale locale = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatted = nf.format(categoria.getValor());
        return String.format("%-13s %s", categoria.getNome(), formatted);
    }
}
