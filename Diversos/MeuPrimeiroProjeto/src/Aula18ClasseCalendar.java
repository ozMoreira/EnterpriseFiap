import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aula18ClasseCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Classe Calendar é uma classe do Java que permite trabalhar com datas de maneira 
		//simples e inteligente.
		//Ja reconhece os meses corretos e quantos dias tem em cada mes
		
		Calendar dataAtual =  Calendar.getInstance();
		System.out.println(dataAtual.getTime());
		
		/*
		
		//reseto a data, para data atual.
		dataAtual = Calendar.getInstance();
		//add dia à data atual
		dataAtual.add(Calendar.DAY_OF_MONTH, 365);
		System.out.println(dataAtual.getTime());
		
	
	
		//reseto a data, para data atual.
		dataAtual = Calendar.getInstance();
		// add mes À data atual
		dataAtual.add(Calendar.YEAR, 100);
		System.out.println(dataAtual.getTime());
	
		
		
		//determina um mes especifico para a da ta
		dataAtual.set(Calendar.MONTH, Calendar.DECEMBER);
		dataAtual.add(Calendar.YEAR, -1);
		System.out.println(dataAtual.getTime());
				*/
		
		
		//formatar as datas
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formataData.format(dataAtual.getTime()));
		
		
	}

}
