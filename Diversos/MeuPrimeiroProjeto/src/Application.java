import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		//System.out.println(Aula17Enum.PESSOA_JURIDICA);
		//recupera o valor da assinatura
		//System.out.println(Aula17Enum.PESSOA_JURIDICA.getTexto());

		Scanner sc = new Scanner(System.in);
		
		//Percorre o Enum Menu
		for (Menu m : Menu.values()) {
			System.out.print("Opcao " + m + " = " + m.getValor()+"\n");
		}

		System.out.print("Digite a Opção Desejada >>>");
		int valor = sc.nextInt();
		
		Menu.escolheOpcaoMenu(valor);
		
	}

}
