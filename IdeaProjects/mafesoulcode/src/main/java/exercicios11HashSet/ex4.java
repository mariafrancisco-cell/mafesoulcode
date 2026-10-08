package exercicios11HashSet;
import java.util.HashSet;
import java.util.List;

public class ex4 {
    static void main() {
        HashSet<String> cpfs = new HashSet<>(List.of("549.138.138-11", "123.345.567-11", "308.267.278-11"));
        cpfs.remove("549.138.138-11");
        System.out.println(cpfs);
        System.out.println(cpfs.size());
    }
}
