package definingClasses.exercises.ex01OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());


        while (n-- > 0) {

            String input = scanner.nextLine();
            String[] data = input.split("\\s+");

            Person person = new Person(data[0], Integer.parseInt(data[1]));

            persons.add(person);
        }

        persons.stream()
                .filter(person -> person.getAge() > 30)
                .sorted((left, right) -> left.getName().compareTo(right.getName()))
                .forEach(System.out::println);
    }
}
