//2- Faça um programa que entre com três números e coloque em ordem crescente.
package LaçoCondicional;

import java.util.*;

public class EX02 {
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
			System.out.print(num1);
			if(num2 >= num3) {
				System.out.println("\n"+num2+"\n"+num3);
			}else if(num3 >= num2) {
				System.out.println("\n"+num3+"\n"+num2);
			}
			
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.print(num2);
			if(num1 >= num3) {
				System.out.println("\n"+num1+"\n"+num3);
			}else if(num3 >= num1) {
				System.out.println("\n"+num3+"\n"+num1);
			}	

		}else if(num3 >= num1 && num3 >= num2) {
			System.out.print(num3);
			if(num2 >= num1) {
				System.out.println("\n"+num2+"\n"+num1);
			}else if(num1 >= num2) {
				System.out.println("\n"+num1+"\n"+num2);
			}
		}
	}
}
