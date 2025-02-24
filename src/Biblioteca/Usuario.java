package Biblioteca;

public class Usuario implements Cadastro {

    protected String nome;
    protected String idade;
    protected String email;
    protected String senha;

    protected Usuario(String nome, String idade, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
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



    @Override
    public Usuario criarCadastro() {
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

        return new Usuario(nome, idade, email, senha);
    }

    @Override
    public void excluirCadastro() {
        // TODO excluirCadastro
    }
}
