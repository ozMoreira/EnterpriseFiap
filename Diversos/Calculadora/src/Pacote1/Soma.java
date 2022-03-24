package Pacote1;

public class Soma   {
	//Declaração das propriedades / atributos
	public Double numero1;
	public Double numero2;
	
	
	//Constroi o objeto quando for instanciado
	public Soma(Double numero1, Double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	//Metodo que retorna a soma de dois numeros
	public Double calculaSoma(Double num1, Double num2 ) {
		return num1 + num2;
	}
}
