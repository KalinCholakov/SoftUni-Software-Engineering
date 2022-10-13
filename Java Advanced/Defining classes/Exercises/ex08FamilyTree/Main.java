package definingClasses.exercises.ex08FamilyTree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        Map<String, List<String>> parentChildren = new LinkedHashMap<>();

        String personName = scanner.nextLine();

        String line = scanner.nextLine();

        while (!line.equals("End")) {

            if (line.contains(" - ")) {
                String[] tokens = line.split(" - ");
                String parentId = tokens[0];
                String childId = tokens[1];
                parentChildren.putIfAbsent(parentId, new ArrayList<>());
                parentChildren.get(parentId).add(childId);
            } else {
                String[] tokens = line.split("\\s+");
                String name = tokens[0] + " " + tokens[1];
                String birthday = tokens[2];
                people.add(new Person(name, birthday));
            }

            line = scanner.nextLine();
        }

        parentChildren.forEach((parentId, children) -> {
            Person parent = findPerson(people, parentId);

            children.stream()
                    .map(childId -> findPerson(people, childId))
                    .forEach(parent::addChild);
        });

        Person forPerson = findPerson(people, personName);

        System.out.println(getFamilyTreeFor(forPerson));
    }

    public static String getFamilyTreeFor(Person person) {
        return person.toString() + System.lineSeparator() +
                "Parents:" + System.lineSeparator() +
                person.getParents().stream().map(Person::toString)
                        .collect(Collectors.joining(System.lineSeparator())) +
                (person.getParents().isEmpty() ? "" : System.lineSeparator()) +
                "Children:" + System.lineSeparator() +
                person.getChildren().stream().map(Person::toString)
                        .collect(Collectors.joining(System.lineSeparator()));
    }

    private static Person findPerson(List<Person> people, String personName) {
        return people.stream()
                .filter(person -> person.getBirthday().equals(personName) || person.getName().equals(personName))
                .findFirst()
                .orElseThrow();
    }
}
