import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Sets {
    public static void main(String[] args) {
        Set<PessoaSet> pessoas = new HashSet<>();
        pessoas.add(new PessoaSet(1, "João"));
        pessoas.add(new PessoaSet(2, "Maria"));
        pessoas.add(new PessoaSet(3, "José"));
        pessoas.add(new PessoaSet(4, "Joaquim"));

        System.out.println(pessoas.contains(new PessoaSet(1, "João")));

        // Imprimindo os elementos do Set
        pessoas.forEach(System.out::println);

        // Imprimindo os elementos do Set usando um iterator
        var iterator = pessoas.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removendo um elemento do Set
        System.out.println(pessoas.removeAll(List.of(new PessoaSet(2, "Maria"))));
        System.out.println(pessoas);

        // Removendo com condicional
        pessoas.removeIf(pessoa -> pessoa.getId() == 3);
        System.out.println(pessoas);

        // Removendo utilizando o predicate
        pessoas.removeIf(Predicate.not(pessoa -> pessoa.getId() > 2));
        System.out.println(pessoas);
    }
}
