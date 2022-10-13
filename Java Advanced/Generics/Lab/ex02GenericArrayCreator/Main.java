package generics.lab.ex02GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(Integer.class, 3, 13);

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
