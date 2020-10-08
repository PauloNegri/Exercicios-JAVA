/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package LaçoRepetição;

import java.util.Random;

public class EX04 {
	public static void main (String args[]){
		Random gerador = new Random();
		int idade, sexo, psico, i = 0,c = 0,mn = 0,ha = 0,oc = 0, n40 = 0, c18 = 0 ;
		
		while(i < 150){
			idade = gerador.nextInt(75);
			sexo = gerador.nextInt(4);
			psico = gerador.nextInt(4);
			
			if(psico == 1) {
				c++;
			}
			if(sexo == 1 && psico == 2) {
				mn++;
			}
			if(sexo == 2 && psico == 3) {
				ha++;
			}
			if(sexo == 3 && psico == 1) {
				oc++;
			}
			if(idade > 40 && psico == 2) {
				n40++;
			}
			if(idade < 18 && psico == 2) {
				c18++;
			}
			
			i++;
		}
		
		System.out.printf("Temos "+c+" pessoa(s) calma(s);");
		System.out.printf("\nTemos "+mn+" mulhere(s) nervosa(s);");
		System.out.printf("\nTemos "+ha+" homen(s) agressivo(s);");
		System.out.printf("\nTemos "+oc+" outro(s) calmo(s);");
		System.out.printf("\nTemos "+n40+" pessoa(s) com mais de 40 anos nervosa(s);");
		System.out.printf("\nTemos "+c18+" pessoa(s) com menos de 18 anos calma(s);");
	}
}
