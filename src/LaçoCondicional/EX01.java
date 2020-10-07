//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
package LaçoCondicional;

import java.util.*;

public class EX01 {
	public static void main(String args[])
	{
		int num1, num2, num3;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.printf("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.printf("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.printf("Esse é o maior número: %d", num1);
			
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.printf("Esse é o maior número: %d", num2);

		}else if(num3 >= num1 && num3 >= num2) {
			System.out.printf("Esse é o maior número: %d", num3);

		}
	}
}
