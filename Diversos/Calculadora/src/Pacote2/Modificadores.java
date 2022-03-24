package Pacote2;

import Pacote1.Soma;


public class Modificadores {
	
	private void ModificadoresDeAcesso() {
		
		Double num1 = 2.0;
		Double num2 = 3.0;

		Soma obj = new Soma(num1, num2);
		obj.calculaSoma(num1,num2);
	}


	

	
}
