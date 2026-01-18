package enumeration;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var option = 1;
        while(option != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1) Soma;");
            System.out.println("2) Subtração;");
            System.out.println("3) Multiplicação;");
            System.out.println("4) Divisão;");
            System.out.println("5) Sair.");
            option = scanner.nextInt();

            if(option > 5 || option < 1) {
                System.out.println("Selecione uma opção válida!");
                continue;
            }else if(option == 5)
                break;

            var selectedOption = OperationEnum.values()[option -1];

            System.out.println("Informe o primeiro valor: ");
            var valor1 = scanner.nextInt();
            System.out.println("Informe o segundo valor:");
            var valor2 = scanner.nextInt();

            var resultado = selectedOption.getCalculate().apply(valor1, valor2);

            System.out.printf("%s %s %s = %s \n\n", valor1, selectedOption.getSymbol(), valor2, resultado);

        }
    }
}
