/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package LaçoCondicional;

import java.util.*;

public class EX04 {
	public static void main(String args[])
	{
		int num;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite o primeiro número: ");
		num = ler.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("Esse número é ímpar e sua potenciação é, "+ Math.pow(num,2) );
		}else if(num % 2 == 0) {
			System.out.println("Esse número é par e sua raíz quadrada é, "+ Math.sqrt(num));
		}
	}
}
