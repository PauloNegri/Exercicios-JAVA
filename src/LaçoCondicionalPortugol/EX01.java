/*1-Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de
R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
(peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
com o conte�do ZERO.*/

package La�oCondicionalPortugol;

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
			System.out.println("Jo�o devera pagar R$"+P+",00 mais R$"+M+",00 de multa por "+E+"Kilos de excesso .");
		}else {
			M = 0;
			E = 0;
			System.out.println("Jo�o teve excesso de "+E+" e multa de "+M+",00 e com isso tem que pagar apenas R$"+P+",00 .");
		}
		
	}
}
