import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, UserMap> usuarios = new HashMap<>();
        usuarios.put("joao@joao.com", new UserMap("João", 25));
        usuarios.put("maria@maria.com", new UserMap("Maria", 30));
        usuarios.put("jose@jose.com", new UserMap("José", 28));
        usuarios.put("carlos@carlos.com", new UserMap("Carlos", 35));

        // Imprimindo o mapa completo
        System.out.println(usuarios);

        // Imprimindo chaves
        System.out.println("------------------");
        usuarios.keySet().forEach(System.out::println);

        // Imprimindo valores
        System.out.println("------------------");
        usuarios.values().forEach(System.out::println);

        // Imprimindo chaves de acordo com valores de parametro
        System.out.println("------------------");
        System.out.println(usuarios.containsKey("manoel"));
        System.out.println(usuarios.containsKey("Carlos"));
        System.out.println(usuarios.containsKey("jose@jose.com"));

        // Removendo registros
        System.out.println("------------------");
        System.out.println(usuarios.remove("jose@jose.com"));

        // Substituindo registros
        System.out.println("------------------");
        usuarios.forEach((key, value) -> System.out.printf("Chave: %s | Valor: %s \n", key, value));
        usuarios.replace("joao@joao.com", new UserMap("João Silva", 60));
        usuarios.forEach((key, value) -> System.out.printf("Chave: %s | Valor: %s \n", key, value));

        // Verificar se existe determinada chave
        System.out.println("------------------");
        System.out.println(usuarios.containsKey("carlos@carlos.com"));

        // Verificar se existe determinado valor
        System.out.println("------------------");
        System.out.println(usuarios.containsValue(new UserMap("Maria", 30)));

        // Retornando valores de uma chave
        System.out.println("------------------");
        System.out.println(usuarios.get("joao@joao.com"));

        // Verificando se o mapa está vazio
        System.out.println("------------------");
        System.out.println(usuarios.isEmpty());
    }
}
