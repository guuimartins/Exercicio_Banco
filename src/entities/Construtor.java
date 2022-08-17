package entities;

public class Construtor {
	
	private String titular;
	private int numberConta;
	private double saldo;
	
	public Construtor(String titular, int numberConta, double depositoInicial) {
		this.titular = titular;
		this.numberConta = numberConta;
		deposito(depositoInicial);
	}
	
	public Construtor(String titular, int numberConta) {
		this.titular = titular;
		this.numberConta = numberConta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumberConta() {
		return numberConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	public void saque(double saque) {
		this.saldo -= saque + 5.00;
	}
	
	public String toString() {
		return "Conta "
				+ numberConta
				+ " Titular: "
				+ titular
				+ " Saldo R$: "
				+ String.format("%.2f", saldo);
	}
	
}
