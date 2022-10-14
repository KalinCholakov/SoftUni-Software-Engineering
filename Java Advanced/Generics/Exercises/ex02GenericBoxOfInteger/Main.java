package generics.exercises.ex02GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box<>();

        while (n-- > 0) {

            Integer element = Integer.parseInt(scanner.nextLine());

            box.add(element);
        }

        System.out.println(box);
    }
}
