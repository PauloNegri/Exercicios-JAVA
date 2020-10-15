/*6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorVendas
(correspondente ao valor monet�rio dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que ser� adicionado ao vencimento base do Vendedor).*/
package POO;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String cpf, int telefone,int idade,double valorVendas, double comissao){
		
		super(nome,endereco,cpf,telefone,idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public void calculaComissao() {
		comissao = valorVendas*(1/10);
	}
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endere�o: "+getEndereco()+"\n"
		+"\n"+"Valor das Vendas: "+valorVendas+"\n"+"Valor da comiss�o: "+comissao
		+"\n"+"Valor total a receber: "+(valorVendas + comissao));
	}


}

