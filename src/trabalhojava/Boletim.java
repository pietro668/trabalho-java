package trabalhojava;

public class Boletim {

    private double media;          //cria variavel (media)//

    public Boletim(double media) {    //cria contrutor da classe boletim//
        this.media = media;       //guarda a media//
    }

    public void emitirBoletim() {                        // Cria um método//
        System.out.println("Média do aluno: " + media);
    }
}
