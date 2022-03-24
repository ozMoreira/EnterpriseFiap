package br.com.laminar.revisao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Alimento {

	protected String nome;
	private boolean salgado;
	protected float valorCalorico;
	
	private OrigemAlimento origemAlimento;
	private LocalDate dataValidade;
	private List<Fornecedor> fornecedores;

	
	public Alimento(String nome, boolean salgado, float valorCalorico, OrigemAlimento origemAlimento,
			LocalDate dataValidade, List<Fornecedor> fornecedores) {
		super();
		this.nome = nome;
		this.salgado = salgado;
		this.valorCalorico = valorCalorico;
		this.origemAlimento = origemAlimento;
		this.dataValidade = dataValidade;
		this.fornecedores = fornecedores;
	}

	public double calculaValorCalorico(int qtd) {
		return qtd * this.valorCalorico;
	}

	public double calculaValorCalorico(int qtd, boolean frito) {
		return frito ? calculaValorCalorico(qtd) * 1.5 : qtd * valorCalorico;
	}

	public Alimento(String nome) {
		super();
		this.nome = nome;
	}

	public Alimento(String nome, boolean salgado, float valorCalorico) {
		this.nome = nome;
		this.salgado = salgado;
		this.valorCalorico = valorCalorico;
	}

	public boolean validaNome(int qtd) {
		return nome.length() > qtd;
	}

	public boolean validaNome() {
//		if (nome.length() > 3) return true;
//		else return false;
//		return nome.length() > 3 ? true : false;
		return nome.length() > 3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isSalgado() {
		return salgado;
	}

	public void setSalgado(boolean salgado) {
		this.salgado = salgado;
	}

	public float getValorCalorico() {
		return valorCalorico;
	}

	public void setValorCalorico(float valorCalorico) {
		this.valorCalorico = valorCalorico;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return "Alimento [nome=" + nome + ", salgado=" + (salgado?"Salgado":"Doce") + ", valorCalorico=" + valorCalorico + " origem= " + origemAlimento+ "dataValidade= "+(dataValidade==null?"Nda":dataValidade.format(formatador) )+"]";
	}

	public OrigemAlimento getOrigemAlimento() {
		return origemAlimento;
	}

	public void setOrigemAlimento(OrigemAlimento origemAlimento) {
		this.origemAlimento = origemAlimento;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	
}