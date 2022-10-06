package functionalProgramming.lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Predicate<String> isStartingWithUpperCase = w -> Character.isUpperCase(w.charAt(0));

        ArrayDeque<String> queueOfWords = new ArrayDeque<>();

        Arrays.stream(words).filter(isStartingWithUpperCase).forEach(queueOfWords::offer);

        System.out.println(queueOfWords.size());

        while (!queueOfWords.isEmpty()) {

            System.out.println(queueOfWords.poll());
        }
    }
}
