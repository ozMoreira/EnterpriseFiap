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
				"O resultado da soma � {0}" 
				+ "\n O resultado da subtra��o � {1}"
				+ "\n O resultado da divis�o � {0}" 
				+ "\n O resultado da divisao decimal � {0}"
				+ "\n O resultado da multiplica��o � {1}" 
				+ "\n O m�dulo de 6 por 3 � {5}", soma, subtracao);

		System.out.println(resposta);
	}
}
