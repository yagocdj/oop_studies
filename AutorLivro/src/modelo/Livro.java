package modelo;

import java.util.ArrayList;

public class Livro {
	private String titulo;
	private ArrayList<Autor> autores = new ArrayList<>();
	
	public Livro(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public void adicionar(Autor aut) {
		autores.add(aut);
		aut.adicionar(this);
	}
	
	public void remover(Autor aut) {
		autores.remove(aut);
		aut.remover(this);
	}
	
	public Autor localizar(String nome) {
		for(Autor aut: autores)
			if(aut.getNome().equals(nome)) 
				return aut; 
		return null;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		String output = "\nLivro '" + titulo + "'";
		output += "\nAutor(es):";
		
		for (Autor a : autores)
			output += "\n  - " + a.getNome();
		
		return output;
	}
	
}
