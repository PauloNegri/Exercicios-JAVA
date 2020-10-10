/*Escrever um programa que leia uma quantidade desconhecida de n�meros e conte
quantos deles est�o nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
entrada de dados deve terminar quando for lido um n�mero negativo.*/
package Revis�o;

import java.util.Scanner;

public class PEX03 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num = 0, a = 0, b = 0, c =0, d = 0;
		
		while(num >= 0){
			System.out.println("Digite um n�mero: ");
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
		System.out.println("Tivemos "+a+" n�meros passados pelo intervalo [0 - 25]\n");
		System.out.println("Tivemos "+b+" n�meros passados pelo intervalo [26 - 50]\n");
		System.out.println("Tivemos "+c+" n�meros passados pelo intervalo [51 - 75]\n");
		System.out.println("Tivemos "+d+" n�meros passados pelo intervalo [76 - 100]\n");
		System.out.println("E no total foram "+a+b+c+d+" n�meros passados por todos os intervalos");
	}
}
