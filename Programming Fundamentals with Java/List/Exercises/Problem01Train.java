package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            int passenger = 0;
            String[] parts = input.split(" ");
            if (parts[0].equals("Add")) {
                int passengerToAdd = Integer.parseInt(parts[1]);
                listOfWagons.add(passengerToAdd);
            } else {
                passenger = Integer.parseInt(parts[0]);
                for (int i = 0; i < listOfWagons.size(); i++) {
                    if (listOfWagons.get(i) <= maxCapacity - passenger) {
                        listOfWagons.set(i, (listOfWagons.get(i) + passenger));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.println(listOfWagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
