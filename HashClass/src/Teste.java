import java.util.HashMap;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {
		
		HashMap<String, Double> gastos = new HashMap<>(); 
		String[] mesesDoAno = {
			"jan", "fev", "mar", "abr", "mai", "jun",
			"jul", "ago", "set", "out", "nov", "dez"
		};
		
		for (String mes : mesesDoAno) {
			gastos.put(mes, 5.0);
		}
		
		// Exibindo o gasto de setembro
		System.out.println("Gasto do mes de setembro = " +	gastos.get("set") + " reais");
		
		// Alterar o gasto de fevereiro para o dobro do gasto de janeiro
		gastos.put("fev", gastos.get("jan") * 2);
		System.out.println("Gasto do mes de fevereiro = " + gastos.get("fev") + " reais");
		
		// Calcular a soma total dos gastos
		double gastoTotal = 0.0;
		for (double valor : gastos.values())
			gastoTotal += valor;
		
		System.out.println("Soma total dos gastos = " + gastoTotal + " reais");
		
		// Exibir todos os valores dos gastos
		for (Map.Entry<String, Double> entrada : gastos.entrySet())
			System.out.println(entrada.getKey() + " | " + entrada.getValue());

	}

}
