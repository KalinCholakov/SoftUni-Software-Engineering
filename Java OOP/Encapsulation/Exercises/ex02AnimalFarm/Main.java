package encapsulation.exercises.ex02AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chickenName = scanner.nextLine();
        int chickenAge = Integer.parseInt(scanner.nextLine());

        Chicken chicken = null;

        try {
            chicken = new Chicken(chickenName, chickenAge);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if (chicken != null) {
            System.out.println(chicken);
        }
    }
}
