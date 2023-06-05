/**
 * SI - POO - Prof. Fausto Ayres
 */


import java.util.ArrayList;

public class Evento {
	private int id;
	private String nome;
	private String data;
	private double preco;
	private ArrayList<Participante> participantes = new ArrayList<>();

	public Evento(int id, String nome, String data, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.preco = preco;
	}
	
	public void adicionar(Participante p){
		participantes.add(p);
	}
	
	public void remover(Participante p){
		participantes.remove(p);
	}

	public Participante localizar(String nome){
		for(Participante p : participantes){
			if(p.getNome().equals(nome))
				return p;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", data=" + data + ", preco=" + preco + "]";
	}

	public double getTotalValorPago() {
		
		double totalPago = 0.0;
		
		for (Participante p: participantes)
			totalPago += p.getValorPago(preco);
		
		return totalPago;
	}

	public double getIdadeMedia() {
		
		if (participantes.size() == 0)
			return 0.0;
		
		double somaDasIdades = 0.0;
		
		for (Participante p: participantes)
			somaDasIdades += p.getIdade();
		
		return somaDasIdades / participantes.size();
	}

	public ArrayList<Participante> getParticipantesPorIdade(int idade) {
		
		ArrayList<Participante> participantesPorIdade = new ArrayList<>();
		
		for (Participante p: participantes)
			if (p.getIdade() == idade)
				participantesPorIdade.add(p);
		
		return participantesPorIdade;
	}
	
	public int contarConvidados() {
		
		int contadorConvidados = 0;
		
		for (Participante p: participantes)
			if (p instanceof Convidado)
				contadorConvidados++;
		
		return contadorConvidados;
	}
	
	public ArrayList<Convidado> getConvidados(String empresa) {
		
		ArrayList<Convidado> convidados = new ArrayList<>();
		
		for (Participante p: participantes)
			if (p instanceof Convidado && ((Convidado) p).getEmpresa().equals(empresa))	
				convidados.add((Convidado) p);
	
		return convidados;
	}
	
	public ArrayList<Convidado> getConvidados() {
		
		ArrayList<Convidado> convidados = new ArrayList<>();
		
		for (Participante p: participantes)
			if (p instanceof Convidado)
				convidados.add((Convidado) p);
		
		return convidados;
	}

	public int contarGratuidades() {
		
		int numDeGratuidades = 0;
		
		for (Participante p: participantes)
			if (p.getValorPago(preco) == 0.0)
				numDeGratuidades++;
		
		return numDeGratuidades;
				
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}




}
