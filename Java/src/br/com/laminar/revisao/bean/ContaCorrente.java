package br.com.laminar.revisao.bean;

import br.com.laminar.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;

public class ContaCorrente extends Conta {

    private TipoConta tipo;

    public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipo = tipo;
    }


    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if ( valor > getSaldo()) throw new SaldoInsuficienteException(valor);
        saldo -= valor;
    }
}
