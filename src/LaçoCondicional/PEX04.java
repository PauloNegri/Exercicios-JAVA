/*4-Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo.*/
package La�oCondicional;

import java.util.Scanner;

public class PEX04 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.print("O n�mero digitado � positivo e par");
		}else if(num > 0 && num%2!=0) {
			System.out.print("O n�mero digitado � positivo e �mpar");
		}else if(num < 0 && num%2==0) {
			System.out.print("O n�mero digitado � negativo e par");
		}else if(num < 0 && num%2!=0) {
			System.out.print("\"O n�mero digitado � negativo e �mpar");
		}else {
			System.out.print("O n�mero digitado � zero");
		}
	}
}
