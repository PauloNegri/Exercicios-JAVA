/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package La�oCondicional;

import java.util.*;

public class EX04 {
	public static void main(String args[])
	{
		int num;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite o primeiro n�mero: ");
		num = ler.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("Esse n�mero � �mpar e sua potencia��o �, "+ Math.pow(num,2) );
		}else if(num % 2 == 0) {
			System.out.println("Esse n�mero � par e sua ra�z quadrada �, "+ Math.sqrt(num));
		}
	}
}
