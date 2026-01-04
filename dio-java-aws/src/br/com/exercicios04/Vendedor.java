package br.com.exercicios04;
import java.util.Scanner;

public non-sealed class Vendedor extends Funcionario {
    private int quantidadeDeVendas;
    private static final Scanner SCANNER = new Scanner(System.in);

    public Vendedor(String nomeFuncionarioParam, String emailFuncionariomParam, String senhaFuncionarioParam, boolean permissaoAdministradorParam) {
        super(nomeFuncionarioParam, emailFuncionariomParam, senhaFuncionarioParam, permissaoAdministradorParam);
        this.quantidadeDeVendas = 0;
    }

    public Vendedor() {}

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendasParam) {
        this.quantidadeDeVendas = quantidadeDeVendasParam;
    }

    public static void manipularVendedor() {
        int opt;
        Vendedor novoVendedor = new Vendedor();

        do {
            System.out.println("==============");
            System.out.println("Informe a opção desejada:");
            System.out.println("1) Cadastrar vendedor;");
            System.out.println("2) Realizar venda;");
            System.out.println("3) Consultar vendas;");
            System.out.println("4) Efetuar login;");
            System.out.println("5) Efetuar logoff;");
            System.out.println("6) Alterar dados;");
            System.out.println("7) Alterar senha;");
            System.out.println("9) Voltar.");
            opt = SCANNER.nextInt();

            switch (opt) {
                case 1:
                    novoVendedor = cadastrarVendedor();
                    break;
                case 2:
                    //realizarVenda();
                    break;
                case 3:
                    consultarVendas();
                    break;
                case 4:
                    efetuarLogin(novoVendedor);
                    break;
                case 5:
                    efetuarLogoff(novoVendedor);
                    break;
                case 6:
                    alterarDados(novoVendedor);
                    break;
                case 7:
                    alterarSenha(novoVendedor);
                default:
                    break;
            }
        } while (opt != 9);

        SCANNER.close();
    }

    public static Vendedor cadastrarVendedor() {
        String nomeFuncionario;
        String emailFuncionario;
        String senhaFuncionario;

        System.out.println("==============");
        System.out.printf("Informe o nome do vendedor: ");
        nomeFuncionario = SCANNER.next();
        System.out.printf("Informe o e-mail do vendedor: ");
        emailFuncionario = SCANNER.next();
        System.out.printf("Informe a senha do vendedor: ");
        senhaFuncionario = SCANNER.next();
        System.out.println("Vendedor cadastrado com sucesso!");
        System.out.println("==============");

        return new Vendedor(nomeFuncionario, emailFuncionario, senhaFuncionario, false);
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

    public static void efetuarLogin(Vendedor novoVendedorParam) {
        System.out.println("==============");

        if (!novoVendedorParam.getEstadoLogin()) {
            System.out.printf("Informe a senha: ");
            String senhaTemp = SCANNER.next();

            if (senhaTemp.equals(novoVendedorParam.getSenhaFuncionario())) {
                novoVendedorParam.setEstadoLogin(true);
                System.out.println("Login realizado!");
            }else
                System.out.println("Senha inválida!");
        } else {
            System.out.println("Gerente já possui login ativo.");
        }

        System.out.println("==============");
    }

    public static void efetuarLogoff(Vendedor novoVendedorParam) {
        System.out.println("==============");

        if (novoVendedorParam.getEstadoLogin()) {
            novoVendedorParam.setEstadoLogin(false);
            System.out.println("Logoff realizado!");
        } else
            System.out.println("Vendedor não possui login ativo.");

        System.out.println("==============");
    }

    public static void alterarDados(Vendedor novoVendedorParam) {
        String novoNome;
        String novoEmail;
        System.out.println("==============");

        if(novoVendedorParam.getNomeFuncionario() != null){
            System.out.printf("Informe o novo nome do vendedor: ");
            novoNome = SCANNER.next();
            System.out.printf("Informe o novo e-mail do vendedor: ");
            novoEmail = SCANNER.next();

            novoVendedorParam.setNomeFuncionario(novoNome);
            novoVendedorParam.setEmailFuncionario(novoEmail);
            System.out.println("Dados alterados com sucesso!");
        }else
            System.out.println("Nenhum gerente cadastrado!");
        
        System.out.println("==============");
    }

    public static void alterarSenha(Vendedor novoVendedorParam) {
        String senhaAtual;
        String novaSenha;
        System.out.println("==============");

        if(novoVendedorParam.getNomeFuncionario() != null){
            System.out.printf("Informe a senha atual: ");
            senhaAtual = SCANNER.next();

            if(senhaAtual.equals(novoVendedorParam.getSenhaFuncionario())) {
                System.out.printf("Informe a nova senha: ");
                novaSenha = SCANNER.next();

                novoVendedorParam.setSenhaFuncionario(novaSenha);
                System.out.println("Senha alterada com sucesso!");
            } else {
                System.out.println("Senha atual incorreta!");
            }
        }else
            System.out.println("Nenhum gerente cadastrado!");

        System.out.println("==============");
    }
}
