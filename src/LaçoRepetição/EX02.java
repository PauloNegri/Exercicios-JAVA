/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package LaçoRepetição;

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
		System.out.println("\nForam digitados "+par+" números pares e "+impar+" números ímpares . ");
	}
	
}
