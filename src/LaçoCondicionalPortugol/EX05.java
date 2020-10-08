/*5-A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.*/

package LaçoCondicionalPortugol;

import java.util.Scanner;

public class EX05 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int ind;
		System.out.print("Digite o indice de poluição(0 a 1.0): ");
		ind = ler.nextInt();
		
		if(ind > 0.3 && ind < 0.4){
			System.out.print("Índice de poluição acima do aceitavel, empresas do 1º grupo suspendam suas atividades");
		}
		if(ind >= 0.4 && ind < 0.5){
			System.out.print("Índice de poluição bem acima do aceitavel, empresas do 1º e 2º grupo suspendam suas atividades");
		}
		if(ind >= 0.5){
			System.out.print("Índice de poluição muito acima do aceitavel,todas as empresas suspendam suas atividades");
		}
		else{
			System.out.print("Índice aceitavel");
		}
	}
}
