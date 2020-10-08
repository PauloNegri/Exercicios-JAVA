/*3 - Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

package LaçoCondicionalPortugol;

import java.util.*;

public class EX03 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3,num4;
		System.out.print("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.print("Digite terceiro número: ");
		num3 = ler.nextInt();
		System.out.print("Digite o quarto número: ");
		num4 = ler.nextInt();
		
		if((Math.pow(num3, 2)) >= 1000){
			System.out.print(Math.pow(num3, 2));
		}else{
			System.out.println("O primeiro númeor é "+num1+" e seu valor ao quadrado é:"+ Math.pow(num1, 2));
			System.out.println("O primeiro númeor é "+num2+" e seu valor ao quadrado é:"+ Math.pow(num2, 2));
			System.out.println("O primeiro númeor é "+num3+" e seu valor ao quadrado é:"+ Math.pow(num3, 2));
			System.out.println("O primeiro númeor é "+num4+" e seu valor ao quadrado é:"+ Math.pow(num4, 2));
		}
	}
	
	
	
}
