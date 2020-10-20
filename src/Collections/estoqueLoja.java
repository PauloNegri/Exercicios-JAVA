package Collections;

import java.util.*;

public class estoqueLoja {
	public static void main (String args[]){
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int numero;
		Collection<String> dados = new ArrayList<String>();
		dados.add("Arroz");
		dados.add("Feijão");
		dados.add("Oleo");
		dados.add("Batata");	
		
		do {
			System.out.println("\nEscolha a opção desejada:\n"
					+"\n1 - Armazenar um produto"
					+"\n2 - Remover um produto"
					+"\n3 - Atualizar um produto"
					+"\n4 - Mostrar todos produtos disponíveis"
					+"\n0 - Sair");
			numero = ler.nextInt();
			
		switch(numero) {
		case 1:
			System.out.print("Qual produto deseja armazenar?");
			String produto = ler.next();
			dados.add(produto);
			break;
			
		case 2:
			System.out.println("Qual produto deseja remover ?");
			String produtor = ler.next();
			dados.remove(produtor);
			break;
			
		case 3:
			System.out.println("Qual produto deseja atualizar?");
			String existente = ler.next();
			if(!dados.contains(existente)){
				System.out.println("Produto não encontrado !!");
			}else {
				
				System.out.println("Insira o nome do produto que substituirá o(a) "+existente+" :");
				String novo = ler.next();
				
				if(dados.contains(existente)){
					dados.remove(existente);
					dados.add(novo);
				}
			}	
			
		case 4:
			System.out.println("\nProdutos atuais: ");
		    System.out.println(dados);
		    break;
		
		default:
			System.out.println("Obrigado por utilizar !!");
		}
		
		}while(numero !=0);
	}
}