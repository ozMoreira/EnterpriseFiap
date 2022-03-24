import java.text.MessageFormat;

public class Aula07OperadoresAritmeticos {

	public static void main(String[] args) {

		double soma = 1.5 + 1;
		int subtracao = 3 - 2;
		int divisao = 7 / 3;
		double divisao2 = 7.0 / 3.0;
		double multiplicacao = 3.52 * 2;
		int modulo = 6 % 3;

		String resposta = MessageFormat.format(
				"O resultado da soma é {0}" 
				+ "\n O resultado da subtração é {1}"
				+ "\n O resultado da divisão é {0}" 
				+ "\n O resultado da divisao decimal é {0}"
				+ "\n O resultado da multiplicação é {1}" 
				+ "\n O módulo de 6 por 3 é {5}", soma, subtracao);

		System.out.println(resposta);
	}
}
