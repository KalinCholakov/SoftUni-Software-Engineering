package multidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = dimensions[0];
        int cow = dimensions[1];

        String[][] matrix = new String[row][cow];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char outsideLetter = (char) ('a' + i);
                char insideLetter = (char) ('a' + i + j);
                matrix[i][j] = String.valueOf(outsideLetter) + insideLetter + outsideLetter;
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
