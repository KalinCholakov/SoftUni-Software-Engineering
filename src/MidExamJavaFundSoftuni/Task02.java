package MidExamJavaFundSoftuni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int countBlack = 0;
        int countLost = 0;

        while (!command.equals("Report")) {
            String[] parts = command.split(" ");

            switch (parts[0]) {
                case "Blacklist":
                    String blackListName = parts[1];
                    if (names.contains(blackListName)) {
                        System.out.printf("%s was blacklisted.%n", blackListName);
                        countBlack++;
                        for (int i = 0; i < names.size(); i++) {
                            if (names.get(i).equals(blackListName)) {
                                names.set(i, "Blacklisted");
                            }
                        }
                    } else {
                        System.out.printf("%s was not found.%n", blackListName);
                    }
                    break;
                case "Error":
                    int indexLost = Integer.parseInt(parts[1]);
                    if (indexLost >= 0 && indexLost < names.size() && !names.get(indexLost).equals("Blacklisted")
                            && !names.get(indexLost).equals("Lost")) {
                        String lostName = names.get(indexLost);
                        names.set(indexLost, "Lost");
                        System.out.printf("%s was lost due to an error.%n", lostName);
                        countLost++;
                    }
                    break;
                case "Change":
                    int indexError = Integer.parseInt(parts[1]);
                    String newName = parts[2];
                    if (indexError >= 0 && indexError < names.size()) {
                        String changedName = names.get(indexError);
                        names.set(indexError, newName);
                        System.out.printf("%s changed his username to %s.%n", changedName, newName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n", countBlack);
        System.out.printf("Lost names: %d%n", countLost);

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
