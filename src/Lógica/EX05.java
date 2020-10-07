/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
package Lógica;

import java.util.Scanner;

public class EX05 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in) ;
		int nota1,nota2,nota3,mediaFinal;
		System.out.println("Digite sua primeira nota: ");
		nota1 = ler.nextInt();
		System.out.println("Digite sua segunda nota: ");
		nota2 = ler.nextInt();
		System.out.println("Digite sua terceira nota: ");
		nota3 = ler.nextInt();
		mediaFinal=((nota1*2+nota2*3+nota3*5)/(2+3+5));
		System.out.println("Sua media é "+ mediaFinal);
	}
}

