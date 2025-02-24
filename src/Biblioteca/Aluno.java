package Biblioteca;

public class Aluno extends Usuario{

    private static int qtdAlunos;

    private Turmas turma;

    enum Turmas {
        PRIMEIRO_ANO,
        SEGUNDO_ANO,
        TERCEIRO_ANO;
    }

    public Aluno(Sistema sistema) {
        super();

        var scanner = new java.util.Scanner(System.in);

        System.out.println("Turmas (Ensino médio):");
        System.out.println("1 - Primeiro Ano");
        System.out.println("2 - Segundo Ano");
        System.out.println("3 - Teceiro Ano");

        System.out.print("Digite qual a sua turma: ");

        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                this.turma = switch (n) {
                    case 1 -> Turmas.PRIMEIRO_ANO;
                    case 2 -> Turmas.SEGUNDO_ANO;
                    case 3 -> Turmas.TERCEIRO_ANO;
                    default -> null;
                };
                if(turma == null) {
                    continue;
                }
                break;
            } catch (Exception ignored) {
            }
        }

        sistema.incrementarAlunos();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("\nPressione Enter para continuar...");

        scanner.next();
    }

    public Turmas getTurma() {
        return turma;
    }

    public static int getQtdAlunos() {
        return qtdAlunos;
    }

    @Override
    public String toString() {
        return "{" +
                "turma=" + turma +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
