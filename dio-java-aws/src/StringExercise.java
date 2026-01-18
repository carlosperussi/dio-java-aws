import java.util.HashMap;
import java.util.Map;

public class StringExercise {
    public static void main(String[] args) {
        var valor = "java";
        
        // Substituindo valores
        System.out.println("--------------");
        valor = valor.replaceFirst("j", "J");
        System.out.println(valor);

        // Quebrando a string
        System.out.println("--------------");
        var valorSplit  = valor.split("");
        for(var v: valorSplit) {
            System.out.println(v);
        }

        // Diminuindo para lower case
        System.out.println("--------------");
        System.out.println(valor.toLowerCase());

        // Aumentando para upper case
        System.out.println("--------------");
        System.out.println(valor.toUpperCase());

        // Validando se valor existe na string
        System.out.println("--------------");
        System.out.println(valor.contains("va"));

        // Procurando o indice de um caractere
        System.out.println("--------------");
        System.out.println(valor.indexOf("a"));

        // Validando se string começa com determinado valor
        System.out.println("--------------");
        System.out.println(valor.startsWith("Ja"));

        // Valudando se string termina com determinado valor
        System.out.println("--------------");
        System.out.println(valor.endsWith("ni"));

        // Eliminando espaços em branco
        System.out.println("--------------");
        var valorComEspaco = "   java   ";
        System.out.println(valorComEspaco.trim());
    }
}
