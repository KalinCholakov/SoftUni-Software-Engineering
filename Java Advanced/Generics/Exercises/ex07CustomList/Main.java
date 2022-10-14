package generics.exercises.ex07CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> list = new CustomList<>();

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            String[] data = command.split(" ");
            String commandName = data[0];

            switch (commandName) {
                case "Add":
                    String elementToAdd = data[1];
                    list.add(elementToAdd);
                    break;
                case "Remove":
                    int index = Integer.parseInt(data[1]);
                    list.remove(index);
                    break;
                case "Contains":
                    String elementContains = data[1];
                    System.out.println(list.contains(elementContains));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(data[1]);
                    int index2 = Integer.parseInt(data[2]);
                    list.swap(index1, index2);
                    break;
                case "Greater":
                    String greater = data[1];
                    System.out.println(list.countGreaterThan(greater));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
