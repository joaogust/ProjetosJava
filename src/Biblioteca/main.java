package Biblioteca;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        login(sistema);

    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void login(Sistema sistema) {
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
                        sistema.funcionarios[sistema.getQtdFuncionarios()] = Funcionario.criarCadastro(sistema);
                        limparTela();
                    }
                }
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

    public static void interfaceAluno(){

    }

    public static void interfaceFuncionario() {

    }
}
