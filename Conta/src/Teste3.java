
/*
 *
 *IFPB - POO
 *Fausto Ayres
 *
 */

public class Teste3 {
	public static void main(String[] args)	{	

//		Conta conta1 = new Conta("333","123456");
		Conta conta1 = null;
		System.out.println(conta1.vazia());
		
		conta1.creditar(300.0);
		
		Conta conta2 = conta1.clonar();

		System.out.println(conta1); //300
		System.out.println(conta2); //300
		try {
			conta1.transferir(0, conta1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}}
