package multidimensionalArrays.lab;

import java.util.Scanner;

public class Ex03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraysCount = Integer.parseInt(scanner.nextLine());
        int arraysSize = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[arraysCount][arraysSize];
        String[][] secondMatrix = new String[arraysCount][arraysSize];

        writeMatrix(scanner, firstMatrix);
        writeMatrix(scanner, secondMatrix);

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j].equals(secondMatrix[i][j])) {
                    System.out.print(firstMatrix[i][j] + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }

    private static void writeMatrix(Scanner scanner, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String[] arr = readArray(scanner);
            matrix[i] = arr;
        }
    }

    private static String[] readArray(Scanner scanner) {
        return (scanner.nextLine().split("\\s++"));
    }
}
