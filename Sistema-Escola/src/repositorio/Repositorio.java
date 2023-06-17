package repositorio;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programa��o Orientada a Objetos
 * Prof. Fausto Maranh�o Ayres
 **********************************/

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Professor;
import modelo.Turma;

public class Repositorio {
	private ArrayList<Turma> turmas = new ArrayList<>();
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Professor> professores = new ArrayList<>();

	public void adicionar(Turma t) 	{
		turmas.add(t);
	}
	
	public void remover(Turma t) {
		turmas.remove(t);
	}
	
	public Turma localizarTurma(int id) {
		for(Turma t : turmas)
			if (t.getId() == id)	return t;

		return null;
	}

	public void adicionar(Aluno a) 	{
		alunos.add( a);
	}
	
	public void remover(Aluno a) {
		alunos.remove(a);
	}
	
	public Aluno localizarAluno(String nome) {
		for(Aluno a: alunos)
			if(a.getNome().equals(nome))
				return a;
		return null;
	}
	
	public void adicionar(Professor p) 	{
		professores.add(p);
	}
	
	public void remover(Professor p) {
		professores.remove(p);
	}
	
	public Professor localizarProfessor(String nome) {
		for(Professor p: professores)
			if(p.getNome().equals(nome))
				return p;
		return null;
	}


	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public int getTotalTurmas(){
		return turmas.size();
	}

	public int getTotalAlunos(){
		return alunos.size();
	}

	public int getTotalProfessores(){
		return professores.size();
	}

	
	public int gerarId() {
		if (turmas.isEmpty())
			return 1;
		else {
			Turma ultima = turmas.get(turmas.size()-1);
			return ultima.getId() + 1;
		}
	}
}
