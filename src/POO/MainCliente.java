/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package POO;

public class MainCliente {
	public static void main (String [] args) {
		
		Cliente primeiroCliente = new Cliente("Valeria", 17);
		System.out.print(primeiroCliente.getNome()+" � um cliente ");
		primeiroCliente.maiorIdade();
		System.out.print("\n");
		
		Cliente segundoCliente = new Cliente("Eduardo", 26);
		System.out.print(segundoCliente.getNome()+" � um cliente ");
		segundoCliente.maiorIdade();
	
	}
}
