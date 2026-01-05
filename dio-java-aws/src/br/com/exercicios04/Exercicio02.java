package br.com.exercicios04;
import java.util.Scanner;

public class Exercicio02 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Caixa novoCaixa = new Caixa();
        int opcao;
        
        do {
            System.out.println("==============");
            System.out.println("Comece informando qual tipo de funcionário você gostaria de gerenciar:");
            System.out.println("1) Gerente;");
            System.out.println("2) Vendedor;");
            System.out.println("3) Atendente;");
            System.out.println("0) Sair.");
            opcao = SCANNER.nextInt();

            switch (opcao) {
                case 1:
                    Gerente.manipularGerente(novoCaixa);
                    break;
                case 2:
                    Vendedor.manipularVendedor(novoCaixa);
                    break;
                case 3:
                    Atendente.manipularAtendente(novoCaixa);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

        SCANNER.close();
    }
}