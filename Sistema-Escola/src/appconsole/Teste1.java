package appconsole;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Professor;
import modelo.Turma;
import regras_negocio.Fachada;

public class Teste1 {

	public Teste1() {
		try{
			Fachada.criarAluno("joao",7.0);
			Fachada.criarAluno("maria",10.0);
			Fachada.criarAluno("jose",4.0);
			Fachada.criarAluno("ana",10.0);
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
		}

		try {
			Fachada.criarProfessor("chico",1200.0);
			Fachada.criarProfessor("julio",1200.0);
			Fachada.criarProfessor("augusto",1200.0);
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
		}

		try {
			Fachada.criarTurma();		//id 1
			Fachada.criarTurma();		//id 2
			Fachada.criarTurma();		//id 3
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
		}


		try {
			Fachada.alocarProfessor("chico",1 );
			Fachada.alocarProfessor("julio",2 );
			Fachada.alocarProfessor("augusto", 2);
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
		}

		try {
			Fachada.matricularAluno("joao",1 );
			Fachada.matricularAluno("maria",1 );
			Fachada.matricularAluno("jose",2 );
			Fachada.matricularAluno("ana", 2);
			
			Fachada.transferirAluno("jose", 3);
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
		}

		try {
			Fachada.cancelarMatriculaAlunoTurma("ana");
			Fachada.apagarAluno("ana");
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
		}
		
		try {
			System.out.println("\nLista de Alunos:") ;
			ArrayList<Aluno> alunos = Fachada.listarAlunos();
			for(Aluno a : alunos)
				System.out.println(a);

			System.out.println("\nLista de Professores:") ;
			ArrayList<Professor> professores = Fachada.listarProfessores();
			for(Professor p : professores)
				System.out.println(p);

			System.out.println("\nLista de Turmas:") ;
			ArrayList<Turma> turmas = Fachada.listarTurmas();
			for(Turma t : turmas)
				System.out.println(t);
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
		}


		/**********************************
		 * TESTE DAS EXCEÇÕES
		 ***********************************/
		System.out.println();
		try {
			Fachada.criarAluno("joao", 0);
		}
		catch(Exception e){
			System.out.println("teste 1 ok-->" + e.getMessage());
		}
		try {
			Fachada.criarAluno("xxxx", 11.0);
		}
		catch(Exception e){
			System.out.println("teste 2 ok-->" + e.getMessage());
		}
		try {
			Fachada.matricularAluno("joao", 1);
		}
		catch(Exception e){
			System.out.println("teste 3 ok-->" + e.getMessage());
		}
		try {
			Fachada.transferirAluno("joao", 1);
		}
		catch(Exception e){
			System.out.println("teste 4 ok-->" + e.getMessage());
		}
		try {
			Fachada.cancelarMatriculaAlunoTurma("joao");
			Fachada.cancelarMatriculaAlunoTurma("joao");
		}
		catch(Exception e){
			System.out.println("teste 5 ok-->" + e.getMessage());
		}
		try {
			Fachada.apagarAluno("ana");
		}
		catch(Exception e){
			System.out.println("teste 6 ok-->" + e.getMessage());
		}
		try {
			Fachada.criarTurma();	//4
			Fachada.criarAluno("a1", 4);
			Fachada.matricularAluno("a1",4);
			Fachada.criarAluno("a2", 4);
			Fachada.matricularAluno("a2",4);
			Fachada.criarAluno("a3", 4);
			Fachada.matricularAluno("a3",4); //lotado com 2 alunos
		}
		catch(Exception e){
			System.out.println("teste 7 ok-->" + e.getMessage());
		}
		
	}

	public static void main(String[] args){
		new Teste1();
	}
}
