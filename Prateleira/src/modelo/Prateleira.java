package modelo;

import java.util.ArrayList;

public class Prateleira {
	private int id;
	private ArrayList<Produto> produtos;
	
	public Prateleira(int id) {
		super();
		this.id = id;
		this.produtos = new ArrayList<>();
	}
	
	public void adicionar(Produto p) {
		produtos.add(p);
		p.setPrateleira(this);
	}
	
	public void remover(Produto p) {
		produtos.remove(p); 
		p.setPrateleira(null);
	}
	
	public Produto localizar(String nome) {
		for(Produto p: produtos)
			if(p.getNome().equals(nome)) 
				return p; 
	
		return null;
	}

	@Override
	public String toString() {
		String output = "\nPrateleira ID " + id;
		output += "\nProdutos:";
		
		for (Produto p : produtos)
			output += "\n  - " + p.getNome() + " | " + p.getPreco() + " reais";
		
		return output;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
