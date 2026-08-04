package trabalhojava;

public class Boletim {

    private double media;

    public Boletim(double media) {
        this.media = media;
    }

    public void emitirBoletim() {
        System.out.println("Média do aluno: " + media);
    }
}