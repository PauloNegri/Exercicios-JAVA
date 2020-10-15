package POO;

public class Avião {
	String modelo;
	double numeroAtual;
	double numeroMax;
	
	void segurança() {
		System.out.println("O avião foi checado e esta seguro para voar");
	}
	void passageiros (double quant) {
		double novoNumero = this.numeroAtual + quant;
		this.numeroAtual = novoNumero;
	}
	
}
