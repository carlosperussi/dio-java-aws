package br.com.exercicios04;
import java.util.Scanner;


public non-sealed class Atendente extends Funcionario {
    private double valorEmCaixa;
    private static final Scanner SCANNER = new Scanner(System.in);

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

    public static void manipularAtendente(Caixa novoCaixaParam) {
        int opt;
        Atendente novoAtendente = new Atendente();

        do {
            System.out.println("==============");
            System.out.println("Informe a opção desejada:");
            System.out.println("1) Cadastrar atendente;");
            System.out.println("2) Receber pagamentos;");
            System.out.println("3) Fechar caixa;");
            System.out.println("4) Efetuar login;");
            System.out.println("5) Efetuar logoff;");
            System.out.println("6) Alterar dados;");
            System.out.println("7) Alterar senha;");
            System.out.println("9) Voltar.");
            opt = SCANNER.nextInt();

            switch (opt) {
                case 1:
                    novoAtendente = cadastrarAtendente();
                    break;
                case 2:
                    receberPagamentos(novoAtendente);
                    break;
                case 3:
                    fecharCaixa(novoAtendente, novoCaixaParam);
                    break;
                case 4:
                    efetuarLogin(novoAtendente);
                    break;
                case 5:
                    efetuarLogoff(novoAtendente);
                    break;
                case 6:
                    // alterarDados(novoAtendente);
                    break;
                case 7:
                    // alterarSenha(novoAtendente);
                default:
                    break;
            }
        } while (opt != 9);
    }

    public static Atendente cadastrarAtendente() {
        String nomeFuncionario;
        String emailFuncionario;
        String senhaFuncionario;
        double valorEmCaixa = 0.0;

        System.out.println("==============");
        System.out.printf("Informe o nome do atendente: ");
        nomeFuncionario = SCANNER.next();
        System.out.printf("Informe o e-mail do atendente: ");
        emailFuncionario = SCANNER.next();
        System.out.printf("Informe a senha do atendente: ");
        senhaFuncionario = SCANNER.next();
        System.out.println("Atendente cadastrado com sucesso!");
        System.out.println("==============");

        return new Atendente(nomeFuncionario, emailFuncionario, senhaFuncionario, false, valorEmCaixa);
    }

    public static void receberPagamentos(Atendente novoAtendenteParam) {
        System.out.println("==============");

        if (novoAtendenteParam.getEstadoLogin()) {
            System.out.printf("Informe o valor do pagamento a ser recebido: ");
            double valorRecebido = SCANNER.nextDouble();
            novoAtendenteParam.setValorEmCaixa(novoAtendenteParam.getValorEmCaixa() +  valorRecebido);
            System.out.println("Pagamento recebido com sucesso!");
            System.out.println("Valor atual em caixa: " + novoAtendenteParam.getValorEmCaixa());
        }else {
            System.out.println("Atendente precisa estar logado para receber pagamentos!");
            return;
        }

        System.out.println("==============");
    }

    public static void fecharCaixa(Atendente novoAtendenteParam, Caixa novoCaixaParam) {
        System.out.println("==============");

        if (novoAtendenteParam.getEstadoLogin()) {
            System.out.println("Fechando caixa...");
            novoCaixaParam.setValorEmCaixa(novoAtendenteParam.getValorEmCaixa());
            System.out.println("Total em caixa: " + novoAtendenteParam.getValorEmCaixa());
            System.out.println("Total de vendas realizadas: " + novoCaixaParam.getQuantidadeDeVendas());
            novoAtendenteParam.setValorEmCaixa(0.0);
            novoCaixaParam.setQuantidadeDeVendas(0);
            System.out.println("Caixa fechado com sucesso!");
        }else {
            System.out.println("Atendente precisa estar logado para fechar o caixa!");
            return;
        }

        System.out.println("==============");
    }

    public static void efetuarLogin(Atendente novoAtendenteParam) {
        System.out.println("==============");

        if(novoAtendenteParam.getNomeFuncionario() != null) {
            if (!novoAtendenteParam.getEstadoLogin()) {
                System.out.printf("Informe a senha: ");
                String senhaTemp = SCANNER.next();

                if (senhaTemp.equals(novoAtendenteParam.getSenhaFuncionario())) {
                    novoAtendenteParam.setEstadoLogin(true);
                    System.out.println("Login realizado!");
                }else
                    System.out.println("Senha inválida!");
            } else {
                System.out.println("Atendente já possui login ativo.");
            }
        }else
            System.out.println("Nenhum atendente cadastrado!");

        System.out.println("==============");
    }

    public static void efetuarLogoff(Atendente novoAtendenteParam) {
        System.out.println("==============");

        if (novoAtendenteParam.getEstadoLogin()) {
            novoAtendenteParam.setEstadoLogin(false);
            System.out.println("Logoff realizado!");
        } else
            System.out.println("Atendente não possui login ativo.");

        System.out.println("==============");
    }

    public static void alterarDados(Atendente novoAtendenteParam) {
        String novoNome;
        String novoEmail;
        System.out.println("==============");

        if(novoAtendenteParam.getNomeFuncionario() != null){
            System.out.printf("Informe o novo nome do atendente: ");
            novoNome = SCANNER.next();
            System.out.printf("Informe o novo e-mail do atendente: ");
            novoEmail = SCANNER.next();

            novoAtendenteParam.setNomeFuncionario(novoNome);
            novoAtendenteParam.setEmailFuncionario(novoEmail);
            System.out.println("Dados alterados com sucesso!");
        }else
            System.out.println("Nenhum gerente cadastrado!");
        
        System.out.println("==============");
    }

    public static void alterarSenha(Atendente novoAtendenteParam) {
        String senhaAtual;
        String novaSenha;
        System.out.println("==============");

        if(novoAtendenteParam.getNomeFuncionario() != null){
            System.out.printf("Informe a senha atual: ");
            senhaAtual = SCANNER.next();

            if(senhaAtual.equals(novoAtendenteParam.getSenhaFuncionario())) {
                System.out.printf("Informe a nova senha: ");
                novaSenha = SCANNER.next();

                novoAtendenteParam.setSenhaFuncionario(novaSenha);
                System.out.println("Senha alterada com sucesso!");
            } else {
                System.out.println("Senha atual incorreta!");
            }
        }else
            System.out.println("Nenhum gerente cadastrado!");

        System.out.println("==============");
    }
    
}
