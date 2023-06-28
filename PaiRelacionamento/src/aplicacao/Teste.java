package aplicacao;

import modelo.Filho;
import modelo.Pai;

public class Teste {

	public static void main(String[] args) {
		
		Pai pai = new Pai("Jao");
		
		pai.adicionar(new Filho("Zezinho", 6));
		pai.adicionar(new Filho("Huguinho", 7));
		pai.adicionar(new Filho("Luisinho", 5));
		
		System.out.println(pai);
		
		// obter o objeto Filho com menor idade
		System.out.println(pai.obterCacula());
		
		// obter o valor da idade media dos filhos
		System.out.println(pai.obterIdadeMedia());
		
		Filho zezinho;
		zezinho = pai.localizar("Zezinho");
		
		if(zezinho != null)
			pai.remover(zezinho); //remover relacionamento
		
		zezinho = pai.localizar("Zezinho");
		
		if(zezinho == null)
			System.out.println("Zezinho inexistente");
	}

}
