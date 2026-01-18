import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // Criando um objeto do tipo List
        List lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        var a = lista.get(0);
        System.out.println(a);

        // Criando uma lista tipada
        List<String> nomesLista = new ArrayList<>();
        nomesLista.add("Carlos");
        String nome = nomesLista.get(0);
        System.out.println(nome);

        // Criando um array
        int[] codigos = new int[2];
        codigos[0] = 1;
        codigos[1] = 2;
        System.out.println(codigos[0]);

        // Criando array com inicialização direta
        String[] nomes = {"Ana", "Maria", "João"};
        System.out.println(nomes[1]);

        // Imprimindo todos os nomes do array com comandos lambda
        lista.forEach(System.out::println);

        // Criando uma lista com objetos do tipo Pessoa
        List<PessoaLista> pessoas = new ArrayList<>();
        var pessoa01 = new PessoaLista("Carlos", 38);
        var pessoa02 = new PessoaLista("Camilla", 32);
        pessoas.add(pessoa01);
        pessoas.add(pessoa02);

        System.out.println(pessoas.contains(pessoa01));
        System.out.println(pessoas.size());

        // Criando vetores e comparando a performance
        var arrayStart = OffsetDateTime.now();
        List<Integer> numeros = new ArrayList<>();

        for(int i = 0; i < 100_000_000; i++) {
            numeros.add(i);
        }

        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());

        var vectorStart = OffsetDateTime.now();
        List<Integer> numerosVector = new ArrayList<>();

        for(int i = 0; i < 100_000_000; i++) {
            numerosVector.add(i);
        }

        System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());
        
    }
}
