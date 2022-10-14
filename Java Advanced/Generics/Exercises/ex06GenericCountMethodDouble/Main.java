package generics.exercises.ex06GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();

        while (n-- > 0) {

            double element = Double.parseDouble(scanner.nextLine());

            box.add(element);
        }

        double command = Double.parseDouble(scanner.nextLine());

        System.out.println(box.countOfGreaterElements(command));
    }
}
