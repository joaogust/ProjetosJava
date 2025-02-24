package Biblioteca;

public class Usuario {

    protected String nome;
    protected String idade;
    protected String email;
    protected String senha;

    protected Usuario(Sistema sistema) {
        System.out.println("\n--------------------------\n");
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

        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;

        sistema.incrementarUsuarios();
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void excluirCadastro() {
        // TODO excluirCadastro
    }
}
