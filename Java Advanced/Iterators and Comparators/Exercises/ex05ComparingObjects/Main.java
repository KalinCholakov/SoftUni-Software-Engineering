package iteratorsAndComparators.exercises.ex05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] data = input.split("\\s+");

            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String town = data[2];

            Person person = new Person(name, age, town);

            people.add(person);

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine());

        int countEqualPeople = 0;
        int countDifferentPeople = 0;

        Person searchPerson = people.get(index - 1);

        for (Person person : people) {
            if (person.compareTo(searchPerson) == 0) {
                countEqualPeople++;
            } else {
                countDifferentPeople++;
            }
        }

        if (countEqualPeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", countEqualPeople, countDifferentPeople, people.size());
        }
    }
}
