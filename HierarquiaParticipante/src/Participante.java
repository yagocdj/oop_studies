/**
 * SI - POO - Prof. Fausto Ayres
 *
 */

public class Participante {
	protected String email;
	protected String nome;
	protected int idade;
	
	public Participante(String email, String nome, int idade) {
		super();
		this.email = email;
		this.nome = nome;
		this.idade = idade;
	}

	public int getPercentual() {
		if(idade<18)
			return 50;
		else
			if(idade>=60)
				return 20;
			else
				return 0;
	}

	public double getValorPago(double preco) {
		double desconto = (preco * getPercentual()/100);
		return preco - desconto ;
	}

	@Override
	public String toString() {
		return  "\n\nemail = " + email +
				"\nnome = " + nome +
				"\nidade = " + idade +
				"\npercentual = " + getPercentual() ;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


}
