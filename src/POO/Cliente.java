package POO;

public class Cliente {
	String nome;
	int idade;
	
	void maior() {
		if(idade < 18) {
			System.out.print("Cliente menor de idade");
		} else {			
		    System.out.print("Cliente maior de idade");
		}
	}
}
