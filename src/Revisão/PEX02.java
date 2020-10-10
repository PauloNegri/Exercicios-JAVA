/*2-O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para
dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC =
peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o
de acordo com a tabela abaixo.
IMC em adultos Condi��o
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso*/

package Revis�o;

import java.util.*;

public class PEX02 {
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		float altura, peso, imc;
		System.out.println("Qual a sua altura? ");
		altura = ler.nextFloat();
		System.out.println("Qual o seu peso? ");
		peso = ler.nextFloat();
		imc = (float) (peso/(Math.pow(altura, 2)));
		
		if(imc < 18.5){
			System.out.println("Seu IMC � de "+Math.round(imc)+", voc� esta abaixo do peso.");
			}
		if(imc >= 18.5 && imc <= 25){
			System.out.println("Seu IMC � de "+Math.round(imc)+", voc� esta com peso normal.");
			}
		if(imc > 25 && imc <= 30){
			System.out.println("Seu IMC � de "+Math.round(imc)+", voc� esta acima do peso.");
			}
		if(imc > 30){
			System.out.println("Seu IMC � de "+Math.round(imc)+", voc� esta com obesidade morbida.");
			}
	}
}
