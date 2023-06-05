/**
 * IFPB - TSI - POO <br>
 * prof. Fausto Ayres
 * 
 */
public class Conta {
	private String numero;
	private String cpf;
	private double saldo;

	/**
	 * construtor
	 */
	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo=0;
	}

	public void creditar(double valor) {
		saldo = saldo + valor;
	}

	public void debitar(double valor) throws Exception{
		if(valor > saldo)
			//System.out.println("saldo nao pode ficar negativo");
			throw new Exception("saldo nao pode ficar negativo ao debitar");

		saldo = saldo - valor;
	}

	public void transferir(double valor, Conta destino) throws Exception {
		if (this == destino)
			throw new Exception("Erro -> as contas de origem e destino são as mesmas.");
		this.debitar(valor);
		destino.creditar(valor);
	}

	public void creditar(double... lista) {
		for(double valor : lista)
			saldo = saldo + valor;
	}

	public boolean vazia() {
		//		if(saldo == 0)
		//			return true;
		//		else 
		//			return false;
		return saldo==0;
	}

	public Conta clonar() {
		Conta novaconta = new Conta(this.numero, this.cpf);
		novaconta.creditar(this.saldo);
		return novaconta;
	}
	@Override
	public String toString() {
		return 	" numero=" + numero + 
				" cpf=" + cpf + 
				" saldo=" + saldo ;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

}
