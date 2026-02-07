package br.com.exercicios06;

import java.util.Arrays;
import java.util.Scanner;

import br.com.exercicios06.calc.Operation;

public class Exercicio01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o número da operação que deseja realizar: (1 - SUM ou 2 - SUBTRACTION)");
        var operationOption = scanner.nextInt();

        while(operationOption > 2 || operationOption < 1) {
            System.out.println("Escolha uma opão válida:  (1 - SUM ou 2 - SUBTRACTION)");
            
            operationOption = scanner.nextInt();
        }

        var selectedOperation = Operation.values()[operationOption - 1];
        System.out.println("Informe os números que serão utilizados na operação, separados por vírgula: ");
        var numbers = scanner.next();
        var numberArray = Arrays.stream(numbers.split(",")).mapToLong(Long::parseLong).toArray();

        var result = selectedOperation.getOperationCallBack().exec(numberArray);
        System.out.printf("O resultado da operação de %s é %s \n", selectedOperation.name(), result);

        scanner.close();
        
    }
}
