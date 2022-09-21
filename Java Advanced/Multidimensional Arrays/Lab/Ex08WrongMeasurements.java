package multidimensionalArrays.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }

        int[] indexes = readArray(scanner);

        int valueToReplace = matrix[indexes[0]][indexes[1]];

        List<int[]> correctValues = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == valueToReplace) {
                    int correctValue = getNearbySum(matrix, i, j, valueToReplace);
                    correctValues.add(new int[]{i, j, correctValue});
                }
            }
        }

        for (int[] correctValue : correctValues) {
            int row = correctValue[0];
            int cow = correctValue[1];
            matrix[row][cow] = correctValue[2];
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int getNearbySum(int[][] matrix, int row, int col, int valueToReplace) {
        int sum = 0;

        if (isBounds(matrix, row + 1, col) && matrix[row + 1][col] != valueToReplace) {
            sum += matrix[row + 1][col];
        }
        if (isBounds(matrix, row - 1, col) && matrix[row - 1][col] != valueToReplace) {
            sum += matrix[row - 1][col];
        }
        if (isBounds(matrix, row, col + 1) && matrix[row][col + 1] != valueToReplace) {
            sum += matrix[row][col + 1];
        }
        if (isBounds(matrix, row, col - 1) && matrix[row][col - 1] != valueToReplace) {
            sum += matrix[row][col - 1];
        }

        return sum;
    }

    private static boolean isBounds(int[][] matrix, int row, int col) {
        return (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
