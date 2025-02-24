package Biblioteca;

public class Autor {

    private int qtd_livros = 1;
    private String nome;
    private String nacionalidade;

    private Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("\nPressione Enter para continuar...");

        var scanner = new java.util.Scanner(System.in);
        scanner.next();
    }

    private void incrementaQtdLivros() {
        qtd_livros++;
    }

    public static Autor criarCadastro(Sistema sistema) {
        System.out.println("\n--------------------------\n");

        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite os dados à seguir: ");

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();

        sistema.incrementarAutores();

        return new Autor(nome, nacionalidade);
    }

    public void excluirCadastro() {
        // TODO
    }

    @Override
    public String toString() {
        return "{" +
                "qtd_livros=" + qtd_livros +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
