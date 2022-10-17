package iteratorsAndComparators.exercises.ex06StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> setByName = new TreeSet<>(new PersonNameComparator());
        Set<Person> setByAge = new TreeSet<>(new PersonAgeComparator());

        int lines = Integer.parseInt(scanner.nextLine());

        while (lines-- > 0) {

            String[] data = scanner.nextLine().split("\\s+");

            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);

            setByName.add(person);
            setByAge.add(person);
        }

        for (Person person : setByName) {
            System.out.println(person);
        }

        for (Person person : setByAge) {
            System.out.println(person);
        }
    }
}
