package Pacote1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaCorrente extends Conta implements Tributos{
	private double chequeEspecial;
	private int diaTributario;
	private double txJurosTributario;

	public ContaCorrente(int nrConta, int nrAgencia, String nmBanco, double vlSaldo, double chequeEspecial, int diaTributario, double txJurosTributario) {
		super(nrConta, nrAgencia, nmBanco, vlSaldo);
		this.chequeEspecial = chequeEspecial;
		this.diaTributario = diaTributario;
		this.txJurosTributario = txJurosTributario;
		
	}

	
	
	
	public double getVlSaldo() {
		
		return getVlSaldoGeral() - getTributos();
	}

	
	public double getVlSaldoGeral() {
		return this.chequeEspecial + this.vlSaldo;
	}
	
	
	@Override
	public double getTributos() {
		
		Calendar data = Calendar.getInstance();
		SimpleDateFormat dia = new SimpleDateFormat("dd");
		
		if (Integer.parseInt(dia.format(data.getTime())) == 20) {
			return this.getVlSaldo() * 0.01; 
		} else
			return 0;
	}
	
	@Override
	public boolean saca(double valor) {
		double limiteTotal = this.chequeEspecial + this.vlSaldo;

		if (limiteTotal > 0 && limiteTotal >= valor && valor > 0) {
			this.vlSaldo -= valor;
			return true;
		} else {
			System.err.println("O valor desejado é maior que o seu limite disponível");
			return false;
		}
	}

	public void deposita(double valor) {
		this.vlSaldo += valor;
	}

	
	@Override
	public String toString() {
		return super.toString() + " ContaCorrente{" + "chequeEspecial=" + chequeEspecial + " Limite Total = R$ "
				+ getVlSaldo() + '}';
	}





}
