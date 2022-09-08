package MethodsExercise;

import java.util.Scanner;

public class Problem03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);

        charactersInRange(ch1, ch2);
    }

    public static void charactersInRange(char ch1, char ch2) {
        if (ch1 < ch2) {
            for (int i = (char) (ch1 + 1); i < (char) (ch2); i++) {
                System.out.print((char) (i) + " ");
            }
        } else {
            for (int i = (char) (ch2 + 1); i < (char) (ch1); i++) {
                System.out.print((char) (i) + " ");
            }
        }
    }
}
