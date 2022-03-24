import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aula20Regex {

	public static void main(String[] args) {
		//Forma flexivel de encontrar caracateres dentro de um texto de forma flexivel e generica 
		//--  https://regexr.com/
		// import java.util.regex
		
		Scanner sc = new Scanner(System.in);
		
		//padrão do regex criado em que queremos validar o texto de acordo com a formatação desejada
		String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";

		//Variavel que recebera a string a ser validada
		System.out.print("Digite um numero de CPF, com a pontuacao >>> ");
		
		String cpf = sc.next();
		
		
		//Chamamos a classe que vai compilar o padrão do REGEX criado
		Pattern padrao = Pattern.compile(regex);
		
		//Classe responsavel por fazer a validação do regex na nossa variavel
		Matcher match = padrao.matcher(cpf);
		
		//Chama o metodo find, que nos retorna um valor booleado de acordo com o regex informado
		//System.out.println(match.find());
		
		if(match.find() == false) {
			System.out.println("Por gentileza, Digite o CPF de acordo com o Padrão Solicitado");
		} else {
			System.out.println("CPF " + cpf + " Devidamente correto!");
		}
		
		
		
	}

}
