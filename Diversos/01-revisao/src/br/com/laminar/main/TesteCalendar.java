package br.com.laminar.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TesteCalendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance();
		
		Calendar abertura = new GregorianCalendar(2022,Calendar.FEBRUARY,22,21,0);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(dataFormatada.format(hoje.getTime()));
		System.out.println(dataFormatada.format(abertura.getTime()));
		
		List<String> datas = new ArrayList<>();
		
		//Mais Utilizado com o java 8 ou maior
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter htf = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter dhtf = DateTimeFormatter.ofPattern("dd/MM/yyy - HH:mm:ss");
		//data atual
		datas.add("Data Atual - " + dtf.format(LocalDate.now()).toString());
		
		//Criar data de apresenta��o da banca 25/05/2022
		datas.add("Data Banca - " + dtf.format(LocalDate.of(2022,05,25)).toString());
		//criar a hora atual
		datas.add("Hora Atual - " + htf.format(LocalTime.now()).toString());
		
		//criar a hora do come�o do intervalo
		datas.add("Hora Intervalo - " + htf.format(LocalTime.of(21,00)).toString());
		
		//criar a data e hora atuais
		datas.add("Data Hora Atual - " + dhtf.format(LocalDateTime.now()).toString());
		
		//criar a data de colacao de grau 27/03/2022 - 18:00
		datas.add("Data Hora Atual - " + dhtf.format(LocalDateTime.of(2023,3,27,18,0)).toString());
		
		
		System.out.println("-----------------------");
		//exibir datas
		for (String data : datas) {
			System.out.println(data);
		}
		
		
		
		
	}

}
