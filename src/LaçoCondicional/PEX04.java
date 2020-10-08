/*4-Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/
package LaçoCondicional;

import java.util.Scanner;

public class PEX04 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.print("O número digitado é positivo e par");
		}else if(num > 0 && num%2!=0) {
			System.out.print("O número digitado é positivo e ímpar");
		}else if(num < 0 && num%2==0) {
			System.out.print("O número digitado é negativo e par");
		}else if(num < 0 && num%2!=0) {
			System.out.print("\"O número digitado é negativo e ímpar");
		}else {
			System.out.print("O número digitado é zero");
		}
	}
}
