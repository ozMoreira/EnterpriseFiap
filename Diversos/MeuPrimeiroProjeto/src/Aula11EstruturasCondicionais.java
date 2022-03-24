import java.text.MessageFormat;
import java.util.Scanner;

public class Aula11EstruturasCondicionais {

	public static void main(String[] args) {
		
		//DECLARACAO DAS VARIAVEIS QUE UTILIZAREMOS
		int n1;
		int n2;
		boolean isOk = false; //flag
		String resposta;

		//INSTANCIA DAS CLASSES E OBJETOS QUE UTILIZAREMOS
		Scanner entrada = new Scanner(System.in);

		//SOLICITA��O DE INTERA��O COM O USUARIO
		System.out.print("Informe um numero inteiro qualquer >>>> ");
		n1 = entrada.nextInt();

		System.out.print("Informe um outro numero inteiro qualquer >>>> ");
		n2 = entrada.nextInt();

		//ALGORITMO PARA SETAR O STATUS DA FLAG
		isOk = (n1 > n2);

		//ESTRUTURA CONDICIONAL QUE RETORNA A RESPOSTA QUE SERA IMPRESSA AO USUARIO
		if (isOk == true) {
			resposta = MessageFormat.format("O N�mero {0} � MAIOR que o N�mero {1}", n1, n2);

		} else {
			resposta = MessageFormat.format("ELSE: O Numero {1} � MAIOR que o N�mero {0}", n1, n2);
		}
		
		//IMPRESSAO DA RESPOSTA DE ACORDO COM O RETORNO DA ESTRUTURA CONDICIONAL
		System.out.println("\n-----------------------------------------------------");
		System.out.println(resposta);
		
		//ENCERRA OBJETOS QUE CONSOMEM ESPA�O EM MEMORIA
		entrada.close();
	}
}
