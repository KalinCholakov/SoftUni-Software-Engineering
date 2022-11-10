package interfacesAndAbstraction.lab.ex05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];

            Identifiable identifiable;

            if (tokens.length == 3) {
                int ageCitizen = Integer.parseInt(tokens[1]);
                String idCitizen = tokens[2];

                identifiable = new Citizen(name, ageCitizen, idCitizen);

            } else {
                String idRobot = tokens[1];

                identifiable = new Robot(name, idRobot);
            }

            identifiables.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeIdPostfix = scanner.nextLine();

        identifiables.stream()
                .map(Identifiable::getId)
                .filter(id -> id.endsWith(fakeIdPostfix))
                .forEach(System.out::println);
    }
}
