package oop_classes;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta("123", "00011122233");
		Conta conta2 = new Conta("456", "12345678900");
		
		conta1.creditar(300.0);
		conta1.debitar(100.0);
		conta1.creditar(200.0);
		
		System.out.println("\nSaldo da conta 1: " + conta1.getSaldo() + "\nSaldo da conta 2: " + conta2.getSaldo());
		
		conta2.creditar(500.0);
		
		System.out.println("\nSaldo da conta 1: " + conta1.getSaldo() + "\nSaldo da conta 2: " + conta2.getSaldo());
		
		conta2.transferir(150.0, conta1);
		
		System.out.println("\nSaldo da conta 1: " + conta1.getSaldo() + "\nSaldo da conta 2: " + conta2.getSaldo());
		
		conta1.transferir(150.0, conta2);
		
		System.out.println("\nSaldo da conta 1: " + conta1.getSaldo() + "\nSaldo da conta 2: " + conta2.getSaldo());
		System.out.println("\nA conta 2 estah vazia? " + conta2.vazia());
		
		// Making "conta2" be empty
		conta2.transferir(500, conta1);
		
		System.out.println("A conta 2 estah vazia? " + conta2.vazia());
		
		// Recovering the balance of "conta2"
		conta1.transferir(500, conta2);
		
		Conta conta3 = conta2.clonar();
		System.out.println(conta2);
		System.out.println(conta3);
		
	}

}
