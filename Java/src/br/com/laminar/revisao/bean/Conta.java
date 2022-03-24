package br.com.laminar.revisao.bean;

import br.com.laminar.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;

public abstract class Conta {

    private int agencia;
    private int numero;
    private Calendar dataAbertura;
    protected double saldo;

    public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void depositar  (double valor){
        saldo += valor;
    }

    protected abstract void sacar (double valor) throws SaldoInsuficienteException;

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}

