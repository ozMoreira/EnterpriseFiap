package br.com.laminar.revisao.bean;

import br.com.laminar.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

    private float taxa;
    public static  final double RENDIMENTO = 0.06;

    public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
        super(agencia, numero, dataAbertura, saldo);
        this.taxa = taxa;
    }


    @Override
    protected void sacar(double valor) throws SaldoInsuficienteException {
        double valorTaxado = valor + taxa;
        if ( valorTaxado > getSaldo()) throw new SaldoInsuficienteException(valor-taxa);
        saldo = getSaldo() - valorTaxado;
    }

    @Override
    public double calculaRetornoInvestimento() {
        return getSaldo() * RENDIMENTO;
    }
}
