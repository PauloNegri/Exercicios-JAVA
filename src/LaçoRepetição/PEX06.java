/* Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.*/

package LaçoRepetição;

import java.util.Scanner;

public class PEX06 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int  num, soma = 0;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		do{
			soma = soma + num;
			num = num-1;
		}while(num > 0);
		System.out.print(soma);
	}
}
