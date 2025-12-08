import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        /*System.out.printf("Exercício 1: \nEscreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: \"Olá 'Fulano' você tem 'X' anos\"");
        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe seu ano de nascimento:");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá %s, você tem %s anos. \n", name, age);

        System.out.printf("Exercício 2: \nEscreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela");
        System.out.println("Por favor, informe o tamanho de um lado de um quadrado:");
        var squareSize = scanner.nextFloat();
        var totalArea = squareSize * squareSize;
        System.out.printf("A área total do quadrado é de %s!", totalArea);

        System.out.printf("Exercício 3: \nEscreva um código qeu receba a base e altura de um retângulo, calcule sua área e exiba na tela");
        System.out.println("Por favor, informe o tamanho da base de um triângulo:");
        var triangleBase = scanner.nextFloat();
        System.out.println("Agora, informe o tamanho da altura deste triângulo:");
        var triangleHeight = scanner.nextFloat();
        var totalTriangleArea = triangleBase * triangleHeight;
        System.out.printf("A área total do triângulo é de %s!", totalTriangleArea);*/
        
        System.out.printf("Exercício 4: \nEscreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre eleas ");
        System.out.println("Por favor, informe o nome da primeira pessoa:");
        var firstPersonName = scanner.next();
        System.out.println("Agora, informe a idade desta pessoa:");
        var firstPersonAge = scanner.nextInt();
        System.out.println("Agora, por favor informe o nome da segunda pessoa:");
        var secondPersonName = scanner.next();
        System.out.println("E por último, informe a idade desta pessoa:");
        var secondPersonAge = scanner.nextInt();
        var totalAgeDifference = firstPersonAge - secondPersonAge;
        System.out.printf("A diferença de idade entre %s e %s é de %s anos!", firstPersonName, secondPersonName, totalAgeDifference);
    }
}
