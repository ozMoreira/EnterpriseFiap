import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class aula25HashMap {

	public static void main(String[] args) {
		//FOrma de armazenar informa��es com Chave e Valor, n�o trabalha com indice e sim com valores pr� definidos.
		
		//na declara��o da variavel, precisa informar qual vai ser o tipo da chave e do valor
		
		Map<Integer, String> map = new HashMap<>();
		
		//Classe MAP implementa HashMap e HashSet
		//TreeMap assim como LinkedSet � mais rapido, performatico, ao passo que o HashMap utiliza mais memoria.
		Map<String, String> map2 = new TreeMap<>();
		
		//adicionando valores - utiliza-se o metodo PUT
		map.put(1, "Pessoa F�sica");
		map.put(2, "Pessoa Jur�dica");
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
