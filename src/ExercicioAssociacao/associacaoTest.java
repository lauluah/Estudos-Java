package ExercicioAssociacao;

public class associacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno1 = new Aluno("lucas", 17);
        Aluno aluno2 = new Aluno("Luis", 19);

        Professor professor = new Professor("Carlos", "Biologia");
        Aluno[] alunosParaSeminario = {aluno1, aluno2};

        Seminario seminario = new Seminario("Revisão Enem", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
