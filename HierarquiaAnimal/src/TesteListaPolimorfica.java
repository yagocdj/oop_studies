import java.util.ArrayList;

public class TesteListaPolimorfica {
	public static void main(String[] args) {
		//uma lista com diferentes tipos de animal
		// ArrayList<Animal> animais = new ArrayList<>();
	
		//um array com diferentes tipos de animal
		// Animal[] animais = new Animal[100];
		
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add( new Cachorro("rex", 7) );
		animais.add( new Gato("fifi",3, 5) );
		animais.add( new Cachorro("lessy", 4) );
		animais.add( new Gato("nino", 6, 2) );
		
		//exibir todos os animais da lista
		for (Animal a : animais){
			System.out.println( a );
		}
		
		//exibir o animal mais pesado
		double maxpeso = 0;
		Animal maispesado = null;
		
		for (Animal a : animais)
			if (a.getPeso() >= maxpeso) {
				maxpeso = a.getPeso();
				maispesado = a;
			}
		System.out.println("\nAnimal mais pesado: ");
		System.out.println( maispesado );
		
		//Contar os gatos
		int cont = 0;
		for (Animal animal : animais){
			if(animal instanceof Gato)
				cont++;
		}
		System.out.println( "\n" + cont + " gatitos."); // 2
		
		//Contar os cachorros
		int contDog = 0;
		for (Animal animal : animais){
			if(animal instanceof Cachorro)
				contDog++;
		}
		System.out.println( contDog + " catiorros." ); // 2
		
		ArrayList<Gato> gatos = new ArrayList<>();
		for (Animal a : animais){
			if(a instanceof Gato)
				gatos.add( (Gato)a ); //casting explicito

		}
		System.out.println( gatos ); // [fifi,nino]
		
		ArrayList<Gato> gatos2 = new ArrayList<>();
		for (Animal a : animais){
			if(a instanceof Gato g) //casting implicito
				gatos2.add(g);
		}
		System.out.println( gatos2 ); // [fifi,nino]
		
		// Dogs
		ArrayList<Cachorro> cachorros = new ArrayList<>();
		for (Animal a : animais)
			if (a instanceof Cachorro c)  // casting implícito
				cachorros.add(c);
		System.out.println(cachorros);  // [rex, lessy]
		
		ArrayList<Gato> saltadores = new ArrayList<>();
		for (Animal a : animais)
			if (a instanceof Gato && ((Gato)a).getSalto()>= 5)
				saltadores.add( (Gato)a);
		System.out.println( saltadores ); // [fifi]
		
		ArrayList<Gato> saltadores2 = new ArrayList<>();
		for (Animal a : animais){
			if(a instanceof Gato g && g.getSalto()>= 5)  // g e a apontam para o mesmo objeto
				saltadores2.add(g);

		}
		System.out.println( saltadores2 ); // [fifi]
	}
}
