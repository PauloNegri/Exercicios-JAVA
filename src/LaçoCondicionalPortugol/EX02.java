/*2 - Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
excedente.*/
package La�oCondicionalPortugol;

import java.util.Scanner;

public class EX02 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int N, E;
		String C;
		System.out.printf("Digite seu c�digo: ");
		C = ler.nextLine();
		System.out.println("Digite quantas horas foram trabalhadas nesse m�s: ");
		N = ler.nextInt();
		if(N > 50) {
			E = N - 50;
			N = 50;
			System.out.print("Seu salario foi de R$"+N*10+",00 e seu b�nus ser� de R$"+E*20+",00, totalizando em R$"+((N*10)+(E*20))+",00."); 
		}else {
			E = 0;
			System.out.print("Seu salario foi de R$"+N*10+",00 e seu b�nus ser� de R$"+E+",00, totalizando em R$"+N*10+",00."); 

		}
	}

}
