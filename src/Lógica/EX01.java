/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e 
dias e mostre-a expressa apenas em dias.*/
package Lógica;

import java.util.*;


public class EX01 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, numDias;
		System.out.println("Quantos anos você tem? ");
		idadeAnos = ler.nextInt();
		System.out.println("Há quantos meses você fez aniversário? ");
		idadeMeses = ler.nextInt();
		System.out.println("Ha quantos dias você completou o ultimo mês? ");
		idadeDias = ler.nextInt();
		numDias = idadeDias + (idadeMeses*30) + (idadeAnos*365);
		System.out.println("Você viveu " + numDias +  " dias");
	}
}
