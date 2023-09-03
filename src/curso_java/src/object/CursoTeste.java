package object;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Bruce");
		Aluno aluno2 = new Aluno("Júlia");
		Aluno aluno3 = new Aluno("Lucas");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("C# Completo");
		Curso curso3 = new Curso("WEB Completo");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado(a) no " + curso1.nome + ",");
			System.out.println("e o meu nome é " + aluno.nome);
		}
		
		System.out.print("\n");
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado(a) no " + curso2.nome + ",");
			System.out.println("e o meu nome é " + aluno.nome);
		}
		
		System.out.print("\n");
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado(a) no " + curso3.nome + ",");
			System.out.println("e o meu nome é " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
	}
}
