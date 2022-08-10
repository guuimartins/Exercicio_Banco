package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.construtor;

public class Deposito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("BEM VINDO AO BANCO CHAVE BANK.");
		System.out.println();
		
		System.out.print("Entre com o número de conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Digite seu nome: ");
		String titular = sc.nextLine();
		
		System.out.print("Gostaria de iniciar com um deposito? (s/n): ");
		
		char confDep = sc.next().charAt(0);
		
		
		
		
		sc.close();
	}

}
