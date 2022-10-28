package workingWithAbstraction.lab.ex02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = readCoordinates(scanner);

        int bottomLeftX = coordinates[0];
        int bottomLeftY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];

        Point bottomLeftPoint = new Point(bottomLeftX, bottomLeftY);
        Point topRightPoint = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] coordinatesPoint = readCoordinates(scanner);
            Point point = new Point(coordinatesPoint[0], coordinatesPoint[1]);

            System.out.println(rectangle.contains(point));
        }
    }

    private static int[] readCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
