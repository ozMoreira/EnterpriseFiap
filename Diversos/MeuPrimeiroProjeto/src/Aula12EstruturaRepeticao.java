import java.util.Scanner;

public class Aula12EstruturaRepeticao {

	public static void main(String[] args) {
	/*
		//Utilizando o WHILE
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println("Repetição While " + contador + " de 10");
			contador++;
		}
		
		System.out.println("\n---------------------------------\n");
		
		//Utilizando o FOR
		
		for (int i =0 ; i <= 10; i++ ) {
			System.out.println("Repetição FOR " + i + " de 10");
		}
		
		System.out.println("\n---------------------------------\n");
		*/
		//-----------------------------------------------------------------------
		
		//DECLARACAO DAS VARIAVEIS
		int opcao = -1;
		
		//INSTANCIA DAS CLASSES E OBJETOS QUE VAMOS UTILIZAR
		Scanner entrada = new Scanner(System.in);
		
		while (opcao != 0){
		//APRESENTAÇÃO DAS OPÇOES DO MENU AO USUARIO
		System.out.print(
				  	"------------- MENU ------------"
				+ "\n"
				+ "\n|    1 - Pagar Boleto          |"
				+ "\n|    2 - Transferencia         |"
				+ "\n|    3 - Depositar             |"
				+ "\n|    4 - Sacar		       |"
				+ "\n|    5 - Consultar Saldo       |"
				+ "\n|   -----------------------    |"
				+ "\n|    0  -  S A I R             |"
				+ "\n"
				+ "\nInforme a opção desejada >>> ");
		
		//CAPTURA A OPÇÃO DO MENU DIGITADA PELO USUARIO
		opcao = entrada.nextInt();
		
		 
			switch (opcao) {
			case 1: 
				System.out.println("\n\nAqui ficará a funcionalidade para pagar boleto\n");
				break;
			case 2: 
				System.out.println("\n\nAqui ficará a funcionalidade para Transferencia\n");
				break;
			case 3:
				System.out.println("\n\nAqui ficará a funcionalidade para Depositar\n");
				break;
			case 4:
				System.out.println("\n\nAqui ficará a funcionalidade para Sacar\n");
				break;
			case 5:
				System.out.println("\n\nAqui ficará a funcionalidade para Consultar Saldo\n");
				break;
			default:
				if (opcao !=0) {
				System.out.println("\n\nVoce precisa selecionar uma das opções válidas\n");
				}
				break;
			}
		} 
		System.out.println("\n\nObrigado por utilizar nosso sistema!\n");
		entrada.close();
		
	}

}
