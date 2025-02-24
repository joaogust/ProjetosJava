package Biblioteca;

import java.util.Scanner;

public class Sistema {

    private int qtdLivros;
    private int qtdAutores;
    private int qtdAlunos;
    private int qtdFuncionarios;
    private int qtdUsuarios;

    Livro[] livros = new Livro[10000];
    Autor[] autores = new Autor[10000];
    Aluno[] alunos = new Aluno[10000];
    Funcionario[] funcionarios = new Funcionario[10000];

    public int getQtdUsuarios() {
        return qtdUsuarios;
    }

    public void incrementarUsuarios() {
        qtdUsuarios++;
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void incrementarLivros() {
        qtdLivros++;
    }

    public int getQtdAutores() {
        return qtdAutores;
    }

    public void incrementarAutores() {
        qtdAutores++;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void incrementarAlunos() {
        qtdAlunos++;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void incrementarFuncionarios() {
        qtdFuncionarios++;
    }

    public static void menuLogin() {
        System.out.println("1 - Criar cadastro");
        System.out.println("2 - Entrar");
        System.out.print("\nDigite a opção desejada: ");
    }

    public boolean listarAutores() {
        if(qtdAutores == 0) {
            System.out.println("Nenhum autor criado");
            var scanner = new Scanner(System.in);
            scanner.next();
            return false;
        }
        for (int i = 0; i< qtdAutores; i++) {
            System.out.println("Autores: ");
            System.out.printf("%d - %15s \n", i+1, autores[i]);
        }
        return true;
    }

}
