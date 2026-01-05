package br.com.exercicios04;

public sealed abstract class Ingresso permits MeioIngresso, IngressoNormal, IngressoFamilia {
    protected double valorIngresso;
    protected String nomeDoFilme;
    protected String tipoDeDublagem;

    public Ingresso() {}

    public Ingresso(double valorIngressoParam, String nomeDoFilmeParam, String tipoDeDublagemParam) {
        this.valorIngresso =  valorIngressoParam;
        this.nomeDoFilme = nomeDoFilmeParam;
        this.tipoDeDublagem = tipoDeDublagemParam;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public String getTipoDeDublagem() {
        return tipoDeDublagem;
    }

    public void setValorIngresso(double valorIngressoParam) {
        this.valorIngresso = valorIngressoParam;
    }

    public void setNomeDoFilme(String nomeDoFilmeParam) {
        this.nomeDoFilme = nomeDoFilmeParam;
    }

    public void setTipoDeDublagem(String tipoDeDublagemParam) {
        this.tipoDeDublagem = tipoDeDublagemParam;
    }
}
