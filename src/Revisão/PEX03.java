/*Escrever um programa que leia uma quantidade desconhecida de números e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
entrada de dados deve terminar quando for lido um número negativo.*/
package Revisão;

import java.util.Scanner;

public class PEX03 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num = 0, a = 0, b = 0, c =0, d = 0;
		
		while(num >= 0){
			System.out.println("Digite um número: ");
			num = ler.nextInt();
					
			if(num >= 0 && num < 26){
				a++;
			}
			if(num >= 26 && num < 51){
				b++;
			}
			if(num >= 51 && num < 76){
				c++;
			}
			if(num >=76 && num < 100){
				d++;
			}
		}
		System.out.println("Tivemos "+a+" números passados pelo intervalo [0 - 25]\n");
		System.out.println("Tivemos "+b+" números passados pelo intervalo [26 - 50]\n");
		System.out.println("Tivemos "+c+" números passados pelo intervalo [51 - 75]\n");
		System.out.println("Tivemos "+d+" números passados pelo intervalo [76 - 100]\n");
		System.out.println("E no total foram "+a+b+c+d+" números passados por todos os intervalos");
	}
}
