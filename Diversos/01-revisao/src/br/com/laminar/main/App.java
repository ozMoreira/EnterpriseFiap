package br.com.laminar.main;
 import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.laminar.revisao.model.Alimento;
import br.com.laminar.revisao.model.Fornecedor;
import br.com.laminar.revisao.model.Organico;
import br.com.laminar.revisao.model.OrigemAlimento;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alimento churros = new Alimento("Churros tradicional", false, 300);
		
//		churros.setNome("");
//		churros.setSalgado(false);
//		churros.setValorCalorico(300);
		System.out.println("Alimento: " + churros.getNome());
		System.out.println("Total de Calorias: " + churros.calculaValorCalorico(3));
		System.out.println("Nome ok? " + churros.validaNome());
		
		System.out.println("------------");
		
		//instancia alimento organico
		Organico carne = new Organico("picanha", true, 1000, "Mato Grosso");
		
		System.out.println("Alimento: " + carne.getNome());
		System.out.println("Origem do(a) "+carne.getNome() +": " + carne.getOrigem());
		System.out.println("Total de Calorias: " + carne.calculaValorCalorico(2));
		System.out.println("Nome ok? " + carne.validaNome());
		
		//Lista alimento
		
		List<Alimento> lista = new ArrayList<>();
		lista.add(new Alimento("CarneBovina",true, 100));
		lista.add(new Alimento("Churros",false, 500));
		
		//percorrer lista
		for (int i=0; i< lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("");
		System.out.println("-------------------");
		System.out.println("");
		for (Alimento food : lista) {
			System.out.println(food);
		}
		
		//criando conjunto de alimentos
		Set<Alimento> conjunto = new HashSet<Alimento>();
		
		conjunto.add(churros);
		conjunto.add(churros);
		conjunto.add(new Alimento("CarneBovina",true, 100));
		System.out.println("");
		System.out.println("Conjunto");
		for (Alimento al : conjunto) {
			System.out.println(al);
		}
		System.out.println("");
		System.out.println("------------------- MAPA -------------------");
		System.out.println("");
		Map<Integer, Alimento > mapa = new HashMap<Integer, Alimento >();
		mapa.put(1, carne);
		mapa.put(2, churros);
		mapa.put(3, new Alimento("CarneBovina",true, 100));
		
		System.out.println(mapa.get(3));
		
		//recuperar as chaves
		Set<Integer> chaves = mapa.keySet();
		for (Integer i : chaves) {
			System.out.println(i + " " + mapa.get(i));
		}
		
		
		//Criar lista de fornecedores
		List<Fornecedor> lf = new ArrayList<>();
		
		//adicionar dois fornecedores
		lf.add(new Fornecedor(1, "Zezinho"));
		lf.add(new Fornecedor(2, "Joaozinho"));
		
		//Criar um alimento com todos os dados
		Alimento a1 = new Alimento("Arroz", true, 100, OrigemAlimento.VEGETAL, LocalDate.of(2021, 10, 1), lf);
		
		//exibir os dados dos alimentos
		System.out.println(a1);
		
		//exibir os dados do fornecedor
		for (Fornecedor f : lf) {
			System.out.println(f);
		}
	}

}