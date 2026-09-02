package trabalhojava;

public class Aluno {                            //cria uma class chamada aluno//
 
    private String nome;
    private int idade;                        // cria atributos para as pessoas//
    private String numeroMatricula;

    public Aluno(String nome, int idade, String numeroMatricula) {
        this.nome = nome;                                           // o construtor so executa quando criamos um novo objeto chamado aluno//
        this.idade = idade;
        this.numeroMatricula = numeroMatricula;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");               // cria uma ação pra pessoa//
    }
}
