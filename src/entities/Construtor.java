package entities;

public class Construtor {
	
	private String titular;
	private int numberConta;
	private double saldo;

	public Construtor() {
		
	}
	
	public Construtor(String titular, int numberConta, double saldo) {
		this.titular = titular;
		this.numberConta = numberConta;
		this.saldo = saldo;
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
	public void setNumberConta(int numberConta) {
		this.numberConta = numberConta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	public void saque(double saque) {
		this.saldo = saldo - saque - 5.00;
	}
	
	
}
