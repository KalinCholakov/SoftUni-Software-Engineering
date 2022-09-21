package multidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int arraysCount = dimensions[0];
        int arraysSize = dimensions[1];

        int[][] matrix = new int[arraysCount][arraysSize];

        for (int row = 0; row < arraysCount; row++) {
            for (int col = 0; col < arraysSize; col++) {
                matrix[row][col] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        int number = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }
}
