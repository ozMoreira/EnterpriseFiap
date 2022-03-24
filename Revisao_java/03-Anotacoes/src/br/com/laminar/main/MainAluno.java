package br.com.laminar.main;

import br.com.laminar.model.Aluno;
import br.com.laminar.model.Veiculo;
import br.com.laminar.orm.Orm;

public class MainAluno {

	public static void main(String[] args) {
		Aluno al = new Aluno();
		Veiculo vl = new Veiculo();
		
		Orm orm = new Orm();
		
		System.out.println(orm.pesquisar(al));
		System.out.println(orm.pesquisar(vl));
	}

}
