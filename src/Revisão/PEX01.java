/*1-Elabore um programa que calcule o que deve ser pago por um produto, considerando
o pre�o normal de etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos
da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo
adequado.
C�digo Condi��o de pagamento
1 � vista em dinheiro ou cheque, recebe 20% de desconto
2 � vista no cart�o de cr�dito, recebe 15% de desconto
3 Em duas vezes, pre�o normal de etiqueta sem juros
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%*/

package Revis�o;

import java.util.Scanner;

public class PEX01 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler =  new Scanner(System.in);
		int preco, opcao;
		System.out.print("Digite o pre�o do produto: ");
		preco = ler.nextInt();
		System.out.print("Escolha uma op��o de pagamento:\n(1) � vista em dinheiro ou cheque\n(2) � vista no cart�o de cr�dito\n(3) Em duas vezes\n(4) Em tr�s vezes\n");
		opcao = ler.nextInt();
		
		switch(opcao) {
			case 1: 
				System.out.println("Voc� deve pagar R$"+preco*0.8+" pelo produto");
				break;   
			case 2: 
				System.out.println("Voc� deve pagar R$"+preco*0.85+" pelo produto");
				break; 
			case 3: 
				System.out.println("Voc� deve pagar R$"+preco+" pelo produto");
				break;
			case 4: 
				System.out.println("Voc� deve pagar R$"+preco*1.1+" pelo produto");
				break;
			default:
				System.out.println("Op��o Inv�lida !");
		}
	}
}
