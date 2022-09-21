package multidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner);

        int row = dimensions[0];
        int cow = dimensions[1];

        int[][] matrix = new int[row][cow];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = readArray(scanner);
            matrix[i] = arr;
        }

        int[][] maxSumMatrix = new int[2][2];

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {

                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (currentSum > maxValue) {
                    maxValue = currentSum;

                    maxSumMatrix[0][0] = matrix[i][j];
                    maxSumMatrix[0][1] = matrix[i][j + 1];
                    maxSumMatrix[1][0] = matrix[i + 1][j];
                    maxSumMatrix[1][1] = matrix[i + 1][j + 1];
                }
            }
        }

        for (int[] sumMatrix : maxSumMatrix) {
            for (int i : sumMatrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println(maxValue);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
