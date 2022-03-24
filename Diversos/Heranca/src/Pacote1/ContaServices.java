package Pacote1;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ContaServices {

	private static Scanner entrada = new Scanner(System.in);
	private static Scanner entrada2 = new Scanner(System.in);

	public static void mostraContas(Conta[] contasCliente) {
		int contador = 1;
		int itemLista = 0;
		int contaEscolhida = -1;
		int opcoesPossiveis = contasCliente.length;

		List<Integer> opcoesContas = new LinkedList<>();

		for (Conta tipoConta : contasCliente) {
			itemLista = contador;
			opcoesContas.add(itemLista);
			System.out.println("\nDigite " + itemLista + " para a conta: \n " + tipoConta.toString() + "\n");
			contador++;
		}
		try {
			escolheConta(contaEscolhida, contasCliente, opcoesPossiveis, opcoesContas, entrada);
		} catch (InputMismatchException erro) {
			System.err.println("Voce digitou caracteres Invalidos para selecionar uma conta! Tente novamente!");
			escolheConta(contaEscolhida, contasCliente, opcoesPossiveis, opcoesContas, entrada2);
		}
	}

	public static Boolean escolheConta(int opcaoEscolhida, Conta[] contasCliente, int opcoesPossiveis,
			List<Integer> opcoes, Scanner entrada) throws InputMismatchException {
		
		System.out.print("\nInforme com qual conta deseja realizar a operação >>>");

		opcaoEscolhida = entrada.nextInt();

		if (!opcoes.contains(opcaoEscolhida)) {
			while (opcoes.contains(opcaoEscolhida) == false) {
				System.err.print("\nVoce digitou uma opção inválida!\nInforme uma opção de conta valida >>>");
				opcaoEscolhida = entrada.nextInt();
			}
		}

		carregaMenu(contasCliente, opcaoEscolhida, entrada);
		return true;
	}

	public static void carregaMenu(Conta[] conta, int contaEscolhida, Scanner entrada) {
		int opcao = -1;

		while (opcao != 0) {
			// APRESENTAÇÃO DAS OPÇOES DO MENU AO USUARIO

			System.out.print("\n\n ------------- MENU ------------" + "\n" + "\n|    1 - Consultar Saldo       	|"
					+ "\n|    2 - Depositar             	|" + "\n|    3 - Sacar		       	|"
					+ "\n|    4 - Saldo Geral		|" + "\n|   -----------------------    	|"
					+ "\n|    0  -  S A I R             	|" + "\n" + "\nInforme a opção desejada >>> ");

			// CAPTURA A OPÇÃO DO MENU DIGITADA PELO USUARIO
			opcao = entrada.nextInt();

			// Executa a opção escolhida pelo usuario
			switch (opcao) {
			case 1:
				for (Conta tipoConta : conta) {
					if (tipoConta == conta[contaEscolhida - 1])
						System.out.println(
								"\nSaldo da Conta " + tipoConta.nrConta + " >>> R$ " + tipoConta.getVlSaldo() + "\n");
				}

				break;

			case 2:
				for (Conta tipoConta : conta) {
					if (tipoConta == conta[contaEscolhida - 1]) {
						System.out.print("Informe o valor desejado para deposito >>> R$ ");
						double valor = entrada.nextDouble();
						tipoConta.deposita(valor);
					}
				}
				System.out.println("\nDepósito efetuado com sucesso! Consulte o Saldo para confirmar!");
				break;

			case 3:
				for (Conta tipoConta : conta) {
					if (tipoConta == conta[contaEscolhida - 1]) {
						System.out.print("Informe o valor para Saque >>> R$ ");
						double valor = entrada.nextDouble();
						tipoConta.saca(valor);
					}
				}
				System.out.println("\nSaque efetuado com sucesso! Consulte o Saldo para confirmar!");
				break;

			case 4:
				System.out.println("");
				for (Conta tipoConta : conta) {
					System.out.println("Saldo da Conta " + tipoConta.nrConta + " >>> R$ " + tipoConta.getVlSaldo());
				}
				System.out.println("");
				break;

			default:
				if (opcao != 0) {
					System.out.println("\n\nVoce precisa selecionar uma das opções válidas\n");
				}
				break;
			}
		}
		System.out.println("Obrigado por utilizar nosso sistema!");
		entrada.close();
		entrada2.close();
	}

}
