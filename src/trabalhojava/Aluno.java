package trabalhojava;

public class Aluno {

    private String nome;
    private int idade;
    private String numeroMatricula;

    public Aluno(String nome, int idade, String numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.numeroMatricula = numeroMatricula;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
}