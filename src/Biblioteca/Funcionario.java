package Biblioteca;

public class Funcionario extends Usuario {

    enum Setor {
        SETOR_A,
        SETOR_B,
        SETOR_C;
    }

    private Setor setor;

    private Funcionario(String nome, String idade, String email, String senha, Setor setor) {
        super(nome, idade, email, senha);
    }

    public Setor getSetor() {
        return setor;
    }

    @Override
    public Funcionario criarCadastro() {
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

        System.out.println("Setores:");
        System.out.println("1 - Setor A");
        System.out.println("2 - Setor B");
        System.out.println("3 - Setor C");

        System.out.print("Digite qual o setor que você trabalha: ");
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                Setor setor = switch (n) {
                    case 1 -> Setor.SETOR_A;
                    case 2 -> Setor.SETOR_B;
                    case 3 -> Setor.SETOR_C;
                    default -> null;
                };
                if (setor == null) {
                    continue;
                }

                System.out.println("Cadastro criado com sucesso!");
                scanner.next();

                return new Funcionario(nome, idade, email, senha, setor);
            } catch (Exception ignored) {
            }
        }
    }

    @Override
    public void excluirCadastro() {
        super.excluirCadastro();
    }
}
