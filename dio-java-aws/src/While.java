import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";

        /* while (true) {
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit")) break;
        } */

        do {
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit")) break;
        } while(true);
    }
}
