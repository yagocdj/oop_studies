package modelo;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/

import java.util.ArrayList;

public class Turma
{
	private int id;
	private ArrayList<Aluno> alunos = new ArrayList <> ();         
	private ArrayList<Professor> professores = new ArrayList <> ();

	public Turma(int id)  {
		this.id = id;
	}

	public int getId()    {
		return id;
	}
	public String toString(){
		String s= "id=" + getId() + ", media=" + getMedia() ;
		s=s+",  alunos:" ;
		if (!alunos.isEmpty()){
			for(Aluno a : alunos) 
				s=s+" " + a.getNome();
		}
		else s=s+" sem aluno";

		s=s+",  professores:" ;
		if (!professores.isEmpty()){
			for(Professor p : professores) 
				s=s+" " + p.getNome();
		}
		else s=s+" sem professor";
		return s;
	}

	public double getMedia()
	{
		double soma=0.0, media;
		for (Aluno a : alunos)
			soma = soma + a.getMedia();

		if(alunos.isEmpty())
			media=0;
		else
			media = soma/alunos.size();
		return media;
	}

	public double getMediaSalarial()
	{
		double soma = 0.0;
		for (Professor prof : professores)      //encapsulamento		
			soma = soma + prof.getSalario();

		if(professores.isEmpty())
			return 0;
		else
			return  soma/professores.size();
	}

	public boolean estaLotada(){
		return alunos.size() == 2;			// valor para teste
	}

	//------------------------------------------------------------------------
	//  RELACIONAMENTO BIDIRECIONAL COM ALUNO
	//------------------------------------------------------------------------
	public void adicionar(Aluno alu)    {
		alunos.add(alu);
		alu.setTurma(this);
	}
	public void remover (Aluno alu) {
		alunos.remove(alu);
		alu.setTurma(null);
	} 
	public Aluno localizarAluno(String nome) {
		for(Aluno a: alunos)
			if(a.getNome().equals(nome)) return a; 
		return null;	
	}
	public ArrayList <Aluno> getAlunos()    {
		return alunos;
	}
	public int obterTotalAlunos()    {
		return alunos.size();
	}


	//------------------------------------------------------------------------
	//  RELACIONAMENTO BIDIRECIONAL COM PROFESSOR
	//------------------------------------------------------------------------
	public void adicionar (Professor prof)    {
		professores.add(prof);	//relacionar turma com o professor
		prof.setTurma(this);
	}
	public void remover(Professor prof) {
		professores.remove(prof);
		prof.setTurma(null);
	}
	public Professor localizarProfessor(String nome) {
		for(Professor p: professores)
			if(p.getNome().equals(nome)) return p; 
		return null;	
	}	
	public ArrayList <Professor> getProfessores()    {
		return professores;
	}
	public int obterTotalProfessores()    {
		return professores.size();
	}


}
