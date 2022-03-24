package br.com.fiap.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {

	public static void main(String[] args) {
		//Gerenciador de entidades
		//passa o nome do persiscente.xml do meta-inf, pra encontrar a configh de conexão
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		
		fabrica.close();
	}

}
