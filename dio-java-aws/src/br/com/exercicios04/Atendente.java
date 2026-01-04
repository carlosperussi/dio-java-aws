package br.com.exercicios04;

public non-sealed class Atendente extends Funcionario {
    private double valorEmCaixa;

    public Atendente(String nomeFuncionarioParam, String emailFuncionariomParam, String senhaFuncionarioParam, boolean permissaoAdministradorParam, double valorEmCaixaParam) {
        super(nomeFuncionarioParam, emailFuncionariomParam, senhaFuncionarioParam, permissaoAdministradorParam);
        this.valorEmCaixa = valorEmCaixaParam;
    }

    public Atendente() {}

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
