/* Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.*/

package La�oRepeti��o;

import java.util.Scanner;

public class PEX06 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int  num, soma = 0;
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		do{
			soma = soma + num;
			num = num-1;
		}while(num > 0);
		System.out.print(soma);
	}
}
