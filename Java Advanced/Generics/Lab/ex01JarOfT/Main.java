package generics.lab.ex01JarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<String> stringJar = new Jar<>();

        stringJar.add("Pesho");
        stringJar.add("Ivan");
        stringJar.remove();
    }
}
