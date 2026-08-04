package trabalhojava;

public class Disciplina {

    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void registrarNota() {
        System.out.println("Nota registrada na disciplina " + nome);
    }
}