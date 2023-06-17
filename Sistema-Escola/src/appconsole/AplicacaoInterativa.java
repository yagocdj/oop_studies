package appconsole;

import java.util.ArrayList;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/

import java.util.Scanner;

import modelo.Aluno;
import modelo.Professor;
import modelo.Turma;
import regras_negocio.Fachada;

public class AplicacaoInterativa {
	private Scanner teclado = new Scanner(System.in);

	public AplicacaoInterativa() {
		try{
			Teste1.main(null);	//cadastra objetos Aluno, Professor e Turma no repositorio
			System.out.println("\n****pre-cadastro realizado com sucesso****\n");
		}
		catch(Exception e){
			System.out.println("-->" + e.getMessage());
			System.exit(0);
		}
		processarMenu();

	}

	public  void processarMenu() {
		int opcao;
		System.out.println(" <-- Bem vindo ao Sistema Escolinha --> ");
		do {
			exibirMenu();
			try{
				opcao = Integer.parseInt(teclado.nextLine());
				switch (opcao) {
				case 0:	break;
				case 1:	tarefa_criarTurma();					break;
				case 2:	tarefa_cadastrarAluno();				break;
				case 3:	tarefa_cadastrarProfessor();			break;
				case 4: tarefa_imprimirTurmas(); 				break;
				case 5: tarefa_imprimirAlunos();				break;
				case 6: tarefa_imprimirProfessores();			break;
				case 7:	tarefa_matricularAluno();				break;
				case 8:	tarefa_alocarProfessor();				break;
				case 9: tarefa_transferirAluno();				break;
				default: System.out.println("Opção Invalida !! \n");
				}
			}
			catch(NumberFormatException e)	{
				System.out.println("Digite somente número! \n");
				opcao=-1;
			}
			catch(Exception e)	{
				System.out.println("erro:" + e);
				e.printStackTrace();
				opcao=-1;
			}		
		}while (opcao != 0);

		System.out.println("\n <-- Até Breve -->");
	}

	public void exibirMenu() {
		System.out.println("\n\n");
		System.out.println("\n\n| - - - - - - - - -  Menu  - - - - - - - - - - - |");
		System.out.println("|  [0]- Sair                                     |");
		System.out.println("|  [1]- Criar Turma                              |");
		System.out.println("|  [2]- Cadastrar Aluno                          |");
		System.out.println("|  [3]- Cadastrar Professor                      |");
		System.out.println("|  [4]- Listar turmas                            |");
		System.out.println("|  [5]- Listar alunos                            |");
		System.out.println("|  [6]- Listar professores                       |");
		System.out.println("|  [7]- Matricular aluno na turma                |");
		System.out.println("|  [8]- Alocar professor na turma                |");
		System.out.println("|  [9]- Transferir aluno de turma                |");
		System.out.println("| - - - - - - - - - - - - - - - - - - - - - - - -|");
		System.out.print("  Opção :");
	}
	//	---------------------------------------	
	public void tarefa_criarTurma(){  
		//	---------------------------------------	
		System.out.println("\n---CRIAR TURMA---");	
		Fachada.criarTurma();
		System.out.println("--> Turma criada: "  );
	}

	//	---------------------------------------	
	public void tarefa_cadastrarAluno(){
		//	---------------------------------------			
		String nome;
		System.out.println("\n---CADASTRO DE ALUNOS---");
		System.out.print("Nome do aluno(ou ENTER para voltar):");
		nome = teclado.nextLine();		
		while (!nome.equals("")) {
			System.out.print("media:");
			double media = teclado.nextDouble();

			try{
				Fachada.criarAluno(nome,media) ;
				System.out.println("--> cadastro de aluno ok ! -->  \n");
			}
			catch(Exception e){
				System.out.println("-->" + e.getMessage());
			}

			teclado.nextLine(); 					//descartar o ultimo ENTER
			System.out.print("Nome do aluno(ou ENTER para voltar):");
			nome = teclado.nextLine();			
		}
	}

	//	---------------------------------------	
	public void tarefa_cadastrarProfessor(){
		//	---------------------------------------	
		String nome;
		System.out.println("\n---CADASTRO DE PROFESSSORES---");
		System.out.print("Nome do professor (ou enter para voltar):");
		nome = teclado.nextLine();
		while (!nome.equals("")) {
			System.out.print("salario:");
			double sal = teclado.nextDouble();
			try{
				Fachada.criarProfessor(nome,sal) ;
				System.out.println("--> cadastro de prof. ok ! \n");
			}
			catch(Exception e){
				System.out.println("-->" + e.getMessage());
			}

			teclado.nextLine(); 				//descartar o ultimo ENTER
			System.out.print("Nome do professor (ou enter para voltar):");
			nome = teclado.nextLine();			
		}
	}

	//	---------------------------------------	
	public void tarefa_imprimirAlunos()
	//	---------------------------------------	
	{
		System.out.println("\n---LISTAGEM DE ALUNOS ---");
		ArrayList<Aluno> alunos = Fachada.listarAlunos();
		for(Aluno a : alunos)
			System.out.println(a);
		System.out.println("-----------fim-----------");
	}
	//	---------------------------------------	
	public void tarefa_imprimirProfessores()
	//	---------------------------------------	
	{
		System.out.println("\n---LISTAGEM DE PROFESSORES ---");
		ArrayList<Professor> professores = Fachada.listarProfessores();
		for(Professor p : professores)
			System.out.println(p);
		System.out.println("-----------fim-----------");
	}
	//	---------------------------------------	
	public void tarefa_imprimirTurmas()
	//	---------------------------------------	
	{
		System.out.println("\n---LISTAGEM DE TURMAS ---");
		ArrayList<Turma> turmas = Fachada.listarTurmas();
		for(Turma t : turmas)
			System.out.println(t);
		System.out.println("-----------fim-----------");
	}

	//	---------------------------------------	
	public void tarefa_matricularAluno()
	//	---------------------------------------	
	{
		int id;
		String nome;
		System.out.println("\n---MATRICULA DE ALUNO NA TURMA---");
		System.out.print("Nome do aluno:");
		nome = teclado.nextLine();			
		System.out.print("Id da turma:");
		id = teclado.nextInt();	
		teclado.nextLine(); 					//descartar o ultimo ENTER
		try{
			Fachada.matricularAluno(nome, id);   
			System.out.println("--> ok, matriculou ");
		}
		catch(Exception e){
			System.out.println("-->" +e.getMessage());
		}	

	}

	//	---------------------------------------	
	public void tarefa_alocarProfessor()
	//	---------------------------------------	
	{
		int id;
		String nome;
		System.out.println("\n---ALOCAR PROFESSOR NA TURMA---");
		System.out.print("Nome do professor (ou enter):");
		nome = teclado.nextLine();				
		System.out.print("Id da turma:");
		id = teclado.nextInt();	
		teclado.nextLine(); 					//descartar o ultimo ENTER
		try{
			Fachada.alocarProfessor(nome, id);   
			System.out.println("--> ok, alocou ");
		}
		catch(Exception e){
			System.out.println("-->" +e.getMessage());
		}	

	}

	public void tarefa_transferirAluno()
	//	---------------------------------------	
	{
		int id;
		String nome;
		System.out.println("\n---TRANSFERIR DE ALUNO NA TURMA---");
		System.out.print("Nome do aluno:");
		nome = teclado.nextLine();			
		System.out.print("Id da turma:");
		id = teclado.nextInt();	
		teclado.nextLine(); 					//descartar o ultimo ENTER
		try{
			Fachada.transferirAluno(nome, id);   
			System.out.println("--> ok, transferiu ");
		}
		catch(Exception e){
			System.out.println("-->" +e.getMessage());
		}	
	}



	public static void main (String[] args)   
	{
		new AplicacaoInterativa();
	}

}//class
