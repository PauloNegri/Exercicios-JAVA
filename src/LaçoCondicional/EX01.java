//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
package La�oCondicional;

import java.util.*;

public class EX01 {
	public static void main(String args[])
	{
		int num1, num2, num3;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.printf("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.printf("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.printf("Esse � o maior n�mero: %d", num1);
			
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.printf("Esse � o maior n�mero: %d", num2);

		}else if(num3 >= num1 && num3 >= num2) {
			System.out.printf("Esse � o maior n�mero: %d", num3);

		}
	}
}
