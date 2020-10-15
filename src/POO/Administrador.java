/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/
package POO;

public class Administrador extends Pessoa {
	private float ajudaDeCusto;
	private float salario;
	
	public Administrador (String nome, String endereco, String cpf, int telefone, int idade, float salario, float ajudaDeCusto){
		
		super(nome,endereco,cpf,telefone,idade);
		this.salario = salario;
		this.ajudaDeCusto = ajudaDeCusto;
	}	
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco()+"\n"+" Ajuda de Custo: " + ajudaDeCusto);
	}
	
	public void calculaAjudaDeCusto() {
		ajudaDeCusto =  salario*(1/10);
	}
	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	

	
}
