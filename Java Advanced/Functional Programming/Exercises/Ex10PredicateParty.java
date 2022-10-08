package functionalProgramming.exercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Party!")) {
            String[] tokens = command.split(" ");
            String removeOrDouble = tokens[0];
            String typeCommand = tokens[1];
            String parameter = tokens[2];

            if (removeOrDouble.equals("Remove")) {
                guests.removeIf(getPredicate(typeCommand, parameter));
            } else if (removeOrDouble.equals("Double")) {

                for (int i = 0; i < guests.size(); i++) {
                    String guest = guests.get(i);
                    if (getPredicate(typeCommand, parameter).test(guest)) {
                        guests.add(i++, guest);
                    }
                }
            }
            command = scanner.nextLine();
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guests);

            System.out.printf("%s are going to the party!%n", String.join(", ", guests));
        }
    }

    private static Predicate<String> getPredicate(String type, String parameter) {

        switch (type) {
            case "StartsWith":
                return s -> s.startsWith(parameter);
            case "EndsWith":
                return s -> s.endsWith(parameter);
            case "Length":
                return s -> s.length() == Integer.parseInt(parameter);
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
