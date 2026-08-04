package trabalhojava;

public class Escola {

    private String nome;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void cadastrarAluno() {
        System.out.println("Aluno cadastrado na escola " + nome);
    }
}
