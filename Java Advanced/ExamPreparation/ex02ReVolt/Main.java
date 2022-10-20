package examPreparation.ex02ReVolt;

import java.util.Scanner;

public class Main {

    public static int indexRowOfPlayer = -1;
    public static int indexColOfPlayer = -1;
    public static boolean hasWon = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int countCommands = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = scanner.nextLine().toCharArray();
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'f') {
                    indexRowOfPlayer = row;
                    indexColOfPlayer = col;
                }
            }
        }

        while (countCommands-- > 0 && !hasWon) {
            String command = scanner.nextLine();

            switch (command) {
                case "up":
                    move(-1, 0, matrix);
                    break;
                case "down":
                    move(1, 0, matrix);
                    break;
                case "left":
                    move(0, -1, matrix);
                    break;
                case "right":
                    move(0, 1, matrix);
                    break;
            }
        }

        System.out.println(hasWon ? "Player won!" : "Player lost!");
        print(matrix);
    }

    private static void move(int rowMutator, int colMutator, char[][] matrix) {
        int nextRow = indexRowOfPlayer + rowMutator;
        int nextCol = indexColOfPlayer + colMutator;

        if (isOutOfBounds(nextRow, nextCol, matrix)) {
            if (nextRow < 0 || nextRow >= matrix.length) {
                nextRow = nextRow < 0 ? matrix.length - 1 : 0;
            } else {
                nextCol = nextCol < 0 ? matrix[nextRow].length - 1 : 0;
            }
        }

        if (matrix[nextRow][nextCol] == 'T') {
            return;
        } else if (matrix[nextRow][nextCol] == 'B') {
            matrix[indexRowOfPlayer][indexColOfPlayer] = '-';
            indexRowOfPlayer = nextRow;
            indexColOfPlayer = nextCol;
            moveBonus(rowMutator, colMutator, matrix);
            return;
        } else if (matrix[nextRow][nextCol] == 'F') {
            hasWon = true;
        }

        matrix[indexRowOfPlayer][indexColOfPlayer] = '-';
        matrix[nextRow][nextCol] = 'f';
        indexRowOfPlayer = nextRow;
        indexColOfPlayer = nextCol;
    }

    private static void moveBonus(int rowMutator, int colMutator, char[][] matrix) {
        int nextRow = indexRowOfPlayer + rowMutator;
        int nextCol = indexColOfPlayer + colMutator;

        if (isOutOfBounds(nextRow, nextCol, matrix)) {
            if (nextRow < 0 || nextRow >= matrix.length) {
                nextRow = nextRow < 0 ? matrix.length - 1 : 0;
            } else {
                nextCol = nextCol < 0 ? matrix[nextRow].length - 1 : 0;
            }
        }

        if (matrix[nextRow][nextCol] == 'F') {
            hasWon = true;
        }

        matrix[nextRow][nextCol] = 'f';
        indexRowOfPlayer = nextRow;
        indexColOfPlayer = nextCol;
    }

    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    public static void print(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
