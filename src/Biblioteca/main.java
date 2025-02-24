package Biblioteca;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        boolean loop = true;
        while (loop) {
            loop = login(sistema);
        }

    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int login(Sistema sistema) {
        Scanner scanner = new Scanner(System.in);
        Sistema.menuLogin();

        int a1 = lerNum();

        switch (a1) {
            case 1 -> {
                System.out.println("\n1 - Funcionário");
                System.out.println("2 - Aluno");
                System.out.print("\nDigite o tipo de cadastro desejado: ");

                int a2 = lerNum();
                switch (a2) {
                    case 1 -> {
                        sistema.funcionarios[sistema.getQtdFuncionarios()] = new Funcionario(sistema);
                        limparTela();
                        return entrar(sistema);
                    }
                }
            }
            case 2 -> {
                return entrar(sistema);
            }
        }
    }

    public static int lerNum() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int h = Integer.parseInt(scanner.nextLine());
                return h;
            } catch (Exception ignored) {
            }
        }
    }

    public static int entrar(Sistema sistema) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados abaixo:");
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        for(int i = 0; i < sistema.getQtdUsuarios(); i++) {
            if(sistema.funcionarios[i].senha.equals(senha) && sistema.funcionarios[i].email.equals(email)) {
                System.out.printf("Cadastro '%s' encontrado!\n", sistema.funcionarios[i].getNome());
                System.out.println("Pressione Enter para continuar...");
                
                return i;
            }
        }
        return -1;
    }

    public static void interfaceAluno(){

    }

    public static void interfaceFuncionario() {

    }

}
