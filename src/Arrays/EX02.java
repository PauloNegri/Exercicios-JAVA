/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/

package Arrays;

import java.util.Scanner;

public class EX02 {
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int[] num = new int[6];
		int impar = 0, somaPar = 0;
		
		for(int i = 0; i < 6; i++) {
			System.out.print("Digite um número: ");
			num[i] = ler.nextInt();
		}
		for(int i = 0; i < 6; i++) {
			if(num[i]%2 == 0) {
				somaPar = num[i] + somaPar;
				System.out.print("\nEsse número é par: "+num[i]);
			}
		} System.out.print("\n=====================================");
		System.out.print("\nA soma de todos eles resulta hein: "+somaPar+"\n");
		for(int i = 0; i < 6; i++) {
			if(num[i]%2 != 0) {
				impar++;
				System.out.print("\nEsse número é ímpar: "+num[i]);
			}
		}System.out.print("\n====================================\n"); 
		System.out.print("No total tivemos "+impar+" números ímpares .");	
	}
}
