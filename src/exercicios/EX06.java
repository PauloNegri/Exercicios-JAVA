/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é:  d = ((x2-x1)^2+(y2-y1)^2)^(1/2)  */
package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class EX06 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		@SuppressWarnings("unused")
		float D, px1,px2,py1,py2, conta;
		System.out.println("Digite a primeira coordenada em x: ");
		px1 = ler.nextInt();
		System.out.println("Digite a segunda coordenada em x: ");
		px2 = ler.nextInt();
		System.out.println("Digite a primeira coordenada em y: ");
		py1 = ler.nextInt();
		System.out.println("Digite a segunda coordenada em y: ");
		py2 = ler.nextInt();
		conta = (float) ((Math.pow((px2-px1),2)) + (Math.pow((py2-py1),2)));
		D = (float) Math.sqrt(conta);
		
	}	
}
