package aplicacao;

import modelo.Carro;
import modelo.Motor;
import modelo.Motorista;

public class Teste {

	public static void main(String[] args) {
		Motor motor = new Motor("Zetec", 1.0);
		Motorista motorista = new Motorista("40028922");
		Carro carro1 = new Carro("ASX-1234", motor, motorista);
		
		// outra maneira
		

	}

}
