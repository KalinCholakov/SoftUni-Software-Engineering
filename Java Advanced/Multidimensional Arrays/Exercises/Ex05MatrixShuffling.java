package multidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = dimensions[0];
        int col = dimensions[1];

        String[][] matrix = new String[row][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = ReadArray(scanner);
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String[] command = input.split("\\s++");
            if (input.contains("swap") && command.length == 5) {
                int firstIndexRow = Integer.parseInt(command[1]);
                int firstIndexCol = Integer.parseInt(command[2]);
                int secondIndexRow = Integer.parseInt(command[3]);
                int secondIndexCol = Integer.parseInt(command[4]);
                if (isBounds(matrix, firstIndexRow, firstIndexCol)
                        && isBounds(matrix, secondIndexRow, secondIndexCol)) {
                    String current = matrix[firstIndexRow][firstIndexCol];
                    matrix[firstIndexRow][firstIndexCol] = matrix[secondIndexRow][secondIndexCol];
                    matrix[secondIndexRow][secondIndexCol] = current;

                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private static boolean isBounds(String[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static String[] ReadArray(Scanner scanner) {
        return scanner.nextLine().split("\\s++");
    }
}
