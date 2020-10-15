package POO;

public class TesteGeral {
	public static void main (String [] args) {
		
		System.out.print(":::::::::::::::::::Teste Fornecedor:::::::::::::::::::");
		Fornecedor marcelo = new Fornecedor("Marcelo","Rua pascoal, nº222","56256256256",988885555, 21, 900.00, 500.00);
		Fornecedor eleonor = new Fornecedor("Eleonor", "Rua sol, nº333", "77788899977",988887777, 26, 700.00, 600.00);	
		marcelo.imprimirInfo();
		marcelo.validarCpf();
		marcelo.obterSaldo();
		eleonor.imprimirInfo();
		eleonor.validarCpf();
		eleonor.obterSaldo();	
			
		System.out.print(":::::::::::::::::::Teste Empregado:::::::::::::::::::");
		Empregado lurdes = new Empregado("Manuel","Rua da Marola,no.420","55566677788",917654545,55,20,1500,10);
		lurdes.imprimirInfo();
		lurdes.calcularSalario();
		lurdes.validarCpf();
		
		System.out.print(":::::::::::::::::::Teste Administrador:::::::::::::::::::");
		Administrador alberto = new Administrador("Alberto","Av. Firula, n762","44466677788",917654745,35,2500,10);
		alberto.imprimirInfo();
		alberto.calculaAjudaDeCusto();
		
		System.out.print(":::::::::::::::::::Teste Operario:::::::::::::::::::");
		Operario israel = new Operario("Israel","Rua da Jujuraba,no.199","55565677788",917654545,15,2000,12);
		israel.imprimirInfo();
		israel.calcularValorArtigo();
		
		System.out.print(":::::::::::::::::::Teste Vendedorr:::::::::::::::::::");
		Vendedor estevan = new Vendedor("Estevan","Rua Laercio,no.1299","55599977788",917654545,15,2000,12);
		estevan.imprimirInfo();
		estevan.calculaComissao();

	}
}
