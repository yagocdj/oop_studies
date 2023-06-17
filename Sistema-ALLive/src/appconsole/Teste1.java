package appconsole;
/**
 * SI - POO - Prof. Fausto Ayres
 * Teste da Fachada
 * 
 */

import modelo.Evento;
import modelo.Participante;
import regras_negocio.Fachada;

public class Teste1 {

	public Teste1() {
		try {
			System.out.println("\n---------listagem de participantes (arquivo)-----");
			for(Participante p : Fachada.listarParticipantes("")) 
				System.out.println(p);

			System.out.println("\n---------listagem de eventos (arquivo) ----");
			for(Evento e : Fachada.listarEventos()) 
				System.out.println(e);
		} catch (Exception e) {
			System.out.println("--->"+e.getMessage());
		}	


		try {
			//------ FESTA -------------
			Fachada.criarEvento("24/06/2022","festa de sao joao",100.0);
			System.out.println("\ncriou festa ");

			Fachada.adiarEvento("24/06/2022", "25/06/2022");
			System.out.println("adiou festa de sao joao "+Fachada.localizarEvento("25/06/2022").getData());

			System.out.println("criar participantes da festa");
			Fachada.criarParticipante("zezinho@gmail.com", "zezinho",  150);
			Fachada.criarParticipante("zezao@gmail.com", "zezao",  30);
			Fachada.criarConvidado("padre@gmail.com", "padre",  70, "igreja");
			Fachada.criarConvidado("diretor@gmail.com", "diretor",  50, "ifpb");

			System.out.println("adicionar participantes da festa");
			Fachada.adicionarParticipanteEvento("zezinho", 4);
			Fachada.adicionarParticipanteEvento("zezao", 4);
			Fachada.adicionarParticipanteEvento("padre", 4);
			Fachada.adicionarParticipanteEvento("diretor", 4);

			Fachada.removerParticipanteEvento("diretor", 4);
			System.out.println("removeu diretor da festa ");

			Fachada.apagarParticipante("diretor");
			System.out.println("apagou diretor do sistema ");

			
			//------ SHOW -------------
			Fachada.criarEvento("01/07/2022","show da elba",200.0);
			System.out.println("\ncriou show ");

			System.out.println("adicionar participantes do show");
			Fachada.adicionarParticipanteEvento("zezinho", 5);
			Fachada.adicionarParticipanteEvento("zezao", 5);

			Fachada.adiarEvento("01/07/2022", "02/07/2022");
			System.out.println("adiou festa de sao joao "+Fachada.localizarEvento("02/07/2022").getData());

			Fachada.apagarEvento("02/07/2022");
			System.out.println("apagou show");

		} catch (Exception e) {
			System.out.println("--->"+e.getMessage());
		}		


		try {
			System.out.println("\n---------listagem de participantes - final-----");
			for(Participante p : Fachada.listarParticipantes("")) 
				System.out.println(p);

			System.out.println("\n---------listagem de eventos - final");
			for(Evento e : Fachada.listarEventos()) 
				System.out.println(e);
		} catch (Exception e) {
			System.out.println("--->"+e.getMessage());
		}	

		//apagar  dados do teste
		try {Fachada.apagarEvento("24/06/2022");}	catch (Exception e) {}		
		try {Fachada.apagarEvento("25/06/2022");}	catch (Exception e) {}		
		try {Fachada.apagarEvento("01/07/2022");}	catch (Exception e) {}		
		try {Fachada.apagarEvento("02/07/2022");}	catch (Exception e) {}		
		try {Fachada.apagarParticipante("zezinho");}catch (Exception e) {}		
		try {Fachada.apagarParticipante("zezao");}	catch (Exception e) {}		
		try {Fachada.apagarParticipante("padre");}	catch (Exception e) {}		
		try {Fachada.apagarParticipante("diretor");}catch (Exception e) {}		
	}

	public static void main (String[] args) 
	{
		 new Teste1();
	}
}


