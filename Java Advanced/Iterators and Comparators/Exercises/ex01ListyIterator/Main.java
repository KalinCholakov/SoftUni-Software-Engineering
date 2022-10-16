package iteratorsAndComparators.exercises.ex01ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListyIterator listyIterator = null;

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] parts = input.split("\\s+");
            String commandName = parts[0];

            switch (commandName) {
                case "Create":
                    if (parts.length > 1) {
                        String[] elementsArray = Arrays.copyOfRange(parts, 1, parts.length);
                        listyIterator = new ListyIterator(elementsArray);
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
