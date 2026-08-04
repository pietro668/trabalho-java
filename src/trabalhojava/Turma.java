package trabalhojava;

public class Turma {

    private String nome;
    private String sala;

    public Turma(String nome, String sala) {
        this.nome = nome;
        this.sala = sala;
    }

    public void adicionarAluno() {
        System.out.println("Aluno adicionado na turma " + nome);
    }
}