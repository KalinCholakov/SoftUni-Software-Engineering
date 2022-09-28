package setsAndMapsAdvanced.lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numberWithOccurrences = new LinkedHashMap<>();

        for (Double value : input) {
            if (!numberWithOccurrences.containsKey(value)) {
                numberWithOccurrences.put(value, 1);
            } else {
                numberWithOccurrences.put(value, numberWithOccurrences.get(value) + 1);
            }
        }

        for (Double aDouble : numberWithOccurrences.keySet()) {
            System.out.printf("%.1f -> %d%n", aDouble, numberWithOccurrences.get(aDouble));
        }
    }
}
