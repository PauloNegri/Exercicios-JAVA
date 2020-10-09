/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package Arrays;

import java.util.Scanner;

public class EX03 {
	public static void main (String args[]) {
		int[][] matriz = new int[3][3];
		int soma = 0;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
				
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matriz[linha][coluna] = ler.nextInt();
				if(matriz[linha][coluna] > 10) {
					soma = soma + matriz[linha][coluna];
				}
			}
		}System.out.print("Soma dos valores : "+soma);
	}
}
