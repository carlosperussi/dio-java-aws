import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.printf("Exercício 1: Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;\n");

        System.out.println("Informe um número qualquer:");
        var exec1Numer = scanner.nextInt();

        for(var i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s\n", exec1Numer, i, exec1Numer * i);
        }

        System.out.printf("Exercício 2: Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC (IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:\n");
        System.out.println("Informe o seu peso (ex: xx,xx)");
        var exec2Peso = scanner.nextFloat();
        System.out.println("Informe sua altura: (xx,xx)");
        var exec2Altura = scanner.nextFloat();
        var exec2Imc = exec2Peso / (exec2Altura * exec2Altura);
        double exec2ImcTrunc = Math.floor(exec2Imc * 100.0) / 100.0;

        if(exec2ImcTrunc <= 18.5f)
            System.out.println("Abaixo do peso!");
        else if(exec2ImcTrunc >= 18.6f && exec2ImcTrunc <= 24.9f)
            System.out.println("Peso ideal!");
        else if(exec2ImcTrunc >= 25.0f && exec2ImcTrunc <= 29.9f)
            System.out.println("Levemente acima do peso!");
        else if(exec2ImcTrunc >= 30.0f && exec2ImcTrunc <= 34.9f)
            System.out.println("Obesidade grau I!");
        else if(exec2ImcTrunc >= 35.0f && exec2ImcTrunc <= 39.9f)
            System.out.println("Obesidade gray II (severa)!");
        else
            System.out.println("Obesidade grau III! (mórbida)");

        System.out.printf("Exercício 3: Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par ou impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados em ordem decrescente:\n");

        System.out.println("Informe um número qualquer:");
        var exec3Number1 = scanner.nextInt();
        System.out.println("Agora informe qualquer outro número maior do que o primeiro informado:");
        var exec3Number2 = scanner.nextInt();
        var exec3TypeOfNumber = "";
        var exec3Checker = "";
        
        do {
            System.out.println("Agora informe se você quer ver números pares ou ímpares: (par/impar)");
            exec3TypeOfNumber = scanner.next();
            
            if(exec3TypeOfNumber.equalsIgnoreCase("par"))
                exec3Checker = "par";
            else if(exec3TypeOfNumber.equalsIgnoreCase("impar"))
                exec3Checker = "impar";
        }while(exec3Checker == "");

        System.out.println("Vejamos a mágica acontecer...");

        do {
            var exec3NumberValidator = false;

            if(exec3Number2 % 2 == 0) 
                exec3NumberValidator = true;
            else
                exec3NumberValidator = false;

            if(exec3Checker.equalsIgnoreCase("par") && exec3NumberValidator)
                System.out.println(exec3Number2 + " - par;");
            else if(exec3Checker.equalsIgnoreCase("impar") && !exec3NumberValidator)
                System.out.println(exec3Number2 + " - ímpar;");

            exec3Number2--;
        }while(exec3Number2 >= exec3Number1);

        System.out.printf("Exercício 4: Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de zero na divisão, números menores que o primeiro devem ser ignorados:");

        System.out.println("Informe um número:");
        var exec4Number = scanner.nextInt();
        var exec4KeepVerify = true;

        while(exec4KeepVerify) {
            System.out.println("Informe o número para verificação:");
            var exec4NumberToVerify = scanner.nextInt();

            if(exec4NumberToVerify < exec4Number) {
                System.out.printf("Informe um número maior que %s! \n", exec4Number);
                continue;
            }

            var exec4Result = exec4NumberToVerify % exec4Number;
            exec4KeepVerify = exec4Result == 0;
            System.out.printf("%s %% %s = %s \n", exec4NumberToVerify, exec4Number, exec4Result);
        }
       scanner.close();
    }
}
