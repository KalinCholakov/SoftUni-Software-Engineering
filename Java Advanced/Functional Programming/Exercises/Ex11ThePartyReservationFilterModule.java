package functionalProgramming.exercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex11ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Set<String> filters = new HashSet<>();

        String command = scanner.nextLine();

        while (!command.equals("Print")) {
            String[] tokens = command.split(";");
            String addOrRemove = tokens[0];
            String type = tokens[1];
            String parameter = tokens[2];

            if (addOrRemove.startsWith("Add")) {
                filters.add(type + ";" + parameter);
            } else {
                filters.remove(type + ";" + parameter);
            }

            command = scanner.nextLine();
        }

        filters.forEach(filter -> {
            Predicate<String> filterToApply = getPredicate(filter);
            guests.removeIf(filterToApply);
        });

        guests.forEach(e -> System.out.print(e + " "));
    }

    private static Predicate<String> getPredicate(String filter) {
        String[] tokens = filter.split(";");
        String type = tokens[0];
        String parameter = tokens[1];

        switch (type) {
            case "Starts with":
                return s -> s.startsWith(parameter);
            case "Ends with":
                return s -> s.endsWith(parameter);
            case "Length":
                return s -> s.length() == Integer.parseInt(parameter);
            case "Contains":
                return s -> s.contains(parameter);
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
