/*1-A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

package LaçoRepetição;

import java.util.Scanner;

public class PEX01 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int  filho, i, mediaFilho = 0;
		float salario, mediaSalario = 0, maiorSalario = 0, percentual = 0;
		
		for(i = 0; i < 3; i++) {
			System.out.print("Quantos filhos(as) você tem?\n");
			filho = ler.nextInt();
			System.out.print("Qual o seu salário?\n");
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
		System.out.print("A media salarial é R$"+ mediaSalario/i+" .\n");
		System.out.print("A media de número de filhos são de "+ mediaFilho/i+" .\n");
		System.out.print("O maior salario foi de R$"+maiorSalario+" .\n");
		System.out.print("O percentual de pessoas que recebem até R$100,00 é de "+(percentual/i)*100+"% .");
		
	}
}
