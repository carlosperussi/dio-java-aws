package br.com.interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class InterfaceFuncional {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 21), new User("João", 25), new User("Ana", 30));
        
        // Utilizando expressoes lambda
        users.forEach(user -> {
            System.out.println(user);
        });

        // Utilizando expressoes lambda mais simplificadas
        users.forEach(System.out::println); 

        // Utilizando chamada de funções lambda
        printStringValues(User::name, users);

        // Imprimindo idades dos usuários utilizando Consumer
        printStringValues(user -> String.valueOf(user.age()), users);

        // Imprimindo o objeto inteiro
        printStringValues(Record::toString, users);
    }

    private static void printStringValues(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
