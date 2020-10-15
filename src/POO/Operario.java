/*5. Implemente a classe Operario como subclasse da classe Pessoa. Um determinado operário
tem como atributos da classe Pessoa e também os atributos próprios como valorProducao
(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
comissao (que corresponde à porcentagem do valorProducao que será adicionado ao
vencimento base do operário).*/
package POO;

public class Operario  extends Pessoa{
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao,double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()
		+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco()+"\n"
		+"\n"+"Valor Produção: "+valorProducao+"\n"+"Porcentagem (sem '%') da comissão deste artigo: :"+comissao);
	}
	
	public void calcularValorArtigo() {
		double valor_total = valorProducao + (valorProducao*(comissao/100));
		System.out.println("O valor total a ser recebido pelo operário: "
				+getNome()+" é igaul a: "+valor_total);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}

