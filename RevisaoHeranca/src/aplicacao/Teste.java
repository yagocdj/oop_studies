package aplicacao;
import modelo.*;

public class Teste {

	public static void main(String[] args) {
		
		//instanciar os objetos
		Gato fifi = new Gato("fifi", 5, 3);
		Cachorro rex = new Cachorro("rex", 15);
		
		try {
			Arara jao = new Arara("jao", 1, "verde", "vermelho");
			System.out.println(jao);
		} catch (Exception err) {
			System.out.println("Erro -> " + err.getMessage());
		}
		
		//exibir nome, peso e som dos objetos com toString()
		System.out.println(rex); //”rex 15 au au”
		System.out.println(fifi); //”fifi 5 miau"
		
		Animal a;
		
		a = new Gato("Tom tom", 6, 4);
		System.out.println(a);
		
		Veterinario bob = new Veterinario("Bob");
		System.out.println( bob.aplicarInjecao(fifi) );
		System.out.println( bob.aplicarInjecao(rex) );

	}

}
