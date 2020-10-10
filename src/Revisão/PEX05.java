/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um
código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na
ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente
de 1 e 2, escreva uma mensagem informando que o código inválido.*/
package Revisão;

import java.util.Scanner;

public class PEX05 {
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[5];
		int cod;
		
		for(int i = 0; i < 5 ; i++){
			System.out.print("Digite o "+i+1+"º número: ");
			vetor[i] = ler.nextInt();
		}
		
		System.out.print("Digite um número de opção: \n");
		cod = ler.nextInt();
		
		if(cod == 0){};
		if(cod == 1){
			for(int i = 4; i >= 0; i--){
				System.out.print(vetor[i]+"\n");
			}
		}
		if(cod == 2){
			for(int i = 0; i < 5; i++){
				System.out.print(vetor[i]+"\n");
			}
		}
		if(cod < 0 || cod > 2){
			System.out.print("Código inválido!");
		}
	}
}
