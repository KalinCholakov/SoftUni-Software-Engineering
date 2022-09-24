package multidimensionalArrays.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        String rotationDegreeAsString = rotation.split("[()]")[1];
        int rotationDegree = Integer.parseInt(rotationDegreeAsString);
        int rotateAngle = rotationDegree >= 360 ? rotationDegree % 360 : rotationDegree;
        List<String> wordList = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            wordList.add(input);

            if (input.length() > maxLength) {
                maxLength = input.length();
            }
            input = scanner.nextLine();
        }

        int rows = wordList.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String currentWord = wordList.get(i);
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < currentWord.length()) {
                    matrix[i][j] = currentWord.charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        switch (rotateAngle) {
            case 0:
                for (char[] chars : matrix) {
                    for (char aChar : chars) {
                        System.out.print(aChar);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

        }
    }
}
