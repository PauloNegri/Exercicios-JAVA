/*3- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
negativo.*/
package La�oRepeti��o;
import java.util.Scanner;

public class PEX03 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, somaNum = 0, i = 0;
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		while(num > 0 ){
			somaNum = somaNum + num ;
			System.out.print("Informe um n�mero: ");
			num = ler.nextInt();
			i++;
		}
		System.out.print("O total da somat�ria de todos os n�meros �: "+ somaNum+"\n");
		System.out.print("A m�dia de todos os n�meros �: "+somaNum/i+"\n");
		System.out.print("E o total de valores lidos foi: "+ i);
	}
}
