package Polimorfismo;

public class Teste {
	public static void main (String []args) {
		
		Cachorro dog = new Cachorro();
		dog.setNome("bob");
		dog.setIdade(5);
		dog.setSom("AuAu");
		dog.setCorrer("Correr");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Rivelino");
		cavalo.setIdade(15);
		cavalo.setSom("hinn");
		cavalo.setCorrer("Correr");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Jureia");
		preguica.setIdade(10);
		preguica.setSom("zzzz");
		preguica.setEscalar("Subir em árvores");
		
		Animal[] animais = new Animal[3];
		animais[0] = dog;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(Animal loop: animais)
		{
			System.out.println(loop.getNome()+"\n");
		}
	}
}
