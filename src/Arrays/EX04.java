/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/

package Arrays;

import java.util.Scanner;

public class EX04 {
	public static void main(String args[]) {
		int opcao, constante;
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
				
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matriz1[linha][coluna] = ler.nextInt();
			}	
		}
		
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matriz2[linha][coluna] = ler.nextInt();
			}	
		}
		
		System.out.print("Menu de Opções\n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\r\n(4) imprimir as matrizes");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
			for(int linha = 0; linha < 2; linha++) {
				for(int coluna = 0; coluna < 2; coluna++) {
					matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna] ;
				}
			}	
		}else if(opcao == 2) {
			for(int linha = 0; linha < 2; linha++) {
				for(int coluna = 0; coluna < 2; coluna++) {
					matriz3[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna] ;
				}
			}	
		} else if(opcao == 3) {
			System.out.print("Digite uma constante: ");
			constante = ler.nextInt();
			for(int linha = 0; linha < 2; linha++) {
				for(int coluna = 0; coluna < 2; coluna++) {
					matriz1[linha][coluna] = matriz1[linha][coluna] + constante ;
					matriz2[linha][coluna] = matriz2[linha][coluna] + constante ;
				}
			}	
		} else if(opcao == 4) {
			System.out.print("Primeira Matriz");
			System.out.print("\n");
			for(int linha = 0; linha < 2; linha++) {
				for(int coluna = 0; coluna < 2; coluna++) {
					System.out.print(matriz1[linha][coluna]+" ");
				}System.out.println();
			}
			System.out.print("Segunda Matriz");
			System.out.print("\n");
			for(int linha = 0; linha < 2; linha++) {
				for(int coluna = 0; coluna < 2; coluna++) {
					System.out.print(matriz2[linha][coluna]+" ");
				}System.out.println();
			}	
		} 
	}
}
