/*6 - Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/
package LaçoCondicionalPortugol;

import java.util.Scanner;

public class EX06 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.print("Informe sua idade:");
		idade = ler.nextInt();
		
		if(idade >= 5 && idade <=7){
			System.out.print("Você percentece a Infantil A");
		}
		if(idade >= 8 && idade <=11){
			System.out.print("Você percentece a Infantil B");
		}
		if(idade >= 12 && idade <=13){
			System.out.print("Você percentece a Juvenil A");
		}
		if(idade >= 14 && idade <=17){
			System.out.print("Você percentece a Juvenil B");
		}
		if(idade >= 18){
			System.out.print("Você percentece a Adultos");
		}
	}
}
