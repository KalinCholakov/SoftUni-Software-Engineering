package multidimensionalArrays.exercises;

import java.util.Scanner;

public class Ex08TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heiganPoints = 3000000.0;
        int playerPoints = 18500;

        int startPlayerRow = 7;
        int startPlayerCol = 7;

        String lastSpell = "";
        boolean activeCloud = false;

        double damageHeigan = Double.parseDouble(scanner.nextLine());

        while (heiganPoints > 0 && playerPoints > 0) {
            heiganPoints -= damageHeigan;

            if (activeCloud) {
                playerPoints -= 3500;
                activeCloud = false;

                if (playerPoints < 0) {
                    break;
                }
            }

            if (heiganPoints < 0) {
                break;
            }

            String[] tokens = scanner.nextLine().split("\\s+");

            String spell = tokens[0];
            int row = Integer.parseInt(tokens[1]);
            int col = Integer.parseInt(tokens[2]);

            boolean[][] heiganChamber = new boolean[15][15];
            for (int i = row - 1; i <= row + 1; i++) {
                if (i >= 0 && i < heiganChamber.length) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (j >= 0 && j < heiganChamber[row].length) {
                            heiganChamber[i][j] = true;
                        }
                    }
                }
            }

            if (heiganChamber[startPlayerRow][startPlayerCol]) {
                if (isRowValid(heiganChamber, startPlayerRow - 1)
                        && !heiganChamber[startPlayerRow - 1][startPlayerCol]) {
                    startPlayerRow--; // move up
                } else if (isColValid(heiganChamber, startPlayerCol + 1)
                        && !heiganChamber[startPlayerRow][startPlayerCol + 1]) {
                    startPlayerCol++; // move right
                } else if (isRowValid(heiganChamber, startPlayerRow + 1)
                        && !heiganChamber[startPlayerRow + 1][startPlayerCol]) {
                    startPlayerRow++; // move down
                } else if (isColValid(heiganChamber, startPlayerCol - 1)
                        && !heiganChamber[startPlayerRow][startPlayerCol - 1]) {
                    startPlayerCol--; // move left
                }

                if (heiganChamber[startPlayerRow][startPlayerCol]) {
                    switch (spell) {
                        case "Cloud":
                            playerPoints -= 3500;
                            activeCloud = true;
                            lastSpell = "Plague Cloud";
                            break;
                        case "Eruption":
                            playerPoints -= 6000;
                            lastSpell = spell;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid spell: " + spell);
                    }
                }
            }
        }

        if (heiganPoints > 0) {
            System.out.printf("Heigan: %.2f%n", heiganPoints);
        } else {
            System.out.println("Heigan: Defeated!");
        }
        if (playerPoints > 0) {
            System.out.printf("Player: %d%n", playerPoints);
        } else {
            System.out.println("Player: Killed by " + lastSpell);
        }

        System.out.println("Final position: " + startPlayerRow + ", " + startPlayerCol);
    }

    private static boolean isRowValid(boolean[][] hsChamber, int startPlRow) {
        return startPlRow >= 0 && startPlRow < hsChamber[startPlRow].length;
    }

    private static boolean isColValid(boolean[][] hsChamber, int startPlCol) {
        return startPlCol >= 0 && startPlCol < hsChamber.length;
    }
}
