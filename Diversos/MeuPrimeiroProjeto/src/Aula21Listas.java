import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Aula21Listas {

	public static void main(String[] args) {
		// import java.util

		// Usando ArrayLit
		ArrayList<String> lista = new ArrayList<>();

		// Boa Pratica pede pra declarar o tipo como List

		// Interface List implementa tanto ArrayList quanto Linked List
		List<String> lista2 = new ArrayList<>();

		// Implementando Linked List
		List<String> lista3 = new LinkedList<>();

		// adicionando itens na lista
		lista3.add("João Pedro da Silva"); // 0
		lista3.add("Lucas Santos"); // 1
		lista3.add("Carolina Sanches"); // 2
		lista3.add("João Aguiar"); // 3
		lista3.add("Lucas Santos"); // 4
		lista3.add("Pedrinho"); // 5
		lista3.add("joãozinho");

		// recuperando os valores de cada indice com o metodo get
		System.out.println(lista3.get(0));
		System.out.println(lista3.get(4));
		System.out.println(lista3.get(2));
		System.out.println("------------------------------------");

		for (String nome : lista3) {
			System.out.println(nome);
		}

		System.out.println("------------------------------------");

		// Removendo itens da lista
		lista3.remove(1);

		for (int i = 0; i < lista3.size(); i++) {
			if (i == 1)
				System.out.println("Indice Removido!");
			else
				System.out.println(lista3.get(i));

		}

		// Linked list - Performatico na hora de recuperar com get mais rapido

	}

}
