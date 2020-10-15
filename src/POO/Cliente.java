/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class Cliente {
	private String nome;
	private int idade;
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void maiorIdade() {
		if(idade < 18) {
			System.out.print("menor de idade.");
		} else {			
		    System.out.print("maior de idade.");
		}
	}
}
