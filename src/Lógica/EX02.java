/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
package L�gica;

import java.util.Scanner;

public class EX02 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, numDias, numMeses;
		System.out.println("Quantos dias voc� viveu? ");
		numDias = ler.nextInt();
		idadeAnos = numDias/365;
		numMeses = numDias%365;
		idadeMeses = numMeses/12;
		idadeDias = numMeses%12;
		System.out.println("Voc� tem "+ idadeAnos + " Anos," +  idadeMeses + " meses e " + idadeDias + " dias de vida.");
		
	}
	

}
