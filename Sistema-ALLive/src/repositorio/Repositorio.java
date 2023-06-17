/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO
 * Prof. Fausto Maranh�o Ayres
 **********************************/
package repositorio;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import modelo.Convidado;
import modelo.Evento;
import modelo.Participante;

public class Repositorio {
	private TreeMap<String, Participante> participantes = new TreeMap<>();
	private ArrayList<Evento> eventos = new ArrayList<>(); 

	public Repositorio() {
		carregarObjetos();
	}
	public void adicionar(Participante p)	{
		participantes.put(p.getNome(), p);
	}

	public void remover(Participante p)	{
		participantes.remove(p.getNome());
	}

	public Participante localizarParticipante(String nome)	{
		return participantes.get(nome);
	}

	public void adicionar(Evento e)	{
		eventos.add(e);
	}
	public void remover(Evento e)	{
		eventos.remove(e);
	}

	public Evento localizarEvento(int id)	{
		for(Evento e : eventos)
			if(e.getId() == id)
				return e;
		return null;
	}
	public Evento localizarEvento(String data)	{
		for(Evento e : eventos)
			if(e.getData().equals(data))
				return e;
		return null;
	}

	public ArrayList<Participante> getParticipantes() 	{
		return new ArrayList<>(participantes.values());
	}
	
	public ArrayList<Evento> getEventos() 	{
		return eventos;
	}

	public int getTotalParticipante()	{
		return participantes.size();
	}

	public int getTotalEventos()	{
		return eventos.size();
	}

	public int gerarId() {
		if (eventos.isEmpty())
			return 1;
		else {
			Evento ultimo = eventos.get(eventos.size()-1);
			return ultimo.getId() + 1;
		}
	}
	public void carregarObjetos()  	{
		// carregar para o repositorio os objetos salvos nos arquivos csv
		try {
			//caso os arquivos nao existam, serao criados vazios
			File f1 = new File( new File(".\\eventos.csv").getCanonicalPath() ) ; 
			File f2 = new File( new File(".\\participantes.csv").getCanonicalPath() ) ; 
			if (!f1.exists() || !f2.exists() ) {
				//System.out.println("criando arquivo .csv vazio");
				FileWriter arquivo1 = new FileWriter(f1); arquivo1.close();
				FileWriter arquivo2 = new FileWriter(f2); arquivo2.close();
				return;
			}
		}
		catch(Exception ex)		{
			throw new RuntimeException("criacao dos arquivos vazios:"+ex.getMessage());
		}

		String linha;	
		String[] partes;	
		Evento ev;
		Participante p;

		try	{
			String data, descricao, id, preco ;
			File f = new File( new File(".\\eventos.csv").getCanonicalPath() )  ;
			Scanner arquivo1 = new Scanner(f);	 //  pasta do projeto
			while(arquivo1.hasNextLine()) 	{
				linha = arquivo1.nextLine().trim();		
				partes = linha.split(";");	
				//System.out.println(Arrays.toString(partes));
				id = partes[0];
				data = partes[1];
				descricao = partes[2];
				preco = partes[3];
				ev = new Evento(Integer.parseInt(id), descricao, data, Double.parseDouble(preco));
				this.adicionar(ev);
			} 
			arquivo1.close();
		}
		catch(Exception ex)		{
			throw new RuntimeException("leitura arquivo de eventos:"+ex.getMessage());
		}

		try	{
			String tipo,nome, email, empresa, idade, listaId;
			File f = new File( new File(".\\participantes.csv").getCanonicalPath())  ;
			Scanner arquivo2 = new Scanner(f);	 //  pasta do projeto
			while(arquivo2.hasNextLine()) 	{
				linha = arquivo2.nextLine().trim();	
				partes = linha.split(";");
				//System.out.println(Arrays.toString(partes));
				tipo = partes[0];
				email = partes[1];
				nome = partes[2];
				idade = partes[3];
				listaId="";
				if(tipo.equals("PARTICIPANTE")) {
					p = new Participante(email,nome,Integer.parseInt(idade));
					this.adicionar(p);
					if(partes.length>4)
						listaId = partes[4];		//lista de id separados por ,
				}
				else {
					empresa = partes[4];
					p = new Convidado(email,nome,Integer.parseInt(idade),empresa);
					this.adicionar(p);
					if(partes.length>5)
						listaId = partes[5];		//lista de id separados por ,
				}

				if(!listaId.isEmpty()) {
					//relacionar participante com os eventos
					for(String idevento : listaId.split(",")){
						ev = this.localizarEvento(Integer.parseInt(idevento));
						ev.adicionar(p);
						p.adicionar(ev);
					}
				}
			}
			arquivo2.close();
		}
		catch(Exception ex)		{
			throw new RuntimeException("leitura arquivo de participantes:"+ex.getMessage());
		}
	}

	//--------------------------------------------------------------------
	public void	salvarObjetos()  {
		//gravar nos arquivos csv os objetos que est�o no reposit�rio
		try	{
			File f = new File( new File(".\\eventos.csv").getCanonicalPath())  ;
			FileWriter arquivo1 = new FileWriter(f); 
			for(Evento e : eventos) 	{
				arquivo1.write(e.getId()+";"+e.getData()+";"+e.getDescricao()+";"+e.getPreco()+"\n");	
			} 
			arquivo1.close();
		}
		catch(Exception e){
			throw new RuntimeException("problema na cria��o do arquivo  eventos "+e.getMessage());
		}

		try	{
			File f = new File( new File(".\\participantes.csv").getCanonicalPath())  ;
			FileWriter arquivo2 = new FileWriter(f) ; 
			ArrayList<String> lista ;
			String listaId;
			for(Participante p : participantes.values()) {
				//montar uma lista com os id dos eventos do participante
				lista = new ArrayList<>();
				for(Evento e : p.getEventos()) {
					lista.add(e.getId()+"");
				}
				listaId = String.join(",", lista);

				if(p instanceof Convidado c )
					arquivo2.write("CONVIDADO;" +p.getEmail() +";" + p.getNome() +";" 
							+ p.getIdade() +";"+ c.getEmpresa() +";"+ listaId +"\n");	
				else
					arquivo2.write("PARTICIPANTE;" +p.getEmail() +";" + p.getNome() +";" 
							+ p.getIdade() +";"+ listaId +"\n");	

			} 
			arquivo2.close();
		}
		catch (Exception e) {
			throw new RuntimeException("problema na cria��o do arquivo  participantes "+e.getMessage());
		}

	}
}

