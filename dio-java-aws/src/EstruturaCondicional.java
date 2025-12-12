import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (S/N)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");


        if(age >= 18) 
            System.out.printf("%s tem %s anos. Você pode dirigir! \n", name, age);
        else if(age >= 16 && isEmancipated)
            System.out.printf("Apesar de ter %s, você pode dirigir! \n", age);
        else
            System.out.printf("%s você não pode dirigir! \n", name);

        System.out.println("Fim da execução!");

        // Exemplo de Elvis operator
        /*
        var canDrive = (age >= 18) || (age >= 16 %% isEmancipated);
        var message = canDrive ?
                        name + ", você pode dirigir \n" :
                        name + ", você não pode dirigir \n";

        Com o Elvis operator, você inclui uma validação durante a atribuição de uma variável checando o seu valor. O ? é responsável por essa checagem e você inclui dua condições utilizando dois pontos (:)
        
        */
    }
}
