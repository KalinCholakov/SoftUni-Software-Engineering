package setsAndMapsAdvanced.exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            set.add(scanner.nextLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
