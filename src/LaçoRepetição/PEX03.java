/*3- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/
package LaçoRepetição;
import java.util.Scanner;

public class PEX03 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, somaNum = 0, i = 0;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		while(num > 0 ){
			somaNum = somaNum + num ;
			System.out.print("Informe um número: ");
			num = ler.nextInt();
			i++;
		}
		System.out.print("O total da somatória de todos os números é: "+ somaNum+"\n");
		System.out.print("A média de todos os números é: "+somaNum/i+"\n");
		System.out.print("E o total de valores lidos foi: "+ i);
	}
}
