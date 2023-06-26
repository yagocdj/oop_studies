package aplicacao;

import modelo.Conta;
import modelo.ContaEspecial;

public class AppConta {

	public static void main(String[] args) {
		ContaEspecial conta1 = new ContaEspecial(1, "12345678910", 500.0);
		Conta conta2 = new Conta(2, "89012355510");
		
		conta1.creditar(500);
		
		try {
			conta1.debitar(100.0);             // saldo 400
			conta1.transferir(400.0, conta2);  // saldo 0
			conta1.transferir(100.0, conta2);  // saldo -100
			conta1.transferir(500.0, conta2);  // exceção
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(conta1);  // saldo -100
		System.out.println(conta2);  // saldo 500
	}

}
