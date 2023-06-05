
/*
 *
 *IFPB - POO
 *Fausto Ayres
 *
 */

public class Teste2 {
	public static void main(String[] args)	{	
		Conta conta1;
		conta1= new Conta("101", "1111111");
		conta1.creditar(100.0);			  		//1
		conta1.creditar(200.0, 50.0);		  	//2
		conta1.creditar(100.0, 300.0, 100.0);	//3

		System.out.println(conta1);

	}
}