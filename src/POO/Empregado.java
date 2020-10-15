/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe
Empregado.*/
package POO;

public class Empregado extends Pessoa {
			private int codigoSetor;
			private float salarioBase;
			private float imposto;
			
			public Empregado (String nome, String endereco, String cpf, int telefone, int idade,int codigoSetor, float salarioBase, float imposto)
			{
				super(nome,endereco,cpf,telefone,idade);
				this.codigoSetor = codigoSetor;
				this.salarioBase = salarioBase;
				this.imposto = imposto;
			}
			
			public void imprimirInfo()
			{
				System.out.println("\nNome do empregado: "+getNome()
				+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
				+"\n"+"Endere�o: "+getEndereco()+"\n"+"C�digo do setor: "+codigoSetor+"\n"
				+"Sal�rio Base: "+salarioBase+"\n"+"Valor em porcentagem (sem o '%') de imposto a ser retido do sal�rio: "+imposto);
			}
			
			public void calcularSalario()
			{
				double salario_total = salarioBase - (salarioBase*(imposto/100));
				System.out.println("O sal�rio total a ser recebido pelo empregado: "+getNome()+" � igual a: "+salario_total);
			}

			public int getCodigoSetor() {
				return codigoSetor;
			}

			public void setCodigoSetor(int codigoSetor) {
				this.codigoSetor = codigoSetor;
			}

			public float getSalarioBase() {
				return salarioBase;
			}

			public void setSalarioBase(float salarioBase) {
				this.salarioBase = salarioBase;
			}

			public float getImposto() {
				return imposto;
			}

			public void setImposto(float imposto) {
				this.imposto = imposto;
			}
			
			
}


