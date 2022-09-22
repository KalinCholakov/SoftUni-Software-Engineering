package multidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner);

        int row = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }

        int maxSum = Integer.MIN_VALUE;
        int bestStartingRow = 0;
        int bestStartingCol = 0;

        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                        matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestStartingRow = i;
                    bestStartingCol = j;
                }
            }
        }

        System.out.printf("Sum = %d%n", maxSum);
        for (int i = bestStartingRow; i < bestStartingRow + 3; i++) {
            for (int j = bestStartingCol; j < bestStartingCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
