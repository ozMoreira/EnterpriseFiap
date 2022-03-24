package br.com.laminar.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.laminar.anotacao.Coluna;
import br.com.laminar.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo veiculo = new Veiculo();
		
		System.out.println(veiculo.getClass().getName());
		System.out.println("\n");
		
		Field[] atributos =  veiculo.getClass().getDeclaredFields();
		System.out.println("Atributos");
		for (Field f : atributos) {
			System.out.println(f.getName() + " " + f.getType());
			Coluna anotacao = f.getAnnotation(Coluna.class);
			System.out.println("Nome da coluna " + anotacao.nome()+
					"\nChave Primaria? >>> " +anotacao.chave()+
					"\nTamanho: " + anotacao.tamanho()+"\n");
		}
		System.out.println("\n");
		
		Method[] metodos = veiculo.getClass().getDeclaredMethods();
		System.out.println("Metodos");
		for (Method m : metodos) {
			System.out.println(m.getName());
		}
		System.out.println("\n");
		
		
	}

}
