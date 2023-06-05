
/*
 *
 *IFPB - POO
 *Fausto Ayres
 *
 */

public class Teste1 {
	public static void main(String[] args)	{	

		Conta conta1;
		Conta conta2;

		conta1 = new Conta("101", "1111111");
		conta2 = new Conta("102", "2222222");
		conta1.creditar(300.0);
		try {
			conta1.debitar(500);
		}
		catch(Exception erro) {
			System.out.println(erro.getMessage());
			//erro.printStackTrace();
		}

		System.out.println("SALDOS INICIAIS");
		System.out.println(conta1);
		System.out.println(conta2);

		try {
			conta1.transferir(1000, conta2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		conta2.transferir(50, conta1);

		System.out.println("\nSALDOS APOS TRANSFERENCIA");
		System.out.println(conta1);
		System.out.println(conta2);



	}
}