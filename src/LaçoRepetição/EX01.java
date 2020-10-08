/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

package LaçoRepetição;

public class EX01 {
	public static void main(String args[]){
		int num;
		for(num = 1000; num <= 1999; num++) {
			if(num%2 == 5) {
				 System.out.println(num);
			}
		}
		
	}
}
