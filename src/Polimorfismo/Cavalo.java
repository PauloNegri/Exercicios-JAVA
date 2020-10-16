package Polimorfismo;

public class Cavalo extends Animal {
	private String correr;

	public String getNome() {
		return "Cavalo: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nMovimento: " + this.getCorrer();
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
}
