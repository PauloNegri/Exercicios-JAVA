/*7-Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.*/
package La�oCondicionalPortugol;

import java.util.Scanner;

public class EX07 {
	public static void main (String args[])
		{
			@SuppressWarnings("resource")
			Scanner ler = new Scanner(System.in);
			int altura, base, area;
			System.out.print("Qual a altura do tri�ngulo?");
			altura = ler.nextInt();
			System.out.print("Qual a base do tri�ngulo?");
			base = ler.nextInt();
			if(altura > 0 && base > 0){
				area = (base*altura)/2;		
				System.out.println("A area do seu tri�ngulo � "+ area);
				
			}
			else{
				System.out.print("dados invalidos");
			}
		}
}
