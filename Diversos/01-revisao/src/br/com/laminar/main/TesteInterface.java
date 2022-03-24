package br.com.laminar.main;

import br.com.laminar.revisao.DAO.AlimentoDAO;
import br.com.laminar.revisao.DAO.AlimentoOracleDAO;
import br.com.laminar.revisao.model.Alimento;

public class TesteInterface {

	public static void main(String[] args) {

	    AlimentoDAO aDao = new AlimentoOracleDAO();
		
		aDao.cadastrar(new Alimento("Carne Bovina", true, 100));
		aDao.listar();

	}

}
