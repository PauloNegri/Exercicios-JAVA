/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

package Arrays;

import java.util.Scanner;

public class PEX01 {
	public static void main (String args[]) {
		int[] num = new int[5];
		int i, maior = 0;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
			
		for(i = 0; i < 5; i++){
			System.out.print("Digite a 0"+(i+1)+"� pontua��o: ");
			num[i] = ler.nextInt();		
		}
		for(i = 0; i < 5; i++){
			System.out.print("A "+(i+1)+"� pontua��o foi de "+num[i]+".\n");
			if(maior < num[i]){
				maior = num[i];
			}
		}
		System.out.print("=============================================================\n");
		System.out.print("A maior pontua��o foi de "+maior+" pontos.");
		System.out.print("\n=============================================================");
	}
}
