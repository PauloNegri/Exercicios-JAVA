/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package POO;

public class MainAvi�o {
	public static void main (String[] args) { 
		Avi�o meuVoo = new Avi�o("527",50,700);
		meuVoo.passageiros(650);
		
		System.out.println("O n�mero de passageiros � de "+ meuVoo.getNumeroAtual());
	}
}
