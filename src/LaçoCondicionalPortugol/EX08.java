/*8 -Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma
for maior que 100, caso contr�rio imprimi-la com o valor zero.*/

package La�oCondicionalPortugol;

import java.util.Scanner;

public class EX08 {
	public static void main (String args[])
		{
			@SuppressWarnings("resource")
			Scanner ler = new Scanner(System.in);
			int N;
			System.out.print("Digite um n�mero: ");
			N = ler.nextInt();
			
			if(N > 100){
				System.out.print(N);
			}else{
				System.out.print("0");
			}
		}
}
