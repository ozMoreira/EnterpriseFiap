
public enum Aula17Enum {

	//utilizado para enumerar valores que nao sofrerão mutações, por ex: Logradouros (Rua, Avenida, Estrada Travessa e etc)
	
	//CONSTANT SEMPRE EM MAIUSCULO
	//DECLARA AS CONSTANT COM SUAS ASSINATURAS
	PESSOA_FISICA("1"), 
	PESSOA_JURIDICA ("Pessoa Juridica");
	
	//Variavel que receberá a assinatura do Enum
	private String texto;
	
	//Monta o construtor para receber a variavel com a assinatura como parametro
	Aula17Enum(String texto){
		//Passa o texto da variavel, para o parametro do construtor
		this.texto  = texto;
	}
	
	//Precisa criar o getter pois a variavel Texto que recebe a assinatura do ENUM é privada
	public String getTexto() {
		return texto;
	}
}
