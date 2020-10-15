/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package POO;

public class Avi�o {
	private String modelo;
	private int numeroAtual;
	private int numeroMax;
	
	public Avi�o (String modelo, int numeroAtual, int numeroMax) {
		this.modelo = modelo;
		this.numeroAtual = numeroAtual;
		this.numeroMax = numeroMax;
		
	}
	public void seguran�a() {
		System.out.println("O avi�o foi checado e esta seguro para voar");
	}
	public void passageiros (int quant) {
		int novoNumero = this.numeroAtual + quant;
		this.numeroAtual = novoNumero;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getNumeroAtual() {
		return numeroAtual;
	}
	public void setNumeroAtual(int numeroAtual) {
		this.numeroAtual = numeroAtual;
	}
	public double getNumeroMax() {
		return numeroMax;
	}
	public void setNumeroMax(int numeroMax) {
		this.numeroMax = numeroMax;
	}
	
}
