package br.com.laminar.revisao.main;

import br.com.laminar.revisao.bean.ContaCorrente;
import br.com.laminar.revisao.bean.ContaPoupanca;
import br.com.laminar.revisao.bean.TipoConta;
import br.com.laminar.revisao.exception.SaldoInsuficienteException;

import java.util.Calendar;
import java.util.HashSet;


public class Main {

    public static void main(String[] args)  {

        ContaCorrente cc = new ContaCorrente(0001,101, Calendar.getInstance(),100, TipoConta.COMUM);
        ContaPoupanca cp = new ContaPoupanca(0002, 202, Calendar.getInstance(), 200, 20);

        cc.depositar(19);

        try {
            cc.sacar(200);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }



        HashSet<ContaCorrente> listaCC = new HashSet<ContaCorrente>();

        listaCC.add(new ContaCorrente(0001,303, Calendar.getInstance(),300, TipoConta.COMUM));
        listaCC.add(new ContaCorrente(0001,404, Calendar.getInstance(),400, TipoConta.ESPECIAL));
        listaCC.add(new ContaCorrente(0001,505, Calendar.getInstance(),500, TipoConta.PREMIUM));

        for (ContaCorrente conta : listaCC){
            System.out.println("O saldo da conta " + conta.getNumero() + " é R$ " + conta.getSaldo());
        }

    }
}
