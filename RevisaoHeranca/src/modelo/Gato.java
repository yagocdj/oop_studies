package modelo;

public class Gato extends Animal {
	private int salto;

	public Gato(String nome, double peso, int salto) {
		super(nome, peso);
		this.salto = salto;
	}
	
	@Override
	public String emitirSom() {
		return "miau!";
	}

	public int getSalto() {
		return salto;
	}
	
	@Override
	public String toString() {
		return "\nnome  = " + nome +
			   "\npeso  = " + peso +
			   "\nsalto = " + salto +
			   "\nsom   = " + emitirSom();
	}
}
