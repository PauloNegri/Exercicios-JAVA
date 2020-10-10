/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

package Arrays;

import java.util.Scanner;

public class PEX02 {
	public static void main (String args[]) {
		int[] dado = new int[10];
		int i, media = 0, maior = 0 , j = 0;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		for(i = 0; i < 10; i++){
			System.out.print("Digite a pontua��o do dado: ");
			dado[i] = ler.nextInt();
			
			if(dado[i] <= 6 && dado[i] > 0){
				media = media + dado[i];
				if(maior < dado[i]){
					maior = dado[i];
				} 
			}
			else{
				System.out.print("N�mero n�o compete a valores de um dado!\n");
				i--;
			}
		}
		for(i = 0; i < 10; i++){
			System.out.print("O "+(i+1)+"� lan�amento foi de "+dado[i]+" pontos.\n");
			if(maior == dado[i]){
					j++;
				}
		}
		System.out.print("A media dos lan�amentos foi de "+( media/i)+" e a maior pontua��o foi de "+maior+" pontos, alcan�ada "+j+" vezes.");
	}
}


