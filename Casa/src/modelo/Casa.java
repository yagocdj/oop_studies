package modelo;

public class Casa {
	private Pessoa proprietario;
	private Endereco endereco;
	private String bairro;
	private double precoVenda;
	
	public Casa(Pessoa proprietario, Endereco endereco, double precoVenda) {
		super();
		this.proprietario = proprietario;
		this.endereco = endereco;
		this.precoVenda = precoVenda;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	@Override
	public String toString() {
		return "Casa [proprietario=" + proprietario + ", endereco=" + endereco + ", bairro=" + bairro + ", precoVenda="
				+ precoVenda + "]";
	}
}
