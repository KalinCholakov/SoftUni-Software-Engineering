package multidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s++"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sumPrimaryDiagonal = sumPrimaryDiagonal(matrix);

        int sumSecondaryDiagonal = sumSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }

    private static int sumSecondaryDiagonal(int[][] matrix) {
        int row = matrix.length - 1;
        int col = 0;
        int sum = 0;

        while (row >= 0 && col < matrix[row].length) {
            sum += matrix[row][col];
            row--;
            col++;
        }

        return sum;
    }

    private static int sumPrimaryDiagonal(int[][] matrix) {
        int row = 0;
        int col = 0;
        int sum = 0;

        while (row < matrix.length && col < matrix[row].length) {
            sum += matrix[row][col];
            row++;
            col++;
        }

        return sum;
    }
}
