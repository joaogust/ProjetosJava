package Biblioteca;

public class Livro implements Cadastro{

    private Genero genero;

    enum Genero {
        BIOGRAFIA,
        EPICO,
        POEMA;
    }

    private String nome;
    private String descricao;
    private Autor autor;

    public Livro(String nome, Genero genero, String descricao, Autor autor) {
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
        this.autor = autor;

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("\nPressione Enter para continuar...");

        var scanner = new java.util.Scanner(System.in);
        scanner.next();
    }

    @Override
    public Cadastro criarCadastro(Sistema sistema) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite os dados à seguir: ");

        System.out.print("Nome do livro: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Generos:");
        System.out.println("\t1 -  Biografia");
        System.out.println("\t2 -  Épico");
        System.out.println("\t3 -  Poema");

        System.out.print("Digite qual o gênero do livro: ");
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                Genero genero = switch (n) {
                    case 1 -> Genero.BIOGRAFIA;
                    case 2 -> Genero.EPICO;
                    case 3 -> Genero.POEMA;
                    default -> null;
                };
                if (genero == null) {
                    continue;
                }

                break;
            } catch (Exception ignored) {
            }
        }

        System.out.println("Autor:");
        System.out.println("\t1 -  Novo autor");
        System.out.println("\t2 -  Lista de autores");

        System.out.print("Digite a opção desejada: ");

//        while (true) { TODO
//            try {
//                int n = Integer.parseInt(scanner.nextLine());
//                switch (n) {
//                    case 1 -> ;
//                    case 2 -> ;
//                    default -> continue;
//                };
//
//                sistema.incrementarLivros();
//
//                return new Livro(nome, genero, descricao, autor);
//            } catch (Exception ignored) {
//            }
//        }

    }

    @Override
    public void excluirCadastro() {
        // TODO
    }
}
