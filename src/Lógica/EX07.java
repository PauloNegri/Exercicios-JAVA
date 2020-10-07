/*7. Um sistema de equações lineares do tipo: ax + by = c   dx + ey = f, pode ser resolvido 
segundo mostrado: x = (ce-bf)/(ae - bd)  y = (af-cd)/(ae - bd).
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y. */

package Lógica;

import java.util.Scanner;

public class EX07 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de c: ");
		c = ler.nextInt();
		System.out.println("Digite o valor de d: ");
		d = ler.nextInt();
		System.out.println("Digite o valor de e: ");
		e = ler.nextInt();
		System.out.println("Digite o valor de f: ");
		f = ler.nextInt();
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		System.out.println("O valor de X é: "+x+".\nO valor de y é: "+ y+".");
	}
}
