package Pacote1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// DECLARACAO DAS VARIAVEIS
		int opcao = -1;
		double num1 = 0;
		double num2 = 0;
		double resultado = 0; 
		
		// INSTANCIA DAS CLASSES E OBJETOS QUE VAMOS UTILIZAR
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {
			// APRESENTAÇÃO DAS OPÇOES DO MENU AO USUARIO
			System.out.print("\n\n------------- Calculadora ------------" + "\n"
					+ "\n	|    1 - Somar	        |"
					+ "\n	|    2 - Subtrair 	|" 
					+ "\n	|    3 - Dividir	|"
					+ "\n	|    4 - Multiplicar	|"
					+ "\n	|   ----------------    |" 
					+ "\n	|    0  -  S A I R      |" + "\n"
					+ "\nInforme a operação desejada >>> ");

			// CAPTURA A OPÇÃO DO MENU DIGITADA PELO USUARIO
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				//Solicita a entrada de numeros ao usuario
				System.out.print("\n\nInforme um número para sua soma >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Informe outro número >>> ");
				num2 = entrada.nextFloat();
				
				//instancia a classe SOMA, criando o objeto soma
				Soma churros = new Soma(num1, num2);
				
				//Atribui o resultado do metodo calculaSoma para a variavel Resultado
				resultado = churros.calculaSoma(num1, num2);
				
				//Exibe a saida ao usuario/
				System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
				break;
			
			case 2:
				//Solicita a entrada de numeros ao usuario
				System.out.print("\n\nInforme um número para sua subtração >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Informe outro número >>> ");
				num2 = entrada.nextFloat();
				
				//instancia a classe SUBTRAI, criando o objeto sub
				Subtrai sub = new Subtrai(num1, num2);
				
				//Atribui o resultado do metodo calculaSubtracao para a variavel Resultado
				resultado = sub.calculaSubtracao(num1, num2);
				
				//Exibe a saida ao usuario
				System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
				break;
			
			case 3:
				//Solicita a entrada de numeros ao usuario
				System.out.print("\n\nInforme um número para sua divisão >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Informe outro número >>> ");
				num2 = entrada.nextFloat();
				
				//instancia a classe Divide, criando o objeto div
				Divide div = new Divide(num1, num2);
				
				//Atribui o resultado do metodo calculaDivisao para a variavel Resultado
				resultado = div.calculaDivisao(num1, num2);
				
				//Exibe a saida ao usuario
				System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
				break;
			
			case 4:
				//Solicita a entrada de numeros ao usuario
				System.out.print("\n\nInforme um número para sua Multiplicacao >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Informe outro número >>> ");
				num2 = entrada.nextFloat();
				
				//instancia a classe MULTIPLICA, criando o objeto mult
				Multiplica mult = new Multiplica(num1, num2);
				
				//Atribui o resultado do metodo calculaMultiplicacao para a variavel Resultado
				resultado = mult.calculaMultiplicacao(num1, num2);
				
				//Exibe a saida ao usuario
				System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
				break;

			default:
				if (opcao != 0) {
					System.out.println("\n\nVoce precisa selecionar uma das opções válidas\n");
				}
				break;
			}
		}
		System.out.println("\n\nObrigado por utilizar nossa Calculadora de Console!\n");
		entrada.close();
	}

}
