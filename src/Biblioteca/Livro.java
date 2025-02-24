package Biblioteca;

public class Livro{

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

    public static Livro criarCadastro(Sistema sistema) {
        System.out.println("\n--------------------------\n");
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
        Genero genero;
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                genero = switch (n) {
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

        Autor autor;
        a:
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                switch (n) {
                    case 1 -> {
                        autor = sistema.autores[sistema.getQtdLivros()].criarCadastro(sistema);
                        break a;
                    }
                    case 2 -> {
                        b:
                        while (true) {
                            if(!sistema.listarAutores()){
                                break b;
                            }
                            System.out.println("Digite o autor que você deseja escolher (0 para sair): ");

                            try {
                                int x = Integer.parseInt(scanner.nextLine());
                                if(x > 0 && x < sistema.getQtdAutores()) {
                                    autor = sistema.autores[x-1];
                                } else if (x == 0) {
                                    break b;
                                }

                            } catch(Exception ignored) {
                            }
                        }
                    }
                }

            } catch (Exception ignored) {
            }
        }
        sistema.incrementarLivros();

        return new Livro(nome, genero, descricao, autor);
    }

    public void excluirCadastro() {
        // TODO
    }

    @Override
    public String toString() {
        return "{" +
                "genero=" + genero +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", autor=" + autor +
                '}';
    }

}
