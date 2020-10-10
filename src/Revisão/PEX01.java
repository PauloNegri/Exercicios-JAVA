/*1-Elabore um programa que calcule o que deve ser pago por um produto, considerando
o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos
da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/

package Revisão;

import java.util.Scanner;

public class PEX01 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler =  new Scanner(System.in);
		int preco, opcao;
		System.out.print("Digite o preço do produto: ");
		preco = ler.nextInt();
		System.out.print("Escolha uma opção de pagamento:\n(1) À vista em dinheiro ou cheque\n(2) À vista no cartão de crédito\n(3) Em duas vezes\n(4) Em três vezes\n");
		opcao = ler.nextInt();
		
		switch(opcao) {
			case 1: 
				System.out.println("Você deve pagar R$"+preco*0.8+" pelo produto");
				break;   
			case 2: 
				System.out.println("Você deve pagar R$"+preco*0.85+" pelo produto");
				break; 
			case 3: 
				System.out.println("Você deve pagar R$"+preco+" pelo produto");
				break;
			case 4: 
				System.out.println("Você deve pagar R$"+preco*1.1+" pelo produto");
				break;
			default:
				System.out.println("Opção Inválida !");
		}
	}
}
