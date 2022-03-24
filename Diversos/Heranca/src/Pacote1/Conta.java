package Pacote1;

//toda a vez que vc usa uma classe abstracta....ela devera ter membros abstratos tb
public abstract class Conta {

	protected int nrConta;
	private int nrAgencia;
	private String nmBanco;
	protected double vlSaldo;
	
	public Conta(int nrConta, int nrAgencia, String nmBanco, double vlSaldo) {
		this.nrConta = nrConta;
		this.nrAgencia = nrAgencia;
		this.nmBanco = nmBanco;
		this.vlSaldo = vlSaldo;
	}
	
	public abstract double getVlSaldo();
	
    public abstract boolean saca(double valor);
    
    public void deposita(double valor){
    	this.vlSaldo += valor;
    	}

	@Override
	public String toString() {
		return "Conta [Conta Numero=" + nrConta + ", Numero da Agencia=" + nrAgencia + ", Banco=" + nmBanco + ", Saldo Atual="
				+ vlSaldo + "]";
	}
	
	
	
}
