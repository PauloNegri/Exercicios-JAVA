/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
package L�gica;

import java.util.Scanner;

public class EX03 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int tempo, horas, minutos, segundos, resHoras,resMinutos;
		System.out.println("\"Quantos segundos de dura��o esse evento teve?");
		tempo = ler.nextInt();
		horas=tempo/3600;
		resHoras=tempo%3600;
		minutos=resHoras/60;
		resMinutos=resHoras%60;
		segundos=resMinutos;
		System.out.println("O evento durou exatamente: " + horas + ":" + minutos + ":" + segundos + ".");
	}
}
