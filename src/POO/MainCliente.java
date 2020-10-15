/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package POO;

import java.util.Scanner;

public class MainCliente {
	public static void main (String [] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Cliente primeiroCliente = new Cliente();
		System.out.printf("Digite o seu nome: ");
		primeiroCliente.nome = ler.next(); ;
		System.out.printf("Digite a sua idade: ");
		primeiroCliente.idade = ler.nextInt();
		primeiroCliente.maior();
	}
}
