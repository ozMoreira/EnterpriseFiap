package br.com.laminar.orm;

import br.com.laminar.anotacao.Tabela;

public class Orm {
	
	//1 - Criar a anotação @Tabela
	//2 - Criar a classe Aluno e utilizar a anotação
	//3 - Implementar o metodo pesquisar da Classe Orm
	//4 - Criar uma classe com método main para testar o metodo de pesquisa
	
	/*
	 * Recupera o valor do parametro do nome da anotação @tabela e retorna
	 * o sql
	 * @param obj
	 * @Return SQL para pesquisar os registros da tabela
	 */

	public String pesquisar(Object obj) {
		Tabela tab = obj.getClass().getAnnotation(Tabela.class);
		return "SELECT * FROM " + tab.nome();		
	}
}
