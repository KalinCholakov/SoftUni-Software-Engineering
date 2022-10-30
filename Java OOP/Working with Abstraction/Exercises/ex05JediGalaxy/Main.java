package workingWithAbstraction.exercises.ex05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readCoordinates(scanner.nextLine());

        int row = dimensions[0];
        int col = dimensions[1];

        Field field = new Field(row, col);

        String command = scanner.nextLine();

        long starsCollected = 0;

        while (!command.equals("Let the Force be with you")) {

            Jedi jedi = new Jedi(Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray());
            int[] evilPosition = readCoordinates(scanner.nextLine());

            int rowEvil = evilPosition[0];
            int colEvil = evilPosition[1];

            Galaxy galaxy = new Galaxy(field, jedi);
            galaxy.moveEvil(rowEvil, colEvil);

            starsCollected += galaxy.moveJedi();

            command = scanner.nextLine();
        }

        System.out.println(starsCollected);
    }

    private static int[] readCoordinates(String scanner) {
        return Arrays.stream(scanner.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
