package aplicacao;

import modelo.Convidado;
import modelo.Participante;

public class Teste {

	public static void main(String[] args) {
		Participante joao = new Participante("joao@gmail.com", "Joao", 17);
		Participante maria = new Participante("maria@gmail.com", "Maria", 30);
		Participante pedro = new Participante("pedro@gmail.com", "Pedro", 70);
		Convidado paulo = new Convidado("paulo@gmail.com", "Paulo", 17, "empresa1");
		Convidado katia = new Convidado("katia@gmail.com", "Katia", 30, "empresa2");
		Convidado antonio = new Convidado("antonio@gmail.com", "Antonio", 70, "empresa2");
		
		double valorDoEvento = 1000.0;
		System.out.println("\nValores pagos pelos participantes para um evento de 1000 reais");
		System.out.println("joao = R$"+joao.getValorPago(valorDoEvento));
		System.out.println("maria = R$"+maria.getValorPago(valorDoEvento));
		System.out.println("pedro = R$"+pedro.getValorPago(valorDoEvento));
	
		System.out.println("\nValores pagos pelos convidados para um evento de 1000 reais");
		System.out.println("paulo = R$"+paulo.getValorPago(valorDoEvento));
		System.out.println("katia = R$"+katia.getValorPago(valorDoEvento));
		System.out.println("antonio = R$"+antonio.getValorPago(valorDoEvento));
	}

}
