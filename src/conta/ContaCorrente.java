package conta;

import setup.contaCliente;
import java.util.Scanner;

public class ContaCorrente {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		contaCliente contaCliente;
		
		System.out.print("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.print("Digite o numero de sua conta:");
		int conta = sc.nextInt();
		contaCliente = new contaCliente(nome,conta,0);
		System.out.println();
		
		
		System.out.print("Deseja fazer um deposito inicial?[s/n]");
		char option = sc.next().charAt(0);
		if(option == 's') {
			System.out.print("Digite o valor:");
			double value = sc.nextDouble();
			contaCliente = new contaCliente(nome,conta,value);
			System.out.println(contaCliente);
		}else {
			contaCliente = new contaCliente(nome,conta,0.0f);
		}
		System.out.println();
		System.out.print("Deseja fazer um saque?[s/n]");
		char option2 = sc.next().charAt(0);
		if(option2 == 's') {
			System.out.print("Digite o valor para saque:");
			double sq = sc.nextDouble();
			contaCliente.saqueConta(sq);
		}else if(option2 == 'n') {
			System.out.println("Obrigado por utilizar nossos servicos!");
		}else {
			System.out.println("Opcao Invalida!");
		}
		
		System.out.println();
		System.out.println(contaCliente);
		
		
		sc.close();
	}

}
