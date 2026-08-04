package trabalhojava;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", 15, "2025001");
        professor professor = new professor("Carlos", "Matemática");
        Turma turma = new Turma("1º Ano A", "Sala 10");
        Disciplina disciplina = new Disciplina("Matemática");
        Matricula matricula = new Matricula("2025001");
        Boletim boletim = new Boletim(8.5);
        Escola escola = new Escola("Escola Estadual ABC");

        escola.cadastrarAluno();
        matricula.matricularAluno();
        turma.adicionarAluno();
        professor.ministrarAula();
        aluno.estudar();
        disciplina.registrarNota();
        boletim.emitirBoletim();
    }
}