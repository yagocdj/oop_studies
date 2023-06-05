
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programa��o Orientada a Objetos
 * Prof. Fausto Maranh�o Ayres
 **********************************/

public class Teste {

	public static void main(String[] args) {

		Contato joao = new Contato("joao", "rua do sol, 45");
		Contato maria = new Contato("maria", "rua da paz, 200");
		Telefone tel1 = new Telefone("83", "999001100");
		Telefone tel2 = new Telefone("83", "999001200");
		Telefone tel3 = new Telefone("83", "999001300");
		Telefone tel4 = new Telefone("83", "999001400");
		Telefone tel5 = new Telefone("83", "32471000");

		joao.adicionar(tel1);
		joao.adicionar(tel2);
		joao.adicionar(tel5);
		maria.adicionar(tel3);
		maria.adicionar(tel4);
		maria.adicionar(tel5);

		tel1.adicionar(joao);
		tel2.adicionar(joao);
		tel3.adicionar(maria);
		tel4.adicionar(maria);
		tel5.adicionar(joao);
		tel5.adicionar(maria);

		Telefone t = maria.localizar("8332471000");
		if(t!=null){
			//remover telefone de maria
			System.out.println("localizou:" + t);
			maria.remover(t);
			t.remover(maria);
			System.out.println("removeu telefone de maria");
		}
		else
			System.out.println("n�o localizou telefone");

		
		System.out.println("\n resultado final");
		System.out.println(joao);
		System.out.println(maria);
		System.out.println(tel1);
		System.out.println(tel2);
		System.out.println(tel3);
		System.out.println(tel4);
		System.out.println(tel5);
	}

}
