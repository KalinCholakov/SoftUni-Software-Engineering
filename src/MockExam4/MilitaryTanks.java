package MockExam4;

import java.util.Scanner;

public class MilitaryTanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int x = 0;
        int y = 0;
        for (char symbol : input.toCharArray()) {
            switch (symbol) {
                case 'R' -> x++;
                case 'L' -> x--;
                case 'U' -> y++;
                case 'D' -> y--;
            }
        }
        System.out.printf("(%d, %d)%n", x, y);
    }
}
