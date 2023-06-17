package regras_negocio;
/**********************************
 * Grupo de alunos: 
 * ?????
 * ????
 **********************************/

import java.util.ArrayList;

import modelo.Convidado;
import modelo.Evento;
import modelo.Participante;
import repositorio.Repositorio;

public class Fachada {
	private Fachada() {}		
	private static Repositorio repositorio = new Repositorio();	
	
	
	public static ArrayList<Evento> listarEventos() 	{
		return repositorio.getEventos();
	}
	public static ArrayList<Participante> listarParticipantes(String texto) {
		ArrayList<Participante> lista = new ArrayList<>();
		
		for(Participante p : repositorio.getParticipantes())
			if(p.getNome().contains(texto))
				lista.add(p);
			
		return lista;
	}
	public static Participante localizarParticipante(String nome) {
		return repositorio.localizarParticipante(nome);
	}
	public static Evento localizarEvento(int id) 	{
		return repositorio.localizarEvento(id);
	}
	public static Evento localizarEvento(String data) 	{
		return repositorio.localizarEvento(data);
	}
	
	public static void criarParticipante(String email, String nome, int idade) throws Exception {
		email = email.trim();
		nome = nome.trim();

		//localizar participante no repositorio, usando o nome 
		Participante p = repositorio.localizarParticipante(nome);
		if (p!=null)
			throw new Exception("Não criou participante: " + nome + " ja cadastrado(a)");

		//criar objeto Participante 
		p = new Participante (email, nome, idade);

		//adicionar participante no repositório
		repositorio.adicionar(p);
		//gravar repositório
		repositorio.salvarObjetos();
	}	

	public static void criarConvidado(String email,String nome, int idade, String empresa) throws Exception {
		email = email.trim();
		nome = nome.trim();
		empresa = empresa.trim();

		//localizar participante no repositorio, usando o nome 
		Participante p = repositorio.localizarParticipante(nome);
		if (p!=null)
			throw new Exception("Não criou convidado: " + nome + " ja cadastrado(a)");

		//a empresa é obrigatoria 
		if (empresa.isEmpty())
			throw new Exception("Não criou convidado: " + nome + " empresa é obrigatoria");

		//criar objeto Convidado 
		Convidado c = new Convidado (email, nome, idade, empresa);

		//adicionar convidado no repositório
		repositorio.adicionar(c);
		//gravar repositório
		repositorio.salvarObjetos();
	}
	
	public static void criarEvento (String data, String descricao, double preco) throws Exception {
		data = data.trim();
		descricao = descricao.trim();

		//localizar Evento no repositorio, usando a data 
		Evento ev = repositorio.localizarEvento(data);
		if (ev!=null)
			throw new Exception("Não criou evento: " + descricao + " ja existe nesta data "+data);
		
		if (preco <0)
			throw new Exception("Não criou evento: " + descricao + " preco nao pode ser negativo " + preco);

		
		//gerar id no repositorio
		int id = repositorio.gerarId();
		ev = new Evento(id, descricao, data, preco);	
		
		//adicionar evento no repositório
		repositorio.adicionar(ev);
		//gravar repositório
		repositorio.salvarObjetos();
	}

	public static void 	adicionarParticipanteEvento(String nome, int id) throws Exception {
		nome = nome.trim();

		//localizar participante no repositorio, usando o nome 
		Participante p = repositorio.localizarParticipante(nome);
		if(p == null) 
			throw new Exception("Não adicionou participante:  " + nome + " inexistente");


		//localizar evento no repositorio, usando id 
		Evento ev = repositorio.localizarEvento(id);
		if(ev == null) 
			throw new Exception("Não adicionou participante: evento " + id + " inexistente");


		//localizar o participante no evento, usando o nome
		Participante paux = ev.localizar(nome);
		if(paux != null) 
			throw new Exception("Não adicionou participante: " + nome + " já participa do evento " + id);

		//adicionar o participante ao evento
		ev.adicionar(p);
		//adicionar o evento ao participante
		p.adicionar(ev);
		//gravar repositório
		repositorio.salvarObjetos();
	}

	public static void 	removerParticipanteEvento(String nome, int id) throws Exception {
		nome = nome.trim();

		//localizar participante no repositorio, usando o nome 
		Participante p = repositorio.localizarParticipante(nome);
		if(p == null) 
			throw new Exception("Não removeu participante:: " + nome + " inexistente");


		//localizar evento no repositorio, usando id 
		Evento ev = repositorio.localizarEvento(id);
		if(ev == null) 
			throw new Exception("Não removeu participante: evento " + id + " inexistente");


		//localizar o participante no evento, usando o nome
		Participante paux = ev.localizar(nome);
		if(paux == null) 
			throw new Exception("Não removeu participante: " + nome + " nao participa do evento " + id);

		//remover o participante do evento
		ev.remover(p);
		//remover o evento do participante
		p.remover(ev);
		//gravar repositório
		repositorio.salvarObjetos();
	}

	public static void apagarEvento(String data) throws Exception	{
		//localizar evento no repositorio, usando id 
		Evento ev = repositorio.localizarEvento(data);
		if (ev == null)
			throw new Exception("Não deletou evento: " + data + " inexistente");

		//Remover todos os participantes deste evento
		for(Participante p : ev.getParticipantes()) {
			p.remover(ev);
		}
		ev.getParticipantes().clear();
		
		//remover evento do repositório
		repositorio.remover(ev);
		//gravar repositório
		repositorio.salvarObjetos();
	}

	public static void adiarEvento(String data, String novadata) throws Exception	{
		//localizar evento no repositorio, usando data 
		Evento ev = repositorio.localizarEvento(data);
		if (ev == null)
			throw new Exception("Não adiou evento: " + " data inexistente " + data);

		//localizar evento no repositorio, usando novadata
		Evento ev2 = repositorio.localizarEvento(novadata);
		if (ev2 != null)
			throw new Exception("Não adiou evento: " + data + " ja tem evento na nova data " + novadata);

		//alterar a data do evento
		ev.setData(novadata);
		
		//gravar repositório
		repositorio.salvarObjetos();
	}
	
	public static void 	apagarParticipante(String nome) throws Exception {
		nome = nome.trim();

		//localizar participante no repositorio, usando o nome 
		Participante p = repositorio.localizarParticipante(nome);
		if(p == null) 
			throw new Exception("Não deletou participante: " + nome + " inexistente");

		//participante nao pode ser deletado caso participe de algum evento
		if(!p.getEventos().isEmpty()) 
			throw new Exception("Não deletou participante: " + nome + " tem evento");


		//remover o participante do repositorio
		repositorio.remover(p);
		//gravar repositório
		repositorio.salvarObjetos();
	}


	

}
