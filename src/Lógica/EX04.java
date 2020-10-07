/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = (R +S/2), onde R=(A+B)^2  S=(B+C)^2*/
package Lógica;

import java.util.Scanner;
import java.lang.Math;

public class EX04 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int A, B, C, R, S, D;
		System.out.println("Digite o valor de A: ");
		A = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		B = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		C = ler.nextInt();
		R = (int) Math.pow((A+B), 2);
		S = (int) Math.pow((B+C), 2);
		D = (R+S)/2;
		System.out.println("O valor de D é: "+D);
		
	}
}

