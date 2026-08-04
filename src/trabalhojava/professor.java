package trabalhojava;

public class professor {

    private String nome;
    private String especialidade;

    public professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void ministrarAula() {
        System.out.println(nome + " está ministrando aula.");
    }
}