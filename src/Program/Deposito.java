package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Construtor;

public class Deposito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposito = 0.00;
		
		
		// Captura de dados.
		System.out.println("BEM VINDO AO CHAVE BANK.");
		System.out.println();
		
		System.out.print("Digite o numero da conta: ");
		int numberConta = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Digite seu nome completo: ");
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
			deposito = sc.nextDouble();
		} else {
			deposito = 0.00;
		}
		
		//chamada do Construtor
		Construtor conta = new Construtor();
		conta.getNumberConta();
		conta.setTitular(titular);
		conta.deposito(deposito);
		
		// Dados bancários
		System.out.println();
		System.out.println("== DADOS BANCARIOS ==");
		System.out.printf("Nome: %s%nNº da conta: %d%nValor de deposito: %.2f", conta.getTitular(), numberConta, conta.getSaldo());
		
		System.out.println();
		System.out.print("Qual valor que gostaria de depositar? ");
		deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		System.out.println();
		System.out.printf("ATUALIZADO:%nNome: %s%nNº da conta: %d%nValor de deposito: %.2f", conta.getTitular(), numberConta, conta.getSaldo());
		
		System.out.println();
		System.out.print("Qual valor que gostaria de sacar? ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println();
		System.out.printf("ATUALIZADO:%nNome: %s%nNº da conta: %d%nValor de deposito: %.2f", conta.getTitular(), numberConta, conta.getSaldo());
		
		
		sc.close();
	}

}
