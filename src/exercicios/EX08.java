/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
package exercicios;

import java.util.Scanner;

public class EX08 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float fab,dis,imp,custo;
		System.out.println("Qual o custo de fábrica do veiculo? ");
		fab = ler.nextInt();
		dis = (float) (fab*0.28);
		imp = (float) (fab*0.45);
		custo = fab+dis+imp;
		System.out.println("O custo do veiculo é de R$"+custo+".");
	}	
}
