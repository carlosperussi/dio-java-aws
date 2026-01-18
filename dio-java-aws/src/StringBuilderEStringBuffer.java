import java.time.Duration;
import java.time.OffsetDateTime;

public class StringBuilderEStringBuffer {
    public static void main(String[] args) {
        var stringExemplo = new StringBuilder();
        stringExemplo.append("123456");
        stringExemplo.reverse();
        System.out.println(stringExemplo);
        System.out.println(stringExemplo.length());
        System.out.println(stringExemplo.insert(2, "abc"));
        System.out.println(stringExemplo.delete(0,3));
    }
}
