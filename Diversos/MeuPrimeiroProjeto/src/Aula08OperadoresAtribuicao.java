public class Aula08OperadoresAtribuicao {

	public static void main(String[] args) {

		int valor;
	
		
		System.out.println("-------------- SOMA ----------------");
		
		
		valor = 1;
		System.out.println("Valor � " + valor );
		
		valor = 2;
		System.out.println("A nova atribui��o de Valor � " + valor );
	
		valor = valor + 1;
		System.out.println("valor = valor + 1 resulta em " + valor );
		
		valor = 1;
		System.out.println("A nova atribui��o de Valor � " + valor );

		valor += 1;
		System.out.println("valor += 1 resulta em " + valor );
		
		valor = 1;
		valor++;
		System.out.println("valor++ resulta em " + valor );
		
		
		System.out.println("");
		
		
		System.out.println("------------ SUBTRA��O --------------");
		
		valor = 2;
		System.out.println("Valor � " + valor );
		
		valor = 1;
		System.out.println("A nova atribui��o de Valor � " + valor );
		valor = valor - 1;
		System.out.println("valor = valor - 1 resulta em " + valor );
		
		valor = 2;
		System.out.println("A nova atribui��o de Valor � " + valor );
		
		
		valor -= 1;
		System.out.println("valor -= 1 resulta em " + valor );
		
		valor = 2;
		System.out.println("A nova atribui��o de Valor � " + valor );
		valor--;
		System.out.println("valor-- resulta em " + valor );
		
	}

}
