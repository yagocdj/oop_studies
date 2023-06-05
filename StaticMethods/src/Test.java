
public class Test {

	public static void main(String[] args) {
		
		double raio = 2.0;
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("Area = " + area + "m^2");
		
		int idade = Integer.parseInt("20");
		System.out.println("Idade = " + idade + " anos");
		
		// Integer.parseInt -> parseInt é um método estático.
		// "out" do System.out.println -> atributo estático.
		
		Empregado maria = new Empregado(3); // 3 salários
		Empregado joao = new Empregado(2);  // 2 salários
		
		Empregado.minimo = 1100;
		
		System.out.println(maria.getSalario());
		System.out.println(joao.getSalario());
		
		/* IMPORTANTE -> método estático não chama
		 * método comum dentro da mesma classe.
		 * 
		 * O método 'outra_tarefa()' é 'static'.
		 */
		outra_tarefa();

	}
	
	public static void outra_tarefa() {
		System.out.println("Sou um mehtodo estahtico.");
	}

}
