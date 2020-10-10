/*3 - Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
package Arrays;

import java.util.*;

public class PEX03 {
	public static void main (String args[]) {
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		@SuppressWarnings({ "unused", "resource" })
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		System.out.print("============Essa é a Matriz M1==============================\n");
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				N1[linha][coluna] = gerador.nextInt(5);
				N2[linha][coluna] = gerador.nextInt(4);
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];	
				System.out.print("["+ M1[linha][coluna]+ "]");			
			}
			System.out.print ("\n")	;	
		}
		System.out.print("============Essa é a Matriz M2==============================\n");
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				N1[linha][coluna] = gerador.nextInt(5);
				N2[linha][coluna] = gerador.nextInt(4);
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];	
				System.out.print("["+ M1[linha][coluna]+ "]");			
			}
			System.out.print ("\n")	;	
		}
	}
}
