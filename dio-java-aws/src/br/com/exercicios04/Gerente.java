package br.com.exercicios04;
import java.util.Scanner;

public non-sealed class Gerente extends Funcionario {
    private static final Scanner SCANNER = new Scanner(System.in);

    public Gerente(String nomeFuncionarioParam, String emailFuncionariomParam, String senhaFuncionarioParam, boolean permissaoAdministradorParam) {
        super(nomeFuncionarioParam, emailFuncionariomParam, senhaFuncionarioParam, permissaoAdministradorParam);
    }

    public Gerente () {}

    public static void manipularGerente() {
        int opt;
        Gerente novoGerente = new Gerente();

        do {
            System.out.println("==============");
            System.out.println("Informe a opção desejada:");
            System.out.println("1) Cadastrar gerente;");
            System.out.println("2) Consultar relatório financeiro;");
            System.out.println("3) Consultar vendas;");
            System.out.println("4) Efetuar login;");
            System.out.println("5) Efetuar logoff;");
            System.out.println("6) Alterar dados;");
            System.out.println("7) Alterar senha;");
            System.out.println("9) Voltar.");
            opt = SCANNER.nextInt();

            switch (opt) {
                case 1:
                    novoGerente = cadastrarGerente();
                    break;
                case 2:
                    consultarRelatorioFinanceiro();
                    break;
                case 3:
                    consultarVendas();
                    break;
                case 4:
                    efetuarLogin(novoGerente);
                    break;
                case 5:
                    efetuarLogoff(novoGerente);
                    break;
                case 6:
                    alterarDados(novoGerente);
                    break;
                case 7:
                    alterarSenha(novoGerente);
                default:
                    break;
            }
        } while (opt != 9);
        SCANNER.close();
    }

    public static Gerente cadastrarGerente() {
        String nomeFuncionario;
        String emailFuncionario;
        String senhaFuncionario;

        System.out.println("==============");
        System.out.printf("Informe o nome do gerente: ");
        nomeFuncionario = SCANNER.next();
        System.out.printf("Informe o e-mail do gerente: ");
        emailFuncionario = SCANNER.next();
        System.out.printf("Informe a senha do gerente: ");
        senhaFuncionario = SCANNER.next();
        System.out.println("Gerente cadastrado com sucesso!");
        System.out.println("==============");

        return new Gerente(nomeFuncionario, emailFuncionario, senhaFuncionario, true);
    }

    public static void consultarVendas() {
        System.out.println("==============");
        System.out.println("Consultando vendas...");
        System.out.println("==============");
    }

    public static void consultarRelatorioFinanceiro() {
        System.out.println("==============");
        System.out.println("Consultando relatório financeiro...");
        System.out.println("==============");
    }

    public static void efetuarLogin(Gerente novoGerenteParam) {
        System.out.println("==============");

        if (!novoGerenteParam.getEstadoLogin()) {
            System.out.printf("Informe a senha: ");
            String senhaTemp = SCANNER.next();

            if (senhaTemp.equals(novoGerenteParam.getSenhaFuncionario())) {
                novoGerenteParam.setEstadoLogin(true);
                System.out.println("Login realizado!");
            }else
                System.out.println("Senha inválida!");
        } else {
            System.out.println("Gerente já possui login ativo.");
        }

        System.out.println("==============");
    }

    public static void efetuarLogoff(Gerente novoGerenteParam) {
        System.out.println("==============");

        if (novoGerenteParam.getEstadoLogin()) {
            novoGerenteParam.setEstadoLogin(false);
            System.out.println("Logoff realizado!");
        } else
            System.out.println("Gerente não possui login ativo.");

        System.out.println("==============");
    }

    public static void alterarDados(Gerente novoGerenteParam) {
        String novoNome;
        String novoEmail;
        System.out.println("==============");

        if(novoGerenteParam.getNomeFuncionario() != null){
            System.out.printf("Informe o novo nome do gerente: ");
            novoNome = SCANNER.next();
            System.out.printf("Informe o novo e-mail do gerente: ");
            novoEmail = SCANNER.next();

            novoGerenteParam.setNomeFuncionario(novoNome);
            novoGerenteParam.setEmailFuncionario(novoEmail);

            System.out.println("Dados alterados com sucesso!");
        }else
            System.out.println("Nenhum gerente cadastrado!");
        
        System.out.println("==============");
    }

    public static void alterarSenha(Gerente novoGerenteParam) {
        String senhaAtual;
        String novaSenha;
        System.out.println("==============");

        if(novoGerenteParam.getNomeFuncionario() != null){
            System.out.printf("Informe a senha atual: ");
            senhaAtual = SCANNER.next();

            if(senhaAtual.equals(novoGerenteParam.getSenhaFuncionario())) {
                System.out.printf("Informe a nova senha: ");
                novaSenha = SCANNER.next();

                novoGerenteParam.setSenhaFuncionario(novaSenha);
                System.out.println("Senha alterada com sucesso!");
            } else {
                System.out.println("Senha atual incorreta!");
            }
        }else
            System.out.println("Nenhum gerente cadastrado!");

        System.out.println("==============");
    }
}
