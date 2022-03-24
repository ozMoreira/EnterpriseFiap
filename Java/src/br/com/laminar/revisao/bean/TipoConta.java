package br.com.laminar.revisao.bean;

public enum TipoConta {

    COMUM("Conta Comum"),
    ESPECIAL("Conta Especial"),
    PREMIUM ("Conta Premium");

    private String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
