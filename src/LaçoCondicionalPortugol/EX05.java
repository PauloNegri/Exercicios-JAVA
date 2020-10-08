/*5-A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
medido e emita a notifica��o adequada aos diferentes grupos de empresas.*/

package La�oCondicionalPortugol;

import java.util.Scanner;

public class EX05 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int ind;
		System.out.print("Digite o indice de polui��o(0 a 1.0): ");
		ind = ler.nextInt();
		
		if(ind > 0.3 && ind < 0.4){
			System.out.print("�ndice de polui��o acima do aceitavel, empresas do 1� grupo suspendam suas atividades");
		}
		if(ind >= 0.4 && ind < 0.5){
			System.out.print("�ndice de polui��o bem acima do aceitavel, empresas do 1� e 2� grupo suspendam suas atividades");
		}
		if(ind >= 0.5){
			System.out.print("�ndice de polui��o muito acima do aceitavel,todas as empresas suspendam suas atividades");
		}
		else{
			System.out.print("�ndice aceitavel");
		}
	}
}
