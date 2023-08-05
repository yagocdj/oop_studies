package aplicacao;

import modelo.Carro;
import modelo.Motor;
import modelo.Motorista;

public class Teste {

	public static void main(String[] args) {
//		Motor motor = new Motor("Zetec", 70.0);
//		Motorista motorista = new Motorista("40028922");
//		Carro carro1 = new Carro("ASX1234", motor, motorista);
		
		// outra maneira
		Carro carro1 = new Carro("ASX1234",
				new Motor("Zetec", 95.0),
				new Motorista("40028922"));
		
		// Alterar a potência do motor para 105 cavalos
		carro1.getMotor().setPotencia(105.0);
		System.out.println(carro1.getMotor().getPotencia() + " cavalos");
		
		Carro carro2 = new Carro("XYZ2000",
				new Motor("Fire", 106.0),
				carro1.getMotorista());
		
		carro1.getMotorista().setCnh("22222");
		System.out.println("CNH do motorista -> " + carro2.getMotorista().getCnh());
		
		carro1.setMotorista(null);
		carro2.setMotorista(null);
		
		// Criando novos motoristas para os dois carros
		carro1.setMotorista(new Motorista("4444"));
		carro2.setMotorista(new Motorista("5555"));
		
		Carro c1 = new Carro("BAC1234", new Motor("Fire tunado", 200.0), null);
		Carro c2 = new Carro("ABC2345", c1.getMotor(), null);
		Carro c3 = new Carro("DE5679", c1.getMotor(), null);
		
		c2.getMotor().setPotencia(450.0);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
