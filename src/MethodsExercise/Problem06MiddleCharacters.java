package MethodsExercise;

import java.util.Scanner;

public class Problem06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        getMiddleCharacter(input);
    }

    public static void getMiddleCharacter(String input) {
        String result;
        if (input.length() % 2 == 0) {
            result = input.charAt(input.length() / 2 - 1) + "" + input.charAt(input.length() / 2);
        } else {
            result = input.charAt(input.length() / 2) + "";
        }

        System.out.println(result);
    }
}
