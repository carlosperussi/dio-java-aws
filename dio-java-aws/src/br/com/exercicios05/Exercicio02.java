package br.com.exercicios05;
import java.util.Scanner;

public class Exercicio02 {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static Imposto novoImposto;

    public static void main(String[] args) {
        int opcao;

        while(true) {
            System.out.println("==============");
            System.out.println("Escolha a categoria para o cálculo do imposto:");
            System.out.println("1) Alimentação;");
            System.out.println("2) Saúde e bem estar;");
            System.out.println("3) Vestuário;");
            System.out.println("4) Cultura;");
            System.out.println("5) Sair.");
            opcao = scanner.nextInt();

            if(opcao == 1) 
                novoImposto = criarImpostoDeAlimentacao();
            else if(opcao == 2) 
                novoImposto = criarImpostoDeSaude();
            else if(opcao == 3)
                novoImposto = criarImpostoDeVestuario();
            else if(opcao == 4)
                novoImposto = criarImpostoDeCultura();
            else if(opcao == 5)
                break;
            else {
                System.out.println("Opcao invalida. Saindo...");
                continue;
            }
            System.out.printf("O resultado do cálculo de imposto foi de %.2f%n", novoImposto.calcularImposto());
        }
    }

    public static Imposto criarImpostoDeAlimentacao() {
        System.out.printf("Informe o valor a ser gasto com alimentação: ");
        var valor = scanner.nextDouble();

        return new Alimentacao(valor);
    }

    public static Imposto criarImpostoDeSaude() {
        System.out.printf("Informe o valor a ser gasto com saúde e bem estar: ");
        var valor = scanner.nextDouble();

        return new SaudeBemEstar(valor);
    }

    public static Imposto criarImpostoDeVestuario() {
        System.out.printf("Informe o valor a ser gasto com vestuário: ");
        var valor = scanner.nextDouble();

        return new Vestuario(valor);
    }

    public static Imposto criarImpostoDeCultura() {
        System.out.printf("Informe o valor a ser gasto com cultura: ");
        var valor = scanner.nextDouble();

        return new Cultura(valor);
    }

}
