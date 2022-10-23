package exam20221022.ex02RallyRacing;

import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String racingCarNumber = scanner.nextLine();

        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            String s = "";
            for (String inputToken : inputTokens) {
                s += inputToken;
            }

            for (int col = 0; col < size; col++) {
                matrix[row] = s.toCharArray();
            }
        }

        int indexCarRow = 0;
        int indexCarCol = 0;
        int carDistance = 0;
        boolean isDNF = true;

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.equals("left")) {
                if (matrix[indexCarRow][indexCarCol - 1] == '.') {
                    indexCarCol -= 1;
                    carDistance += 10;
                } else if (matrix[indexCarRow][indexCarCol - 1] == 'F') {
                    carDistance += 10;
                    System.out.printf("Racing car %s finished the stage!%n", racingCarNumber);
                    isDNF = false;
                    matrix[indexCarRow][indexCarCol - 1] = 'C';
                    break;
                } else if (matrix[indexCarRow][indexCarCol - 1] == 'T') {
                    matrix[indexCarRow][indexCarCol - 1] = '.';
                    int indexTunnelRow = -1;
                    int indexTunnelCol = -1;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if ((matrix[i][j]) == 'T') {
                                indexTunnelRow = i;
                                indexTunnelCol = j;
                            }
                        }
                    }
                    indexCarRow = indexTunnelRow;
                    indexCarCol = indexTunnelCol;
                    carDistance += 30;
                    matrix[indexTunnelRow][indexTunnelCol] = '.';
                }
            } else if (command.equals("right")) {
                if (matrix[indexCarRow][indexCarCol + 1] == '.') {
                    indexCarCol += 1;
                    carDistance += 10;
                } else if (matrix[indexCarRow][indexCarCol + 1] == 'F') {
                    carDistance += 10;
                    System.out.printf("Racing car %s finished the stage!%n", racingCarNumber);
                    isDNF = false;
                    matrix[indexCarRow][indexCarCol + 1] = 'C';
                    break;
                } else if (matrix[indexCarRow][indexCarCol + 1] == 'T') {
                    matrix[indexCarRow][indexCarCol + 1] = '.';
                    int indexTunnelRow = -1;
                    int indexTunnelCol = -1;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if ((matrix[i][j]) == 'T') {
                                indexTunnelRow = i;
                                indexTunnelCol = j;
                            }
                        }
                    }
                    indexCarRow = indexTunnelRow;
                    indexCarCol = indexTunnelCol;
                    carDistance += 30;
                    matrix[indexTunnelRow][indexTunnelCol] = '.';
                }
            } else if (command.equals("up")) {
                if (matrix[indexCarRow - 1][indexCarCol] == '.') {
                    indexCarRow -= 1;
                    carDistance += 10;
                } else if (matrix[indexCarRow - 1][indexCarCol] == 'F') {
                    carDistance += 10;
                    System.out.printf("Racing car %s finished the stage!%n", racingCarNumber);
                    isDNF = false;
                    matrix[indexCarRow - 1][indexCarCol] = 'C';
                    break;
                } else if (matrix[indexCarRow - 1][indexCarCol] == 'T') {
                    matrix[indexCarRow - 1][indexCarCol] = '.';
                    int indexTunnelRow = -1;
                    int indexTunnelCol = -1;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if ((matrix[i][j]) == 'T') {
                                indexTunnelRow = i;
                                indexTunnelCol = j;
                            }
                        }
                    }
                    indexCarRow = indexTunnelRow;
                    indexCarCol = indexTunnelCol;
                    carDistance += 30;
                    matrix[indexTunnelRow][indexTunnelCol] = '.';
                }
            } else if (command.equals("down")) {
                if (matrix[indexCarRow + 1][indexCarCol] == '.') {
                    indexCarRow += 1;
                    carDistance += 10;
                } else if (matrix[indexCarRow + 1][indexCarCol] == 'F') {
                    carDistance += 10;
                    System.out.printf("Racing car %s finished the stage!%n", racingCarNumber);
                    isDNF = false;
                    matrix[indexCarRow + 1][indexCarCol] = 'C';
                    break;
                } else if (matrix[indexCarRow + 1][indexCarCol] == 'T') {
                    matrix[indexCarRow + 1][indexCarCol] = '.';
                    int indexTunnelRow = -1;
                    int indexTunnelCol = -1;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if ((matrix[i][j]) == 'T') {
                                indexTunnelRow = i;
                                indexTunnelCol = j;
                            }
                        }
                    }
                    indexCarRow = indexTunnelRow;
                    indexCarCol = indexTunnelCol;
                    carDistance += 30;
                    matrix[indexTunnelRow][indexTunnelCol] = '.';
                }
            }
            command = scanner.nextLine();
        }

        if (isDNF) {
            matrix[indexCarRow][indexCarCol] = 'C';
            System.out.printf("Racing car %s DNF.%n", racingCarNumber);
        }

        System.out.printf("Distance covered %d km.%n", carDistance);

        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
