package entities;

public class construtor {
	
	private int conta;
	private String titular;
	private double saldo;
	
	public void deposito(int conta, String titular, double deposito, double saldo) {
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void deposito(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double Saldo(double saldo) {
		return saldo += saldo;
	}
	public void saque(double saque) {
		this.saldo = saque - saldo - 5.00;
	}
	
	
	
}
