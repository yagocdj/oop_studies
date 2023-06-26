package modelo;

import java.util.ArrayList;

public class Arara extends Animal {
	private ArrayList<String> cores;

	public Arara(String nome, double peso, String... cores) throws Exception {
		super(nome, peso);
		this.cores = new ArrayList<>();
		
		if (cores.length == 0)
			throw new Exception("Passe alguma cor!");
		
		for (String cor : cores)
			this.cores.add(cor);
	}
	
	@Override
	public String emitirSom() {
		return "Aaaaaaa";
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		
		output += "\ncores = [";
		for (String cor : cores)
			output += " " + cor;
		output += " ]";
		
		return output;
	}
}
