package aplicacao;

import modelo.Prateleira;
import modelo.Produto;

public class Teste {
	public static void main(String[] args) {
		
		Produto arroz,feijao,carne,leite;
		arroz = new Produto("arroz", 5.0) ;
		feijao = new Produto("feijao", 8.0) ;
		carne = new Produto("carne", 40.0) ;
		leite = new Produto("leite", 5.0) ;
		
		Prateleira prat1 = new Prateleira(1);
		Prateleira prat2 = new Prateleira(2) ;
		
		prat1.adicionar(arroz);
		prat1.adicionar(feijao);
		prat1.adicionar(carne);
		prat2.adicionar(leite);
		
		//exibir os objetos relacionados
		System.out.println(prat1);
		System.out.println(prat2);
		System.out.println(arroz);
		System.out.println(feijao);
		System.out.println(carne);
		System.out.println(leite);
		
		//localizar leite na prateleira 2
		Produto aux = prat2.localizar("leite");
		if (aux == null)
			System.out.println("não localizou");
		else
			System.out.println("\nlocalizou:" + aux);

		//obter a prateleira do arroz
		Prateleira ptArroz = arroz.getPrateleira();
		
		if (ptArroz == null)
			System.out.println("arroz não tem prateleira");
		
		else {
			//transferir arroz para prateleira 2
			System.out.println("prat.do arroz:"+ ptArroz.getId());
			ptArroz.remover(arroz);
			prat2.adicionar(arroz);
			System.out.println("transferiu arroz para prat.2");
		}
		
		//exibir os objetos relacionados (final)
		System.out.println(prat1);
		System.out.println(prat2);
		System.out.println(arroz);
		System.out.println(feijao);
		System.out.println(carne);
		System.out.println(leite);


	}
}
