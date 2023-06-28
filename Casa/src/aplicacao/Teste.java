package aplicacao;

import modelo.Aluguel;
import modelo.Casa;
import modelo.Endereco;
import modelo.Pessoa;

public class Teste {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao da Silva", "123.000.555-99");
		// nome cpf
		Pessoa maria = new Pessoa("Maria de Sousa", "222.101.666-32");
		// nome cpf
		Endereco enderecoCasa = new Endereco("R. Primeiro de Maio", 45, "Jaguaribe");
		
		Casa casa = new Casa(joao, enderecoCasa, 800000.0);
		// proprietario, endenreco, bairro, precovenda
		
		Aluguel alug1 = new Aluguel(casa, maria);  // casa, inquilino
		
		double valor = alug1.getValorAluguel();
		System.out.println(valor + " reais");  // 2400.0 (0.003 * 800000.0)
	}

}
