package setsAndMapsAdvanced.exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        fillSet(scanner, setN, n);

        fillSet(scanner, setM, m);

        setN.retainAll(setM);

        for (Integer integer : setN) {
            System.out.print(integer + " ");
        }
    }

    private static void fillSet(Scanner scanner, Set<Integer> setN, int n) {
        while (n-- > 0) {
            int current = scanner.nextInt();
            scanner.nextLine();
            setN.add(current);
        }
    }
}
