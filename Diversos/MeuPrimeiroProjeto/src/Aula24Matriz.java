
public class Aula24Matriz {

	public static void main(String[] args) {
		// Uma matriz é um Vetor de vetores

		//primeiro vetor = qtd. semanas
		//segundo vetor = qtd. dias
		
		int[][] calendario = new int[7][7];

		int dia = 0;

		//para cada semana, enquanto o indice da semana for menor que 7 semanas
		for (int i = 0; i < 7; i++) {
			//para cada dia, enquanto dia for menor que 7 dias
			for (int d = 0; d < 7; d++) {
				//gera um novo dia
				dia++;
				//calendario recebe o novo dia
				calendario[i][d] = dia;
			}
		}
		
		
		//percorre as semanas, linha por linha
		for (int i = 0; i < calendario.length; i++) {
			//percorre para cada linha, cada uma de suas colunas
			for (int x = 0; x < calendario.length; x++) {
				if (calendario[i][x] < 32)
					//imprimi o que existe nessa "coordenada geografica"
					System.out.print(calendario[i][x] + " ");
			}
			//quebra a linha para a próxima, afim de nao colocar tudo numa mesma linha
			System.out.println("");
		}

	}

}
