package Polimorfismo;

public class Preguica extends Animal {
		private String escalar;

		public String getNome() {
			return "Pregui�a: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nA��o: " + this.getEscalar();
		}
		public String getEscalar() {
			return escalar;
		}
		public void setEscalar(String escalar) {
			this.escalar = escalar;
		}
		
}

