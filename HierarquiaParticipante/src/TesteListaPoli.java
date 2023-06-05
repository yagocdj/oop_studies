import java.util.ArrayList;
import java.util.function.Predicate;

public class TesteListaPoli {

	public static void main(String[] args) {
		Participante joao = 	new Participante("joao@gmail.com", "joao", 17);
		Participante maria = 	new Participante("maria@gmail.com", "maria", 30);
		Participante pedro = 	new Participante("pedro@gmail.com", "pedro", 70);
		Convidado paulo = 		new Convidado("paulo@gmail.com", "paulo",  17, "empresa1");
		Convidado katia = 		new Convidado("katia@gmail.com", "katia",  30, "empresa2");
		Convidado antonio =		new Convidado("antonio@gmail.com", "antonio",  70, "empresa2");
		
		// Criar a lista polimorfica
		ArrayList<Participante> lista = new ArrayList<>();
		
		// Adicionar os objetos na lista
		lista.add(antonio);
		lista.add(joao);
		lista.add(katia);
		lista.add(maria);
		lista.add(paulo);
		lista.add(pedro);
		
		// Algoritmos
		double total = 0.0;
		double precoPago = 1000.0;
		int qtdGratuidades = 0;
		int idade = 0;
		ArrayList<Participante> consultaIdade = new ArrayList<>();
		ArrayList<Convidado> convidadosEmpresa2 = new ArrayList<>();
		// ArrayList<Participante> listaMenor60 = new ArrayList<>();
		
		
		for (Participante p : lista) {
			// Calcular e imprimir a soma do valor total arrecadado por todos
			total += p.getValorPago(precoPago);
		
			// Calcular e imprimir a quantidade de gratuidades
			if (p.getValorPago(precoPago) == 0.0)
				qtdGratuidades++;
			
			// Obter a lista de objetos com idade entre 17 e 30 anos 
			idade = p.getIdade();
			if (idade >= 17 && idade <= 30)
				consultaIdade.add(p);
			
			// Obter a lista de convidados da empresa2
			if (p instanceof Convidado && ((Convidado) p).getEmpresa().equals("empresa2"))
				convidadosEmpresa2.add((Convidado) p);
			
			// if (p.getIdade() < 60)
				// listaMenor60.add(p);
		}
		
		// Remover da lista os objetos com idade maior que 60
//		lista.removeIf(new Predicate<Participante>() {
//			public boolean test(Participante p) {
//				return p.getIdade() > 60;
//			}
//		});
		
//		Predicate<Participante> predicate = new Predicate<Participante>() {
//			public boolean test(Participante p) {
//				return p.getIdade() > 60;
//			}
//		};
//		lista.removeIf( predicate );
		
		lista.removeIf(p -> p.getIdade() > 60);

		// lista = listaMenor60;
	
		System.out.println(String.format("Total pago por todes%nR$%.2f",  total));  // R$3100.0
		System.out.println(String.format("%nQuantidade de gratuidades%n%s", qtdGratuidades));  // 1
		System.out.println(String.format("%nParticipantes (participantes e convidades) com idade entre 17 e 30 anos:%n%s", consultaIdade));  //  joao, maria, paulo, katia
		System.out.println(String.format("%nConvidados da empresa2%n%s" , convidadosEmpresa2));
		System.out.println(String.format("%nLista apos a remocao dos participantes com mais de 60 anos%n%s", lista));
	}
}
