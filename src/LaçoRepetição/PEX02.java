/*2 -Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/
package LaçoRepetição;

public class PEX02 {
	public static void main (String args[]) {
		int soma = 0;
	
		for(int i=0; i<=500; i++){
			if( i%2!=0 && i%3==0){
				soma = soma + i;
			}		
		}
		System.out.print(soma);
	}
}
