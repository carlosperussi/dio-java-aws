package optional;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> optional = Optional.of(new User("João", 16, SexEnum.MALE));
        //Optional<User> optional = Optional.empty();

        optional.ifPresent(System.out::println);
        optional.ifPresentOrElse(user -> System.out.printf("Usuário: %s \n", user), () -> System.out.println("Não foi informado um usuário"));

        // Recuperando um valor específico e se não achar, retorna um default/exceção
        System.out.println(optional.orElse(defaultUser()));

        // Utilizando lambda
        System.out.println(optional.orElseGet(Main::defaultUser));

        // Mapeando dados do objeto
        var newUser = optional.map(user -> new User2(user.name(), user.age(), user.sex())).orElseThrow();
        System.out.println(newUser);
    }

    public static User defaultUser() {
        System.out.println("Buscando valor default...");
        return new User("Maria", 22, SexEnum.FEMALE);
    }
}
