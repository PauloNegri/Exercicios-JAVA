/*Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, um
c�digo inteiro. Se o c�digo for zero, finalize o programa; se for 1, mostre o vetor na
ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o c�digo for diferente
de 1 e 2, escreva uma mensagem informando que o c�digo inv�lido.*/
package Revis�o;

import java.util.Scanner;

public class PEX05 {
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[5];
		int cod;
		
		for(int i = 0; i < 5 ; i++){
			System.out.print("Digite o "+i+1+"� n�mero: ");
			vetor[i] = ler.nextInt();
		}
		
		System.out.print("Digite um n�mero de op��o: \n");
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
			System.out.print("C�digo inv�lido!");
		}
	}
}
