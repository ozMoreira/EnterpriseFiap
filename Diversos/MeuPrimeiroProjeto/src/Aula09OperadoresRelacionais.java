
public class Aula09OperadoresRelacionais {

	public static void main(String[] args) {
		
		int valor;
		int novoValor;
		
		boolean isMaior = false;
		boolean isMenor = false;
		boolean isIgual = false;
		boolean isDiferente = false;
		
		System.out.println("-------------- VALORES ----------------");
		
		
		valor = 1;
		System.out.println("Valor = " + valor);
		novoValor = valor+1;
		System.out.println("Novo Valor = " + novoValor);

		System.out.println("");
		
		System.out.println("------------ É MAIOR? --------------");
		isMaior = (valor > novoValor);
		System.out.println("Valor é MAIOR que Novo Valor? >>>> " + isMaior);
		isMaior = (novoValor > valor);
		System.out.println("Novo Valor é MAIOR que Valor? >>>> " + isMaior);

		System.out.println("");

		System.out.println("------------ É MENOR? --------------");
		isMenor = (valor < novoValor);
		System.out.println("Valor é MENOR que Novo Valor? >>>> " + isMenor);
		isMenor = (novoValor < valor);
		System.out.println("Novo Valor é MENOR que Valor? >>>> " + isMenor);


		System.out.println("");
		
		

		System.out.println("------------ É IGUAL? --------------");
		isIgual = (valor == novoValor);
		System.out.println("Valor é IGUAL ao Novo Valor? >>>> " + isIgual);
		
		System.out.println("");

		System.out.println("------------ É DIFERENTE? --------------");
		isDiferente = (valor != novoValor);
		System.out.println("Valor é DIFERENTE ao Novo Valor? >>>> " + isDiferente);
		
	}

}
