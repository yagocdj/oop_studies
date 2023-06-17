package regras_negocio;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Professor;
import modelo.Turma;
import repositorio.Repositorio;



public class Fachada {
	private static Repositorio repositorio = new Repositorio();

	public static void criarTurma(){
		int idturma = repositorio.gerarId();
		Turma t = new Turma(idturma);
		repositorio.adicionar(t);
	}

	public static void criarAluno(String nome, double media) throws Exception{
		Aluno a = repositorio.localizarAluno(nome) ;
		if(a != null)							//aluno ja cadastrado no repositorio?
			throw new Exception("criar aluno " + nome + " - aluno ja cadastrado: ");
		if(media >10.0 || media <0) 
			throw new Exception("criar aluno " + nome + " - media fora do intervalo permitido "+media);

		a = new Aluno(nome,media);
		repositorio.adicionar(a);
	}

	public static void criarProfessor(String nome, double salario) throws Exception
	{	
		Professor prof = repositorio.localizarProfessor(nome);
		if(prof != null)						//professor ja cadastrado no repositorio?
			throw new Exception("criar professor " + nome + " - professor ja cadastrado:" );
		if(salario <= 0)
			throw new Exception("criar professor " + nome + " - salario invalido "+salario);

		Professor p = new Professor(nome,salario);
		repositorio.adicionar(p);
	}

	public static void matricularAluno(String nome, int id) throws Exception{
		Aluno alu = repositorio.localizarAluno(nome);   			
		if(alu==null)							//aluno ja cadastrado na repositorio?
			throw new Exception("matricular aluno - aluno inexistente: "+nome);

		Turma turma = repositorio.localizarTurma(id);
		if(turma==null)							//turma ja cadastrada na repositorio?
			throw new Exception ("matricular aluno " + nome + "- id turma inexistente: "+id);
		if(alu.estaMatriculado())
			throw new Exception("matricular aluno " + nome + " - aluno ja esta matriculado numa turma " + alu.getTurma().getId());
		if(turma.estaLotada())
			throw new Exception("matricular aluno " + nome + "- esta turma esta lotada: id=" +id);

		turma.adicionar(alu);		//incluir aluno na turma
	}

	public static void alocarProfessor (String nome, int id) throws Exception {
		Professor prof = repositorio.localizarProfessor(nome);   			
		if(prof==null)							//aluno ja cadastrado na repositorio?
			throw new Exception("alocar professor " + nome + "- prof inexistente: ");
		Turma turma = repositorio.localizarTurma(id);
		if(turma==null)							//turma ja cadastrada na repositorio?
			throw new Exception ("alocar professor " + nome + "- id turma inexistente: "+id);

		if(prof.estaAlocado())
			throw new Exception("alocar professor " + nome + "- professor ja esta alocado na turma "+prof.getTurma().getId());

		turma.adicionar(prof);	//relacionar professor com turma
	}

	public static void transferirAluno (String nome, int id)throws Exception{
		Aluno alu = repositorio.localizarAluno(nome);   			
		if(alu==null)							//aluno ja cadastrado na repositorio?
			throw new Exception("transferir aluno " + nome + "- aluno inexistente: ");

		Turma destino = repositorio.localizarTurma(id);
		if(destino==null)							//turma ja cadastrada na repositorio?
			throw new Exception ("transferir aluno " + nome + "- turma inexistente: "+id);

		if(!alu.estaMatriculado())
			throw new Exception("transferir aluno " + nome + "- aluno nao esta matriculado numa turma");

		Turma atual = alu.getTurma();
		if(atual == destino)
			throw new Exception("transferir aluno " + nome + "- turma destino tem que ser diferente da turma atual="+atual.getId());

		if(destino.estaLotada())
			throw new Exception("transferir aluno " + nome + "- turma destino lotada id=" + destino.getId());

		atual.remover(alu);
		destino.adicionar(alu) ;
	}

	public static ArrayList<Aluno> listarAlunos(){
		return repositorio.getAlunos();
	}
	public static ArrayList<Professor> listarProfessores(){
		return repositorio.getProfessores();
	}

	public static ArrayList<Turma> listarTurmas(){
		return repositorio.getTurmas();
	}



	//	TAREFAS EXTRAS

	public static void cancelarMatriculaAlunoTurma (String nome) throws Exception{
		Aluno alu = repositorio.localizarAluno(nome);   			
		if(alu==null)							//aluno ja cadastrado na repositorio?
			throw new Exception("cancelar matricula " + nome + "- aluno inexistente: ");

		if(!alu.estaMatriculado())
			throw new Exception("cancelar matricula  " + nome + "- aluno nao esta matriculado numa turma");

		Turma atual = alu.getTurma();
		atual.remover(alu);
	}

	public static void apagarAluno (String nome) throws Exception{
		Aluno alu = repositorio.localizarAluno(nome);   			
		if(alu==null)							//aluno ja cadastrado na repositorio?
			throw new Exception("apagar matricula " + nome + "- aluno inexistente: ");

		if(alu.estaMatriculado())
			throw new Exception("apagar matricula  " + nome + "- aluno esta matriculado numa turma");

		repositorio.remover(alu);
	}
}
