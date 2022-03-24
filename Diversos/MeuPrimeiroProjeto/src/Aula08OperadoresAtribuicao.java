public class Aula08OperadoresAtribuicao {

	public static void main(String[] args) {

		int valor;
	
		
		System.out.println("-------------- SOMA ----------------");
		
		
		valor = 1;
		System.out.println("Valor é " + valor );
		
		valor = 2;
		System.out.println("A nova atribuição de Valor é " + valor );
	
		valor = valor + 1;
		System.out.println("valor = valor + 1 resulta em " + valor );
		
		valor = 1;
		System.out.println("A nova atribuição de Valor é " + valor );

		valor += 1;
		System.out.println("valor += 1 resulta em " + valor );
		
		valor = 1;
		valor++;
		System.out.println("valor++ resulta em " + valor );
		
		
		System.out.println("");
		
		
		System.out.println("------------ SUBTRAÇÃO --------------");
		
		valor = 2;
		System.out.println("Valor é " + valor );
		
		valor = 1;
		System.out.println("A nova atribuição de Valor é " + valor );
		valor = valor - 1;
		System.out.println("valor = valor - 1 resulta em " + valor );
		
		valor = 2;
		System.out.println("A nova atribuição de Valor é " + valor );
		
		
		valor -= 1;
		System.out.println("valor -= 1 resulta em " + valor );
		
		valor = 2;
		System.out.println("A nova atribuição de Valor é " + valor );
		valor--;
		System.out.println("valor-- resulta em " + valor );
		
	}

}
