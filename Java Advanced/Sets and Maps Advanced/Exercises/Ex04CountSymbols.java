package setsAndMapsAdvanced.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> countSymbols = new TreeMap<>();

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            countSymbols.putIfAbsent(currentChar, 0);
            int currentOccurrences = countSymbols.get(currentChar);
            countSymbols.put(currentChar, currentOccurrences + 1);
        }

        countSymbols.forEach((key, value) -> System.out.printf("%c: %d time/s%n", key, value));
    }
}
