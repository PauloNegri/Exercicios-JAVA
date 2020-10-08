/*7-Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/
package LaçoCondicionalPortugol;

import java.util.Scanner;

public class EX07 {
	public static void main (String args[])
		{
			@SuppressWarnings("resource")
			Scanner ler = new Scanner(System.in);
			int altura, base, area;
			System.out.print("Qual a altura do triângulo?");
			altura = ler.nextInt();
			System.out.print("Qual a base do triângulo?");
			base = ler.nextInt();
			if(altura > 0 && base > 0){
				area = (base*altura)/2;		
				System.out.println("A area do seu triângulo é "+ area);
				
			}
			else{
				System.out.print("dados invalidos");
			}
		}
}
