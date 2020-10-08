/*1-João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de
R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
(peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
com o conteúdo ZERO.*/

package LaçoCondicionalPortugol;

import java.util.Scanner;

public class EX01 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int P, E, M;
		System.out.print("Qual o peso dos tomates? ");
		P = ler.nextInt();
		
		if(P > 50) {
			E = P - 50;
			M = E * 4;
			P = 50;
			System.out.println("João devera pagar R$"+P+",00 mais R$"+M+",00 de multa por "+E+"Kilos de excesso .");
		}else {
			M = 0;
			E = 0;
			System.out.println("João teve excesso de "+E+" e multa de "+M+",00 e com isso tem que pagar apenas R$"+P+",00 .");
		}
		
	}
}
