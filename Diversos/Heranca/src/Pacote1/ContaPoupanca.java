package Pacote1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaPoupanca extends Conta implements Tributos {

	private int diaAniversario;
	private double txJuros;
	private int diaTributario;
	private double txJurosTributario;

	public ContaPoupanca(int nrConta, int nrAgencia, String nmBanco, double vlSaldo, int diaAniversario,
			double taxaDeJuros, int diaTributario, double txJurosTributario) {
		super(nrConta, nrAgencia, nmBanco, vlSaldo);
		this.diaAniversario = diaAniversario;
		this.diaTributario = diaTributario;
		this.txJurosTributario = txJurosTributario;
	}

	public double getVlSaldo() {
		return getRendimentos() - getTributos();
	}

	private double getRendimentos() {
		Calendar data = Calendar.getInstance();
		SimpleDateFormat dia = new SimpleDateFormat("dd");

		if (Integer.parseInt(dia.format(data.getTime())) == this.diaAniversario) {
			return this.vlSaldo + this.txJuros * this.vlSaldo;
		} else
			return this.vlSaldo;
	}

	
	@Override
	public double getTributos() {
		Calendar data = Calendar.getInstance();
		SimpleDateFormat dia = new SimpleDateFormat("dd");

		if (Integer.parseInt(dia.format(data.getTime())) == this.diaTributario) {
			return this.getRendimentos() * this.txJurosTributario;
		} else
			return 0;

	}
	@Override
	public boolean saca(double valor) {
		if (getVlSaldo() > 0 && getVlSaldo() >= valor && valor > 0) {
			this.vlSaldo -= valor;
			return true;
		} else {
			System.err.println("O valor desejado é maior que o Saldo em sua conta");
			return false;
		}
	}

	
	@Override
	public void deposita(double valor) {
		this.vlSaldo += valor;
	}

	@Override
	public String toString() {
		return super.toString() + " ContaPoupanca{" + "diaAniversario=" + diaAniversario + ", taxaDeJuros=" + txJuros
				+ '}';
	}

	

}
