package MethodsExercise;

import java.util.Scanner;

public class Problem02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        System.out.println(getCountVowels(input));
    }

    public static int getCountVowels(String input) {
        int countVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                countVowels++;
            }
        }

        return countVowels;
    }
}
