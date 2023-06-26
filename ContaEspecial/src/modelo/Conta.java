package modelo;

public class Conta {
	private int numero;
	private String cpf;
	private double saldo;
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0.0;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public void debitar(double valor) throws Exception {
		if (valor > this.saldo)
			throw new Exception("Saldo insuficiente na conta de origem.");

		this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) throws Exception {
		this.debitar(valor);
		destino.creditar(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(double valor) {
		this.saldo = valor;
	}

	@Override
	public String toString() {
		return "\nConta\nnumero = " + numero + "\ncpf = " + cpf + "\nsaldo = " + saldo;
	}
	
	
}
