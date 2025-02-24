package Biblioteca;

public class Funcionario extends Usuario {

    private Setor setor;

    enum Setor {
        SETOR_A,
        SETOR_B,
        SETOR_C;
    }


    public Funcionario(Sistema sistema) {
        super();

        var scanner = new java.util.Scanner(System.in);

        System.out.println("Setores:");
        System.out.println("1 - Setor A");
        System.out.println("2 - Setor B");
        System.out.println("3 - Setor C");

        System.out.print("Digite qual o setor que você trabalha: ");

        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                this.setor = switch (n) {
                    case 1 -> Setor.SETOR_A;
                    case 2 -> Setor.SETOR_B;
                    case 3 -> Setor.SETOR_C;
                    default -> null;
                };
                if(setor == null) {
                    continue;
                }
                break;
            } catch (Exception ignored) {
            }
        }

        sistema.incrementarFuncionarios();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    public Setor getSetor() {
        return setor;
    }

    @Override
    public String toString() {
        return "{" +
                "setor=" + setor +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
