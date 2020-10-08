/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
package LaçoRepetição;

import java.util.Scanner;

public class EX05 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		do {
			soma = soma + num;
			System.out.print("Digite um número: ");
			num = ler.nextInt();
		
		}while(num !=0);
		System.out.print("\nA soma de todos os números é: "+ soma);
		
	}
}
