package br.com.exercicios04;
import java.util.Random;

public sealed abstract class Funcionario permits Gerente, Vendedor, Atendente {
    protected int matriculaFuncionario;
    protected String nomeFuncionario;
    protected String emailFuncionario;
    protected String senhaFuncionario;
    protected boolean estadoLogin;
    protected boolean permissaoAdministrador;

    public Funcionario(String nomeFuncionarioParam, String emailFuncionarioParam, String senhaFuncionarioParam, boolean permissaoAdministradorParam) {
        var randomNumber = new Random();
        this.matriculaFuncionario = randomNumber.nextInt(25);
        this.nomeFuncionario = nomeFuncionarioParam;
        this.emailFuncionario = emailFuncionarioParam;
        this.senhaFuncionario = senhaFuncionarioParam;
        this.permissaoAdministrador = permissaoAdministradorParam;
        this.estadoLogin = false;
    }

    public Funcionario () {}

    public boolean getEstadoLogin() {
        return this.estadoLogin;
    }

    public boolean getPermissaoAdministrador() {
        return this.permissaoAdministrador;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public String getEmailFuncionario() {
        return emailFuncionario;
    }
    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionarioParam) {
        this.nomeFuncionario = nomeFuncionarioParam;
    }

    public void setEmailFuncionario(String emailFuncionarioParam) {
        this.emailFuncionario = emailFuncionarioParam;
    }

    public void setSenhaFuncionario(String senhaFuncionarioParam) {
        this.senhaFuncionario = senhaFuncionarioParam;
    }

    public void setEstadoLogin(boolean estadoLoginParam) {
        this.estadoLogin = estadoLoginParam;
    }

    public void setPermissaoAdministrador(boolean permissaoAdministradorParam) {
        this.permissaoAdministrador = permissaoAdministradorParam;
    }
}
