/*2 - Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/
package LaçoCondicionalPortugol;

import java.util.Scanner;

public class EX02 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int N, E;
		String C;
		System.out.printf("Digite seu código: ");
		C = ler.nextLine();
		System.out.println("Digite quantas horas foram trabalhadas nesse mês: ");
		N = ler.nextInt();
		if(N > 50) {
			E = N - 50;
			N = 50;
			System.out.print("Seu salario foi de R$"+N*10+",00 e seu bônus será de R$"+E*20+",00, totalizando em R$"+((N*10)+(E*20))+",00."); 
		}else {
			E = 0;
			System.out.print("Seu salario foi de R$"+N*10+",00 e seu bônus será de R$"+E+",00, totalizando em R$"+N*10+",00."); 

		}
	}

}
