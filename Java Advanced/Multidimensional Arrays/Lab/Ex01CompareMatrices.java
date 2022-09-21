package multidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner);

        int firstMatrixRows = dimensions[0];
        int firstMatrixCols = dimensions[1];

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        writeMatrix(scanner, firstMatrix);

        dimensions = readArray(scanner);

        int secondMatrixRows = dimensions[0];
        int secondMatrixCols = dimensions[1];

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        writeMatrix(scanner, secondMatrix);

        System.out.println(areMatricesIsEqual(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }

    private static void writeMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = readArray(scanner);
            matrix[i] = arr;
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static boolean areMatricesIsEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            if (firstMatrix[i].length != secondMatrix[i].length) {
                return false;
            }
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
