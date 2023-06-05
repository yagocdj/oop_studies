import java.util.ArrayList;

public class Fabricante {
	
	private String nome;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	
	public void adicionar(Produto p) {
		produtos.add(p);
		p.setFabricante(this);
	}
	
	public void remover(Produto p) {
		produtos.remove(p);
		p.setFabricante(null);
	}
	
	public Produto localizar(String nome) {
		for (Produto p : produtos)
			if (p.getNome().equals(nome))
				return p;
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Produto> getProdutos() {
		return this.produtos;
	}
	
	@Override
	public String toString() {
		String texto;
		texto = "\nFabricante: " + nome + "\n";
		
		if (produtos.isEmpty())
			texto += "nao tem produto";
		else {
			texto += "produtos do fabricante " + nome + ": ";
			for (Produto p: produtos) texto += " " + p.getNome();
		}
		return texto;
	}
}
