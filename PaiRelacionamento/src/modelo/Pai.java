package modelo;

import java.util.ArrayList;

public class Pai {
	private String nome;
	private ArrayList<Filho> filhos =new ArrayList<>(); 
	
	public Pai(String nome) {
		this.nome = nome;
	}
	
	public void adicionar(Filho f){ 
		filhos.add(f);
	}
	
	public void remover(Filho f){ 
		filhos.remove(f);
	}
	
	public Filho localizar(String nome) {
		for(Filho f: filhos)
			if(f.getNome().equals(nome)) 
				return f; 

		return null;
	}
	
	public Filho obterCacula() {
		Filho cacula = filhos.get(0);
		
		for (Filho f : filhos)
			if (f.getIdade() < cacula.getIdade())
				cacula = f;

		return cacula;
	}
	
	public double obterIdadeMedia() {
		int somaDasIdades = 0;
		
		if (filhos.isEmpty())
			return 0.0;
			
		for (Filho f : filhos)
			somaDasIdades += f.getIdade();
		
		return somaDasIdades / filhos.size();
	}

	@Override
	public String toString() {
		return "Pai [nome=" + nome + ", filhos=" + filhos + "]";
	}
	
	
}
