package generics.exercises.ex05GenericCountMethodString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        while (n-- > 0) {

            String element = scanner.nextLine();

            box.add(element);
        }

        String command = scanner.nextLine();

        System.out.println(box.countOfGreaterElements(command));
    }
}
