/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
package La�oRepeti��o;

import java.util.Scanner;

public class EX06 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, media, i = 0, soma = 0;
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		
		do {
			if(num % 3 == 0) {
				soma = num + soma;
				i++;
			}
			System.out.print("Digite um n�mero: ");
			num = ler.nextInt();
		
		}while(num !=0);
		media = soma/i;
		System.out.print("\nA media de todos os multiplos de tr�s �: "+ media);
		
	}
}
