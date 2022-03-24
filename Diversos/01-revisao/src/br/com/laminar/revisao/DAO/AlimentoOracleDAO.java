package br.com.laminar.revisao.DAO;

import java.util.List;

import br.com.laminar.revisao.model.Alimento;

public class AlimentoOracleDAO implements AlimentoDAO{

	@Override
	public void cadastrar(Alimento alimento) {
		System.out.println("Cadastrando no Oracle");
		
	}

	@Override
	public List<Alimento> listar() {
		System.out.println("Listando do Oracle");
		return null;
	}
	

}
