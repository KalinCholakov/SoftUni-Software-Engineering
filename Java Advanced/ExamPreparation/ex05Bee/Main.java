package examPreparation.ex05Bee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int beeRow = -1;
        int beeCol = -1;

        for (int row = 0; row < size; row++) {
            char[] singleRow = scanner.nextLine().toCharArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = singleRow[col];
                if (matrix[row][col] == 'B') {
                    beeRow = row;
                    beeCol = col;
                }
            }
        }

        int pollinatedFlowers = 0;
        String command = scanner.nextLine();

        while (!command.equals("End")) {

            matrix[beeRow][beeCol] = '.';
            if (command.equals("up") && beeRow != 0) {
                beeRow--;
            } else if (command.equals("down") && beeRow != size - 1) {
                beeRow++;
            } else if (command.equals("left") && beeCol != 0) {
                beeCol--;
            } else if (command.equals("right") && beeCol != size - 1) {
                beeCol++;
            } else {
                matrix[beeRow][beeCol] = '.';
                System.out.println("The bee got lost!");
                break;
            }

            if (matrix[beeRow][beeCol] == 'f') {
                pollinatedFlowers++;
            } else if (matrix[beeRow][beeCol] == 'O') {
                continue;
            }

            matrix[beeRow][beeCol] = 'B';
            command = scanner.nextLine();
        }

        if (pollinatedFlowers >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", pollinatedFlowers);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - pollinatedFlowers);
        }

        print(matrix);
    }

    private static void print(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
