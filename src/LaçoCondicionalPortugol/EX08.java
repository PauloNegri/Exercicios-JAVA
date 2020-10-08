/*8 -Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.*/

package LaçoCondicionalPortugol;

import java.util.Scanner;

public class EX08 {
	public static void main (String args[])
		{
			@SuppressWarnings("resource")
			Scanner ler = new Scanner(System.in);
			int N;
			System.out.print("Digite um número: ");
			N = ler.nextInt();
			
			if(N > 100){
				System.out.print(N);
			}else{
				System.out.print("0");
			}
		}
}
