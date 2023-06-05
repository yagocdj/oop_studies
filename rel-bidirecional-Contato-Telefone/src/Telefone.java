import java.util.ArrayList;

public class Telefone {

	private String ddd;
	private String numero;
	private ArrayList<Contato> contatos;

	public Telefone(String ddd, String numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.contatos = new ArrayList<>();
	}
	
	public void adicionar(Contato contato) {
		contatos.add(contato);
	}
	
	public void remover(Contato contato) {
		contatos.remove(contato);
	}
	
	public Contato localizar(String nome) {
		for (Contato contato: contatos)
			if (contato.getNome().equals(nome))
				return contato;
		return null;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	
	@Override
	public String toString() {
		String texto = "\nDDD: " + ddd + "\nNumero: " + numero + "\nContatos: ";
		
		if (contatos.isEmpty()) {
			texto += "nao ha contatos";
			return texto;
		}

		for (Contato contato: contatos)
			texto += " " + contato.getNome();
		
		return texto;
	}
}
