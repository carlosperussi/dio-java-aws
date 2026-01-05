package br.com.exercicios04;

public class Caixa {
    private int quantidadeDeVendas;
    private double valorEmCaixa;

    public Caixa() {}

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendasParam) {
        this.quantidadeDeVendas = quantidadeDeVendasParam;
    }

    public void setValorEmCaixa(double valorEmCaixaParam) {
        this.valorEmCaixa = valorEmCaixaParam;
    }
}
