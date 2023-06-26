package modelo;

public class Participante {
	private String email;
	private String nome;
	private int idade;

	public Participante(String email, String nome, int idade) {
		super();
		this.email = email;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getPercentual() {
		if (this.idade < 18)
			return 50;
		else if (this.idade < 60)
			return 0;
		else
			return 20;
	}
	
	public double getValorPago(double preco) {
		double desconto = preco * (getPercentual() / 100.0);
		return preco - desconto;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
