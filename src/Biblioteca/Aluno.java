package Biblioteca;

public class Aluno extends Usuario{

    private static int qtdAlunos;

    private Turmas turma;

    enum Turmas {
        PRIMEIRO_ANO,
        SEGUNDO_ANO,
        TERCEIRO_ANO;
    }

    public Aluno(String nome, String idade, String email, String senha, Turmas turma) {
        super(nome, idade, email, senha);
        this.turma = turma;

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("\nPressione Enter para continuar...");

        var scanner = new java.util.Scanner(System.in);
        scanner.next();
    }

    public Turmas getTurma() {
        return turma;
    }

    public static int getQtdAlunos() {
        return qtdAlunos;
    }

    @Override
    public Aluno criarCadastro(Sistema sistema) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite os dados à seguir: ");

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        String idade = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("senha: ");
        String senha = scanner.nextLine();

        System.out.println("Turmas (Ensino médio):");
        System.out.println("1 - Primeiro Ano");
        System.out.println("2 - Segundo Ano");
        System.out.println("3 - Teceiro Ano");

        System.out.print("Digite qual a sua turma: ");
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                Turmas turma = switch (n) {
                    case 1 -> Turmas.PRIMEIRO_ANO;
                    case 2 -> Turmas.SEGUNDO_ANO;
                    case 3 -> Turmas.TERCEIRO_ANO;
                    default -> null;
                };
                if(turma == null) {
                    continue;
                }

                sistema.incrementarAlunos();

                return new Aluno(nome, idade, email, senha, turma);
            } catch (Exception ignored) {
            }
        }

    }
}
