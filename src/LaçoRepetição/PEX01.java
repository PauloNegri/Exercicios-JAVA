/*1-A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:��
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00.*/

package La�oRepeti��o;

import java.util.Scanner;

public class PEX01 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int  filho, i, mediaFilho = 0;
		float salario, mediaSalario = 0, maiorSalario = 0, percentual = 0;
		
		for(i = 0; i < 3; i++) {
			System.out.print("Quantos filhos(as) voc� tem?\n");
			filho = ler.nextInt();
			System.out.print("Qual o seu sal�rio?\n");
			salario = ler.nextFloat();
			
			mediaSalario = mediaSalario + salario;
			mediaFilho = mediaFilho + filho;
			
			if(salario > maiorSalario){
				maiorSalario = salario; 
			
			}
			if(salario <= 100){
				percentual++;
			}
		}
		System.out.print("A media salarial � R$"+ mediaSalario/i+" .\n");
		System.out.print("A media de n�mero de filhos s�o de "+ mediaFilho/i+" .\n");
		System.out.print("O maior salario foi de R$"+maiorSalario+" .\n");
		System.out.print("O percentual de pessoas que recebem at� R$100,00 � de "+(percentual/i)*100+"% .");
		
	}
}
