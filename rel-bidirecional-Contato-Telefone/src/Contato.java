import java.util.ArrayList;

public class Contato {

	private String nome;
	private String logradouro;
	private ArrayList<Telefone> telefones;
	
	public Contato(String nome, String logradouro) {
		super();
		this.nome = nome;
		this.logradouro = logradouro;
		this.telefones = new ArrayList<>();
	}
	
	public void adicionar(Telefone tel) {
		telefones.add(tel);
	}
	
	public void remover(Telefone tel) {
		telefones.remove(tel);;
	}
	
	public Telefone localizar(String dddNumero) {
		for (Telefone tel: telefones)
			if ((tel.getDdd() + tel.getNumero()).equals(dddNumero))
				return tel;
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}
	
	@Override
	public String toString() {
		String texto = "\nNome: " + nome + "\nLogradouro: " + logradouro + "\nTelefones: ";
		
		if (telefones.isEmpty()) {
			texto += "nao ha telefones";
			return texto;
		}

		for (Telefone tel: telefones)
			texto += " " + tel.getDdd() + tel.getNumero();
		
		return texto;
	}
}
