/*Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4
+ ... + 99/50*/

package Revisão;

import java.util.Scanner;

public class PEX04 {
	public static void main(String args[]) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner ler = new Scanner(System.in);
		int a = 1, b = 1, i ;
		System.out.print(a+"/"+b+" + " );
		
		for(i = 0; i < 49; i++){
			a = a +2;
			b ++;
			System.out.print(a+"/"+b+" + " );
		}
	}
}
