import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("one");
        names.add("2");
        names.add("3");
        names.add("4");
        names.add("five");

        names.add(2, "almost two");

        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));
        System.out.println(names.get(5));
    }
}
