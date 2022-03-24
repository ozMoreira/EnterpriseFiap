import java.util.Scanner;

public class Aula00MeuPrimeiroCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Hello World ... Ola Mundo!");
		//System.out.println("Este sistema eh muito facil");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ola! Por favor, informe o seu nome: >>> ");
		String nome = entrada.next();
		
		System.out.println("Seja muito bem vindo, "+ nome +" ao curso de Java!");
		
	}

}
