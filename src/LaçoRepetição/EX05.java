/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
package La�oRepeti��o;

import java.util.Scanner;

public class EX05 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		
		do {
			soma = soma + num;
			System.out.print("Digite um n�mero: ");
			num = ler.nextInt();
		
		}while(num !=0);
		System.out.print("\nA soma de todos os n�meros �: "+ soma);
		
	}
}
