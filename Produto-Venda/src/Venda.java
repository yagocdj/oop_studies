/*
 * IFPB - TSI - POO
 * Prof. Fausto Ayres
 */

public class Venda {
	private String data;
	private String nome;
	private int quantidade;
	private double valor;

	public Venda(String data, Produto produto, int quantidade) {
		this.data = data;
		this.nome = produto.getNome();
		this.quantidade = quantidade;
		
		valor = quantidade * produto.getPreco();
		//baixar no estoque na quantidade vendida
		produto.setEstoque(produto.getEstoque() - quantidade);
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public double getValor() {
		return valor;
	}


	@Override
	public String toString() {
		return "Venda [data=" + data + ", valor=" + valor + "]";
	}



}
