package trabalhojava;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", 15, "2025001");                //cria o aluno com esses atributos//
        professor professor = new professor("Carlos", "Matemática");
        Turma turma = new Turma("1º Ano A", "Sala 10");
        Disciplina disciplina = new Disciplina("Matemática");
        Matricula matricula = new Matricula("2025001");
        Boletim boletim = new Boletim(8.5);
        Escola escola = new Escola("Escola Estadual ABC");

        escola.cadastrarAluno();      //cadastra o aluno na escola//
        matricula.matricularAluno(); // matricula ele//
        turma.adicionarAluno();
        professor.ministrarAula();  // representa o professor dando aula//
        aluno.estudar();        //resultará a acâo escolhida//
        disciplina.registrarNota();  //registra notas//
        boletim.emitirBoletim();
    }
}
