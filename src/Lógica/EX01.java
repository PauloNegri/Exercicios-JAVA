/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e 
dias e mostre-a expressa apenas em dias.*/
package L�gica;

import java.util.*;


public class EX01 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, numDias;
		System.out.println("Quantos anos voc� tem? ");
		idadeAnos = ler.nextInt();
		System.out.println("H� quantos meses voc� fez anivers�rio? ");
		idadeMeses = ler.nextInt();
		System.out.println("Ha quantos dias voc� completou o ultimo m�s? ");
		idadeDias = ler.nextInt();
		numDias = idadeDias + (idadeMeses*30) + (idadeAnos*365);
		System.out.println("Voc� viveu " + numDias +  " dias");
	}
}
