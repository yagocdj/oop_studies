package modelo;

public class Veterinario {
	private String nome;
	
	public Veterinario(String nome) {
		super();
		this.nome = nome;
	}
	
	public String aplicarInjecao(Animal a) {
		return "Dr. " + nome +
			   " aplicou uma injeção em " + a.getNome() +
			   " que fez " + a.emitirSom();
	}
}
