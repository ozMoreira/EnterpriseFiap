
import java.util.HashSet;
import java.util.Set;

public class Aula22HashSet {

	public static void main(String[] args) {

		
		// HashSet garante a unicidade dos dados, implementando a classe SET
		Set<String> lista = new HashSet<String>();

		// adicionando itens na lista
		lista.add("João Pedro da Silva");
		lista.add("Lucas Santos");
		System.out.println(lista.add("Carolina Sanches"));
		lista.add("João Aguiar");
		lista.add("Lucas Santos");
		lista.add("Lucas Santos");
		System.out.println(lista.add("Lucas Santos"));
		System.out.println(lista.add("Joãozinho"));
		
		
		System.out.println("-----------------------------------------------------");
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("-----------------------------------------------------");
		
		lista.remove("João Aguiar");
		

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
