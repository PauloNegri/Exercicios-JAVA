/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package POO;

public class MainAvi�o {
	public static void main (String[] args) { 
		Avi�o meuVoo = new Avi�o();
		meuVoo.modelo = "527";
		meuVoo.numeroAtual = 50;
		meuVoo.numeroMax = 700;
		
		meuVoo.passageiros(650);
		System.out.println(meuVoo.numeroAtual);
	}
}
