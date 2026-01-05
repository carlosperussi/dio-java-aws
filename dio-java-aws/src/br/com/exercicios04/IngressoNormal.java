package br.com.exercicios04;
import java.util.Scanner;

public final class IngressoNormal extends Ingresso {
    private static final Scanner SCANNER = new Scanner(System.in);

    public IngressoNormal() {}

    public IngressoNormal(double valorIngressoParam, String nomeDoFilmeParam, String tipoDeDublagemParam) {
        super(valorIngressoParam, nomeDoFilmeParam, tipoDeDublagemParam);
    }

    public static void comprarIngresso(Ingresso ingressoParam) {
        int quantidadeDeIngressos;

        System.out.println("==============");
        if(ingressoParam.getNomeDoFilme() != null) {
            System.out.printf("O filme é cartaz é: %s. Quantos ingressos você deseja comprar? ", ingressoParam.getNomeDoFilme());
            quantidadeDeIngressos = SCANNER.nextInt();
            double valorTotal = ingressoParam.getValorIngresso() * quantidadeDeIngressos;
            System.out.printf("O valor total da sua compra é de R$ %.2f%n.", valorTotal);
        }else
            System.out.println("Não há filmes em exibição.");
        System.out.println("==============");
    }
}
