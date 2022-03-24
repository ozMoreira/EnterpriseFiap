package br.com.laminar.revisao.model;

public class Organico extends Alimento{

	private String origem; //é um .... tipo de....

	private TipoOrganico tipo; //todo alimento organico tem um ....tipo de.... vegetal, animal, etc
	
	public Organico(String nome) {
		super(nome);
	}
	
	public Organico(
			String nome, 
			boolean salgado, 
			float valorCalorico, 
			String origem) {
		
		super(nome, salgado, valorCalorico);
		this.origem = origem;
	}
	
	public double calculaValorCalorico(int qtd) {
		return (qtd * valorCalorico)*0.8;
	}
	
	public boolean validaNome() {
		return nome.length() > 10;
	}
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@Override
	public String toString() {
		return super.toString() + "Organico [origem=" + origem + ", tipo=" + tipo + "]";
	}


	
	
	
}
