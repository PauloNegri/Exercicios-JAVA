/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

package Arrays;

import java.util.Scanner;

public class PEX02 {
	public static void main (String args[]) {
		int[] dado = new int[10];
		int i, media = 0, maior = 0 , j = 0;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		for(i = 0; i < 10; i++){
			System.out.print("Digite a pontuação do dado: ");
			dado[i] = ler.nextInt();
			
			if(dado[i] <= 6 && dado[i] > 0){
				media = media + dado[i];
				if(maior < dado[i]){
					maior = dado[i];
				} 
			}
			else{
				System.out.print("Número não compete a valores de um dado!\n");
				i--;
			}
		}
		for(i = 0; i < 10; i++){
			System.out.print("O "+(i+1)+"º lançamento foi de "+dado[i]+" pontos.\n");
			if(maior == dado[i]){
					j++;
				}
		}
		System.out.print("A media dos lançamentos foi de "+( media/i)+" e a maior pontuação foi de "+maior+" pontos, alcançada "+j+" vezes.");
	}
}


