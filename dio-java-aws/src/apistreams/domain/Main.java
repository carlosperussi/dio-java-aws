package apistreams.domain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static apistreams.domain.ContactType.*;
import static apistreams.domain.Sex.*;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(generateUsers());
        // Ordenação por comparação
        // users.sort(Comparator.comparing(User::name));

        // Buscando contatos que contenham e-mail
        System.out.println("==============");
        var values = users.stream().filter(u -> u.contacts().stream().anyMatch(c -> c.type() == EMAIL));        
        values.forEach(System.out::println);

        // Buscando contatos que contenham apenas e-mail
        System.out.println("==============");
        var values2 = users.stream().filter(u -> u.contacts().stream().allMatch(c -> c.type() == EMAIL));        
        values2.forEach(System.out::println);

        // Buscando contatos que contenham apenas phone
        System.out.println("==============");
        var values3 = users.stream().filter(u -> u.contacts().stream().allMatch(c -> c.type() == PHONE));        
        values3.forEach(System.out::println);

        // Buscando apenas os contatos do usuário com flatMap
        System.out.println("==============");
        var values4 = users.stream().flatMap(u -> u.contacts().stream()).toList();
        values4.forEach(System.out::println);

        // Buscando apenas os contatos de telefone do usuário com flatMap
        System.out.println("==============");
        var values5 = users.stream().flatMap(u -> u.contacts().stream()).filter(c -> c.type() == PHONE).toList();
        values5.forEach(System.out::println);

        // Filtrando e-mail por correspondencia de caracteres
        System.out.println("==============");
        var values6 = users.stream().flatMap(u -> u.contacts().stream()).filter(c -> c.description().contains("gmail"));
        values6.forEach(System.out::println);

        // Transformando stream em um map
        System.out.println("==============");
        var values7 = users.stream().filter(u -> u.sex() == FEMALE).collect(Collectors.toMap(User::name, user -> user));

        values7.forEach((key, value) -> System.out.printf("key: %s | value: %s \n", key, value));
        
    }

    public static List<User> generateUsers() {
        var contacts1 = List.of(
            new Contact("(19) 99999-1122", PHONE),
            new Contact("joao@joao.com", EMAIL)
        );
        var contacts2 = List.of(
            new Contact("(21) 98665-1145)", PHONE)
        );
        var contacts3 = List.of(
            new Contact("kiko@chaves.com.br", EMAIL)
        );
        var contacts4 = List.of(
            new Contact("francisca@gmail.com", EMAIL),
            new Contact("chica@dasilva.com.br", EMAIL)
        );
        var contacts5 = List.of(
            new Contact("(41) 99876-1210", PHONE),
            new Contact("(41) 89888-1210", PHONE)
        );

        var user1 = new User("João", 26, MALE, new ArrayList<>(contacts1));
        var user2 = new User("Maria", 18, FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Frederico", 40, MALE, new ArrayList<>(contacts3));
        var user4 = new User("Francisca", 30, FEMALE, new ArrayList<>(contacts4));
        var user5 = new User("Xunda", 55, MALE, new ArrayList<>(contacts5));
        var user6 = new User("Bruna", 36, MALE, new ArrayList<>());
        
        return List.of(user1, user2, user3, user4, user5, user6);
    }
}
