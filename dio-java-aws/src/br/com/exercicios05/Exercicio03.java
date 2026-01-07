package br.com.exercicios05;
import java.util.Scanner;

public class Exercicio03 {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static FormaGeometrica formaGeometrica = null;
    public static void main(String[] args) {
        int opcao;
        
        while(true) {
            System.out.println("==============");
            System.out.println("Escolha a forma geometrica para calcular a area:");
            System.out.println("1) Quadrado");
            System.out.println("2) Retangulo");
            System.out.println("3) Circulo");
            System.out.println("4) Sair.");
            opcao = scanner.nextInt();

            if(opcao == 1) 
                formaGeometrica = criarQuadrado();
            else if(opcao == 2) 
                formaGeometrica = criarRetangulo();
            else if(opcao == 3)
                formaGeometrica = criarCirculo();
            else if(opcao == 4)
                break;
            else {
                System.out.println("Opcao invalida. Saindo...");
                continue;
            }

            System.out.println("O resultado do cálculo da área foi de: " + formaGeometrica.getArea());
        }
        
        scanner.close();
    }

    private static FormaGeometrica criarQuadrado() {
        System.out.printf("Informe o tamanho dos lados: ");
        var lado = scanner.nextDouble();

        return new Quadrado(lado);
    }

    private static FormaGeometrica criarRetangulo() {
        System.out.printf("Informe o tamanho da base: ");
        var base = scanner.nextDouble();
        System.out.printf("Informe a altura: ");
        var altura = scanner.nextDouble();

        return new Retangulo(base, altura);
    }

    private static FormaGeometrica criarCirculo() {
        System.out.printf("Informe o raio do circulo: ");
        var raio = scanner.nextDouble();

        return new Circulo(raio);
    }
}
