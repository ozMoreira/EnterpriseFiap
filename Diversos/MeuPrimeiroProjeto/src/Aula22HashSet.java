
import java.util.HashSet;
import java.util.Set;

public class Aula22HashSet {

	public static void main(String[] args) {

		
		// HashSet garante a unicidade dos dados, implementando a classe SET
		Set<String> lista = new HashSet<String>();

		// adicionando itens na lista
		lista.add("Jo�o Pedro da Silva");
		lista.add("Lucas Santos");
		System.out.println(lista.add("Carolina Sanches"));
		lista.add("Jo�o Aguiar");
		lista.add("Lucas Santos");
		lista.add("Lucas Santos");
		System.out.println(lista.add("Lucas Santos"));
		System.out.println(lista.add("Jo�ozinho"));
		
		
		System.out.println("-----------------------------------------------------");
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("-----------------------------------------------------");
		
		lista.remove("Jo�o Aguiar");
		

		for (String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("-----------------------------------------------------");
		lista.clear();
		for (String nome : lista) {
			System.out.println(nome);
		}


	}

}
