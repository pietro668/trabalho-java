package trabalhojava;

public class Matricula {

    private String numero;

    public Matricula(String numero) {
        this.numero = numero;
    }

    public void matricularAluno() {
        System.out.println("Matrícula " + numero + " realizada.");
    }

}
