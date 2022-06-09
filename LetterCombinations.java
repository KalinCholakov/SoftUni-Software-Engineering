package Exercises;

import java.util.Scanner;

public class LetterCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String charStart = scanner.nextLine();
        String charEnd = scanner.nextLine();
        String charNo = scanner.nextLine();
        int combinationsCounter = 0;

        for (char char1 = charStart.charAt(0); char1 <= charEnd.charAt(0); char1++) {
            for (char char2 = charStart.charAt(0); char2 <= charEnd.charAt(0); char2++) {
                for (char char3 = charStart.charAt(0); char3 <= charEnd.charAt(0); char3++) {
                    String output = "" + char1 + char2 + char3;
                    if (!output.contains(charNo)) {
                        System.out.printf("%s ", output);
                        combinationsCounter++;
                    }
                }
            }
        }
        System.out.print(combinationsCounter);
    }
}
