/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

package Arrays;

import java.util.*;

public class PEX04 {
	public static void main (String args[]) {
		Random gerador = new Random();
		int soma = 0 , diagonal;
		int[][]matriz = new int [3][3];
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = gerador.nextInt(9);
				soma = soma + matriz[linha][coluna];
				System.out.print("["+matriz[linha][coluna]+ "]");
			}
			System.out.print ("\n");
		}
		diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.print("A soma de todos os valores da Matirz resulta em "+soma);
		System.out.print(" e a soma de sua principal diagonal resulta em "+diagonal+".");
	}
}
