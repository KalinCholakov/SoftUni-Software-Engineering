package multidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {

            String[] tokens = input.split(" ");

            int rowIndex = Integer.parseInt(tokens[0]);
            int colIndex = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);
            int beginIndexRow = Math.max((rowIndex - radius), 0);
            int endIndexRow = Math.min((rowIndex + radius), matrix.length - 1);
            int startIndexCol = Math.max((colIndex - radius), 0);
            int endIndexCol = Math.min((colIndex + radius), rows - 1);

            for (int i = beginIndexRow; i <= endIndexRow; i++) {
                for (int j = startIndexCol; j <= endIndexCol; j++) {
                    if (i != rowIndex) {
                        if (j == colIndex && j < cols - 1) {
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = 0;
                        } else if (j == cols - 1) {
                            matrix[i][j] = 0;
                        }
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
