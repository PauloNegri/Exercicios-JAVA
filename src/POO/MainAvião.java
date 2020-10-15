/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package POO;

public class MainAvião {
	public static void main (String[] args) { 
		Avião meuVoo = new Avião();
		meuVoo.modelo = "527";
		meuVoo.numeroAtual = 50;
		meuVoo.numeroMax = 700;
		
		meuVoo.passageiros(650);
		System.out.println(meuVoo.numeroAtual);
	}
}
