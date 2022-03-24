import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class aula25HashMap {

	public static void main(String[] args) {
		//FOrma de armazenar informações com Chave e Valor, não trabalha com indice e sim com valores pré definidos.
		
		//na declaração da variavel, precisa informar qual vai ser o tipo da chave e do valor
		
		Map<Integer, String> map = new HashMap<>();
		
		//Classe MAP implementa HashMap e HashSet
		//TreeMap assim como LinkedSet é mais rapido, performatico, ao passo que o HashMap utiliza mais memoria.
		Map<String, String> map2 = new TreeMap<>();
		
		//adicionando valores - utiliza-se o metodo PUT
		map.put(1, "Pessoa Física");
		map.put(2, "Pessoa Jurídica");
		map.put(3, "XPTO");
		map.put(4, "Pessoa Inexistente");
		
		//recuperando por chave
		System.out.println(map.get(4));
		System.out.println(map.get(3));
		//removendo valores
		map.remove(3);
		System.out.println(map.get(3));

	}

}
