package br.com.exercicios04;
import java.util.Scanner;

public final class MeioIngresso extends Ingresso {
    private static final Scanner SCANNER = new Scanner(System.in);
    private double valorIngressoMeia;

    public MeioIngresso() {}

    public MeioIngresso(double valorIngressoParam, String nomeDoFilmeParam, String tipoDeDublagemParam, double valorIngressoMeiaParam) {
        super(valorIngressoParam, nomeDoFilmeParam, tipoDeDublagemParam);
        this.valorIngressoMeia = valorIngressoMeiaParam;
    }

    public static void comprarIngresso(Ingresso ingressoParam) {
        int quantidadeDeIngressos;

        System.out.println("==============");
        if(ingressoParam.getNomeDoFilme() != null) {
            System.out.printf("O filme é cartaz é: %s. Quantos ingressos você deseja comprar? ", ingressoParam.getNomeDoFilme());
            quantidadeDeIngressos = SCANNER.nextInt();
            double valorTotal = (ingressoParam.getValorIngresso() * quantidadeDeIngressos) / 2;
            System.out.printf("O valor total da sua compra é de R$ %.2f%n.", valorTotal);
        }else
            System.out.println("Não há filmes em exibição.");
        System.out.println("==============");
    }
}
