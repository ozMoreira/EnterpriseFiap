package Pacote1;

import java.util.InputMismatchException;

public class Application {


	public static void main(String[] args) {

		Conta[] contasCliente = new Conta[2];

		ContaCorrente cc = new ContaCorrente(110, 111, "Banco teste 2", 20.00, 10.00, 28, 0.01);
		ContaPoupanca cp = new ContaPoupanca(100, 000, "Banco Teste CP", 10.00, 28, 0.05, 28, 0.005);
		// popula o vetor com as contas instanciadas
		contasCliente[0] = cc;
		contasCliente[1] = cp;

		try {
			if (contasCliente != null)
				ContaServices.mostraContas(contasCliente);

			
		} catch (InputMismatchException erro) {
			System.err.println(
					"Voce digitou novamente um formato de seleção de contas inválidos!" + "\nEncerrando o Sistema!");
		} catch (NullPointerException erro2) {
			System.err.println(
					"Voce esta tentando acessar um vetor vazio!\n Faça a população do objeto antes de tentar utiliza-lo");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
