/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
package LaçoRepetição;

import java.util.Scanner;

public class EX06 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, media, i = 0, soma = 0;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		do {
			if(num % 3 == 0) {
				soma = num + soma;
				i++;
			}
			System.out.print("Digite um número: ");
			num = ler.nextInt();
		
		}while(num !=0);
		media = soma/i;
		System.out.print("\nA media de todos os multiplos de três é: "+ media);
		
	}
}
