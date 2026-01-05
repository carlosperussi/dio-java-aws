package br.com.exercicios04;
import java.util.Scanner;

public class Exercicio01 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final CaixaDoCinema caixaDoCinema = new CaixaDoCinema();
    private static Ingresso novoIngresso;

    public static void main(String[] args) {
        int opcao;
        
        do {
            System.out.println("==============");
            System.out.println("Bem vindo ao sistema de gerenciamento de ingressos.");
            System.out.println("1) Cadastrar ingresso de filme;");
            System.out.println("2) Comprar ingresso;");
            System.out.println("0) Sair.");
            System.out.printf("Informe a opção desejada: ");
            opcao = SCANNER.nextInt();

            switch (opcao) {
                case 1:
                    novoIngresso = CaixaDoCinema.cadastrarIngresso();
                    break;
                case 2:
                    CaixaDoCinema.manipularIngresso(novoIngresso);
                    break;
                default:
                    break;
            }
        }while(opcao != 0);

        SCANNER.close();
    }
}
