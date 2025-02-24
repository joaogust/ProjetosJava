package Biblioteca;

public class Sistema {

    private int qtdLivros;
    private int qtdAutores;
    private int qtdAlunos;
    private int qtdFuncionarios;

    Livro[] livros = null;
    Autor[] autores = null;
    Aluno[] alunos = null;
    Funcionario[] funcionarios = null;

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
}
