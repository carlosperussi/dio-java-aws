package br.com.exercicios04;
import java.util.Scanner;

public class CaixaDoCinema {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final IngressoNormal novoIngresso = new IngressoNormal();
    private static final MeioIngresso novoMeioIngresso = new MeioIngresso();
    private static final IngressoFamilia novoIngressoFamilia = new IngressoFamilia();

    public static Ingresso cadastrarIngresso() {
        double valorIngresso;
        String nomeDoFilme;
        String tipoDeDublagem;
        IngressoNormal ingressoTemp;

        System.out.println("==============");
        System.out.printf("Informe o nome do filme: ");
        nomeDoFilme = SCANNER.next();
        System.out.printf("Informe se o filme é dublado ou legendado: ");
        tipoDeDublagem = SCANNER.next();
        System.out.printf("Informe o valor do ingresso: ");
        valorIngresso = SCANNER.nextDouble();

        ingressoTemp = new IngressoNormal(valorIngresso, nomeDoFilme, tipoDeDublagem);
        System.out.println("Ingresso cadastrado com sucesso!");
        System.out.println("==============");
        return ingressoTemp;
    }

    public static void manipularIngresso(Ingresso ingressoParam) {
        int opcao;

        do {
            System.out.println("==============");
            System.out.println("Informe o tipo de ingresso que deseja comprar:");
            System.out.println("1) Ingresso normal;");
            System.out.println("2) Meio ingresso;");
            System.out.println("3) Ingresso família;");
            System.out.println("9) Sair;");
            System.out.printf("Informe a opção desejada: ");
            opcao = SCANNER.nextInt();

            switch (opcao) {
                case 1:
                    novoIngresso.comprarIngresso(ingressoParam);
                    break;
                case 2:
                    novoMeioIngresso.comprarIngresso(ingressoParam);
                    break;
                case 3:
                    novoIngressoFamilia.comprarIngresso(ingressoParam);
                    break;
                default:
                    break;
            }
        }while (opcao != 9);
    }
}
