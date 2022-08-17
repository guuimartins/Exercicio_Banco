package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Construtor;

public class Deposito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Construtor conta;
		
		// Captura de dados.
		System.out.println("BEM VINDO AO CHAVE BANK.");
		System.out.println();
		
		System.out.print("Digite o numero da conta: ");
		int numberConta = sc.nextInt();
		
		System.out.print("Digite seu nome completo: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Gostaria de realizar um deposito? (s/n) ");
		char accept = sc.next().charAt(0);
		
		//forçar cliente a digitar caracter correto.
		while(accept != 's' && accept != 'n') {
			System.out.print("Opção invalido. Apenas 'S' para sim ou 'N' para não. ");
			accept = sc.next().charAt(0);
		}
		
		if(accept == 's') {
			System.out.print("Digite o valor que gostaria de depositar: ");
			double depositoInicial = sc.nextDouble();
			conta = new Construtor(titular, numberConta, depositoInicial);
		} 
		else {
			conta = new Construtor(titular, numberConta);
		}
		
		
		// Movimentação de conta
		System.out.println();
		System.out.println(conta);

		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Conta atualizada");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Conta atualizada");
		System.out.println(conta);
		
		sc.close();
	}

}
