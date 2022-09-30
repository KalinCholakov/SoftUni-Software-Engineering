package setsAndMapsAdvanced.exercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> uniqueSet = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] elements = scanner.nextLine().split("\\s+");

            Collections.addAll(uniqueSet, elements);
        }

        uniqueSet.forEach(e -> System.out.print(e + " "));
    }
}
