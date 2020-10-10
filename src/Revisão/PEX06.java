/*Fa�a um programa que l� um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
Em seguida o programa deve fazer a multiplica��o do vetor pelas colunas da matriz.*/
package Revis�o;

import java.util.*;

public class PEX06 {
	public static void main (String args[]) {
		@SuppressWarnings({ "resource", "unused" })
		Scanner ler = new Scanner(System.in);
		Random u = new Random();
		int[] vetor = new int[3];
		int[][] matriz = new int[3][3];
		int[][] resul = new int[3][3];
		
		System.out.print("\n======= Esse � o valor do Vetor =======\n");
		for(int i = 0; i < 3; i++){
			vetor[i] = u.nextInt(9);
			System.out.print(vetor[i]);
			System.out.print("\n");
		}
		System.out.print("\n======= Esse � o valor da Matriz =======\n");
		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 3; c++){
				matriz[l][c] = u.nextInt(9);
				System.out.print(matriz[l][c]+" ");
				
			}
			System.out.print("\n");
		}
		System.out.print("======= Essa � a matriz resultado da multiplica��o de ambos =======\n");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				resul[i][j] = vetor[i] * matriz[i][j];
						System.out.print(resul[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
