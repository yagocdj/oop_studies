import java.util.ArrayList;

public class Calculadora {
	
	public static ArrayList<String> historico = new ArrayList<>();
	
	private Calculadora() { }
	
	public static double somar(double a, double b) {
		double resultado = a + b; 
		Calculadora.historico.add(String.format("%s + %s = %s", a,b,resultado));
		return resultado;
	}
	
	public static double subtrair(double a, double b) {
		double resultado = a - b;
		Calculadora.historico.add(String.format("%s - %s = %s", a,b,resultado));
		return resultado;
	}
	
	public static double multiplicar(double a, double b) {
		double resultado = a * b;
		Calculadora.historico.add(String.format("%s * %s = %s", a,b,resultado));
		return resultado;
	}
	
	public static double dividir(double a, double b) {
		double resultado = a / b;
		Calculadora.historico.add(String.format("%s / %s = %s", a,b,resultado));
		return resultado;
	}
	
	public static ArrayList<String> historico() {
		ArrayList<String> operacoes = new ArrayList<>();
		
		for (String operacao : historico)
			operacoes.add(operacao);
		return operacoes;
	}
	
	// Teste
	public static void main(String[] args) {
		System.out.println(Calculadora.somar(1, 5));
		System.out.println(Calculadora.subtrair(5, 4));
		System.out.println(Calculadora.multiplicar(5, 4));
		System.out.println(Calculadora.dividir(4, 2));
		
		System.out.println(Calculadora.historico());
	}
}
