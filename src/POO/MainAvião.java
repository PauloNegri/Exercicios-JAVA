/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package POO;

public class MainAvião {
	public static void main (String[] args) { 
		Avião meuVoo = new Avião("527",50,700);
		meuVoo.passageiros(650);
		
		System.out.println("O número de passageiros é de "+ meuVoo.getNumeroAtual());
	}
}
