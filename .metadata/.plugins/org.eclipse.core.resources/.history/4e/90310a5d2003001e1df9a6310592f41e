package oop_classes;


public class Teste {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(5);
		System.out.println(r.calculateArea());
		
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
		
	}

}
