package multidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04SumMatrixElements {
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

        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }

        System.out.printf("%d%n%d%n%d%n", row, cow, sum);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
