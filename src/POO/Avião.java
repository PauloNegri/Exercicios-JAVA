package POO;

public class Avi�o {
	String modelo;
	double numeroAtual;
	double numeroMax;
	
	void seguran�a() {
		System.out.println("O avi�o foi checado e esta seguro para voar");
	}
	void passageiros (double quant) {
		double novoNumero = this.numeroAtual + quant;
		this.numeroAtual = novoNumero;
	}
	
}
