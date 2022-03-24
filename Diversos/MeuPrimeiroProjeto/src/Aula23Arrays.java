
public class Aula23Arrays {

	public static void main(String[] args) {
		//Lista é dinamica, voce pode aumentar e diminiur os itens da coleção
		//Array é pre-determinada, não organica.
		
		//instanciando um array
		int[] valores = new int[4];
		
		valores[0] = 5; //1
		valores[1] = 10; //2
		valores[2] = 15; //3
		valores[3] = 20; //4
		
		//recuperando os dados do array
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		System.out.println("-----------------------------------");
		
		
		//invertendo valores
		int[] inverteOrdem = new int[valores.length];
		

		int posMax = valores.length -1;

		for (int i = posMax; i >= 0; i--) {
			inverteOrdem[posMax - i] = valores[i];
			
		}
		
		for (int i = 0; i < inverteOrdem.length; i++) {
			System.out.println(inverteOrdem[i]);
		}
		
	}

}
