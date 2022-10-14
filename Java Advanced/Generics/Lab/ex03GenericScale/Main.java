package generics.lab.ex03GenericScale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> stringScale = new Scale<>(13, 42);

        System.out.println(stringScale.getHeavier());
    }
}
