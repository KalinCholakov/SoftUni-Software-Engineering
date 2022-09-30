package setsAndMapsAdvanced.exercises;

import java.util.*;

public class Ex07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, HashSet<String>> valueOfPlayers = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {

            String[] tokens = input.split(": ");
            String name = tokens[0];

            if (!valueOfPlayers.containsKey(name)) {
                valueOfPlayers.put(name, new HashSet<>());
            }

            String[] cards = tokens[1].split(", ");
            Collections.addAll(valueOfPlayers.get(name), cards);
            input = scanner.nextLine();
        }

        for (var player : valueOfPlayers.entrySet()) {
            String name = player.getKey();
            int values = calculateValues(player.getValue());
            System.out.printf("%s: %d%n", name, values);
        }
    }

    private static int calculateValues(HashSet<String> cards) {
        int values = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String type = card.substring(card.length() - 1);
            int cardPoints = powerOfCards(power) * powerOfType(type);
            values += cardPoints;
        }
        return values;
    }

    private static int powerOfType(String type) {
        switch (type) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
        }
        return 0;
    }

    private static int powerOfCards(String power) {
        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
        }
        return 0;
    }
}
