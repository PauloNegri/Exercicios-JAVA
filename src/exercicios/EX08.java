/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/
package exercicios;

import java.util.Scanner;

public class EX08 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float fab,dis,imp,custo;
		System.out.println("Qual o custo de f�brica do veiculo? ");
		fab = ler.nextInt();
		dis = (float) (fab*0.28);
		imp = (float) (fab*0.45);
		custo = fab+dis+imp;
		System.out.println("O custo do veiculo � de R$"+custo+".");
	}	
}
