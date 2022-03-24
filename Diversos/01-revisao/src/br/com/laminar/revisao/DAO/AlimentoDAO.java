package br.com.laminar.revisao.DAO;

import java.util.List;

import br.com.laminar.revisao.model.Alimento;

//interface define as regras, metodos que as classes devem implementar (contrato)
public interface AlimentoDAO {

	void cadastrar(Alimento alimento);
	
	List<Alimento> listar();
}
