package apistreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var value1 = Stream.generate(() -> new Random().nextInt()).limit(5).toArray(Integer[]::new);
        for(var v: value1) {
            System.out.println(v);
        }
        
        System.out.println("==============");
        var value2 = IntStream.generate(() -> new Random().nextInt()).limit(5).toArray();

        for(var v: value2) {
            System.out.println(v);
        }

        // Criando uma stream e filtrando resultados que terminem com a letra A
        System.out.println("==============");
        var names = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Márcia").filter(name -> name.endsWith("a")).toList();

        System.out.println(names);

        // Utilizando peek para debugar stream
        System.out.println("==============");
        List<String> debugValues = new ArrayList<>();
        var names2 = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Márcia")
            .peek(debugValues::add)
            .filter(name -> name.endsWith("o"))
            .toList();

        System.out.println(debugValues);
        System.out.println(names2);

        // Procurando alguma ocorrência de algum caractere
        System.out.println("==============");
        var names3 = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Márcia")
            .anyMatch(name -> name.contains("a"));

        System.out.println(names3);

        // Aplicando reduce em uma stream
        System.out.println("==============");
        var names4 = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Márcia")
            .reduce("", (a, b) -> a + ";" + b);

        System.out.println(names4);

        // Transformando uma stream de integers em uma stream de strings
        System.out.println("==============");
        var numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
            .map(Object::toString)
            .toList();

        System.out.println(numbers);
    }
}
