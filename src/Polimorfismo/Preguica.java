package Polimorfismo;

public class Preguica extends Animal {
		private String escalar;

		public String getNome() {
			return "Preguiça: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nAção: " + this.getEscalar();
		}
		public String getEscalar() {
			return escalar;
		}
		public void setEscalar(String escalar) {
			this.escalar = escalar;
		}
		
}

