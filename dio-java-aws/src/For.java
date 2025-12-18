import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        for(var i = 0; i <= 100; i++) {
            if(i % 2 == 0) continue;

            System.out.println(i);
        }

        /* 
            Exemplo bobo de loop infinito

        for(;;) {
            System.out.println("Digite o seu nome:");
            var name = scanner.next();

            if(name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        }
        */

        scanner.close();
    }
}
