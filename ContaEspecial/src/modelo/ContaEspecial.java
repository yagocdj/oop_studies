package modelo;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);

		this.limite = limite < 0 ? limite * -1 : limite;
	}
	
	@Override
	public void debitar(double valor) throws Exception {
		if (super.getSaldo() + this.limite - valor < 0)
			throw new Exception("O valor a ser debitado excede o limite desta conta.");
		super.setSaldo(super.getSaldo() - valor);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nlimite = " + this.limite;
	}
}
