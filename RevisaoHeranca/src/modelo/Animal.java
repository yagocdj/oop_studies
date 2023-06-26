package modelo;

public abstract class Animal {
	protected String nome;
	protected double peso;
	
	public Animal(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	public abstract String emitirSom();
	
	@Override
	public String toString() {
		return "\nnome = " + nome +
			   "\npeso = " + peso +
			   "\nsom  = " + emitirSom();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
