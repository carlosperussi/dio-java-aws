package br.com.exercicios04;
import java.util.Scanner;

public final class IngressoFamilia extends Ingresso {
    private static final Scanner SCANNER = new Scanner(System.in);

    public IngressoFamilia() {}

    public IngressoFamilia(double valorIngressoParam, String nomeDoFilmeParam, String tipoDeDublagemParam) {
        super(valorIngressoParam, nomeDoFilmeParam, tipoDeDublagemParam);
    }

    public static void comprarIngresso(Ingresso ingressoParam) {
        int quantidadeDeIngressos;
        double descontoIngresso = 0.0;
        double valorTotal;

        System.out.println("==============");
        if(ingressoParam.getNomeDoFilme() != null) {
            System.out.printf("O filme é cartaz é: %s. Quantos ingressos você deseja comprar? ", ingressoParam.getNomeDoFilme());
            quantidadeDeIngressos = SCANNER.nextInt();

            if(quantidadeDeIngressos > 3)
                descontoIngresso = (ingressoParam.getValorIngresso() * quantidadeDeIngressos) * 0.05;

            valorTotal = (ingressoParam.getValorIngresso() * quantidadeDeIngressos) - descontoIngresso;
            System.out.printf("O valor total da sua compra é de R$ %.2f%n.", valorTotal);
        }else
            System.out.println("Não há filmes em exibição.");
        System.out.println("==============");
    }
}
