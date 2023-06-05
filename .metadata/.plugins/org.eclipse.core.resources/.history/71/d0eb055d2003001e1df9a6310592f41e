package oop_classes;

public class Conta {
	private String numero;
	private String cpf;
	private double saldo;

	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;  // It can be omitted
	}
	
	public boolean vazia() {
		return this.saldo == 0;
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) {
		this.debitar(valor);
		destino.creditar(valor);
	}
	
	public Conta clonar() {
		Conta clone = new Conta(this.numero, this.cpf);
		clone.creditar(saldo);
		
		return clone;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String novo_numero) {
		this.numero = novo_numero;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String novo_cpf) {
		this.cpf = novo_cpf;
	}
	
	public String toString() {
		return "Numero -> " + numero + ", CPF -> " + cpf + ", saldo -> " + saldo;
	}
 }
