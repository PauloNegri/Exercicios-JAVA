/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

package La�oRepeti��o;

import java.util.*;

public class EX02 {
	public static void main (String args[]) {
		Random gerador = new Random();
		int num, par = 0, impar = 0;
		
		for(int i = 0; i < 10; i++) {
			num = gerador.nextInt(100);
			System.out.printf(num+", ");
			if(num%2==0) {
				par++;
			}else if(num%2!=0) {
				impar++;
			}
		}
		System.out.println("\nForam digitados "+par+" n�meros pares e "+impar+" n�meros �mpares . ");
	}
	
}
